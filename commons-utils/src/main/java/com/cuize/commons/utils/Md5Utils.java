package com.cuize.commons.utils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.security.MessageDigest;

import org.apache.commons.io.IOUtils;

/**
 * MD5工具类
 * @author zhg8260
 *
 */
public class Md5Utils {

	/**
	 * 获取文件的MD5摘要
	 * @param sourceFile
	 * @param md5Key
	 * @return
	 * @throws Exception
	 */
	public static final String getFileMD5String(File sourceFile, String md5Key) throws Exception{
		  FileInputStream in = null;
		  BufferedReader bufread = null;
	      try {
	    	  MessageDigest messageDigest = MessageDigest.getInstance("MD5");
	    	  in = new FileInputStream(sourceFile);
	 		  bufread = new BufferedReader(new InputStreamReader(in, "GBK"));
    		  byte[] csvFileNameBytes  = IOUtils.toByteArray(bufread, "GBK");
	          messageDigest.update(md5Key.getBytes("GBK"));
	          messageDigest.update(csvFileNameBytes);
	         return StringUtil.bytesToHexString(messageDigest.digest());
	      } catch (Exception e) {
	         throw e;
	      } finally {
	    	  try{
        		if(bufread != null){
        			bufread.close();
        		}
        		if(in != null){
        			in.close();
        		}    		
	        	}catch(Exception e){
	        		throw e;
	        	}
	      }
	}
	
	/**
	 * 验证MD5摘要
	 * @param sourceFile
	 * @param digestFile
	 * @param md5Key
	 * @return
	 */
	public static final boolean validateDigest(File sourceFile, File digestFile, String md5Key) throws Exception{
		 BufferedReader reader = null;
		try {
			 reader = new BufferedReader(new FileReader(digestFile));
	    	// 读取一行
            String str = null;
            StringBuffer strBuffer = new StringBuffer();
            while ((str = reader.readLine()) != null){
                strBuffer.append(str);
            } 
	        return Md5Utils.getFileMD5String(sourceFile, md5Key).equalsIgnoreCase(strBuffer.toString());
	      } catch (Exception e) {
	    	  throw e;
	      } finally {
	    	  try{
	    		  if(reader != null){
	    			  reader.close();
	    		  }    		
	          }catch(Exception e){
	        	  throw e;
	          }
	      }
	}
	
	/**
	 * 获取字符串的MD5密钥
	 * @param origin
	 * @param charsetname
	 * @return
	 */
	public static final String getStrMD5Encode(String origin, String charsetname) {
		String resultString = null;
		try {
			resultString = new String(origin);
			MessageDigest md = MessageDigest.getInstance("MD5");
			if (charsetname == null || "".equals(charsetname))
				resultString = byteArrayToHexString(md.digest(resultString
						.getBytes("utf-8")));
			else
				resultString = byteArrayToHexString(md.digest(resultString
						.getBytes(charsetname)));
		} catch (Exception exception) {
		}
		return resultString;
	}

	private static final String byteArrayToHexString(byte b[]) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++)
			resultSb.append(byteToHexString(b[i]));

		return resultSb.toString();
	}

	private static final String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n += 256;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}

	private static final String hexDigits[] = { "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
}
