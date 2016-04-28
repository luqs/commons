package com.cuize.commons.utils;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebServiceUtils {
	public final static String METHOD_GET="GET";
	public final static String METHOD_PUT="PUT";
	public final static String METHOD_DELETE="DELETE";
	public final static String METHOD_POST="POST";
	
	/**
	   * 通用服务
	   * @param serviceUrl 接口地址
	   * @param parameter 接口参数
	   * @param restMethod 请求方式
	   * @return
	   */
	public static String getResultJson(String serviceUrl, String parameter,String restMethod){
		  try{
			  URL url=new URL(serviceUrl);
			  HttpURLConnection con=(HttpURLConnection)url.openConnection();
			  con.setRequestMethod(restMethod);
			  con.setRequestProperty("Content-type", "application/json");
			  if("POST".equals(restMethod)){
				  con.setDoOutput(true);
				  OutputStream os=con.getOutputStream();
				  os.write(parameter.getBytes("utf-8"));
				  os.close();
			  }
			  InputStream in=con.getInputStream();
			  StringBuffer buffer=new StringBuffer();
			  byte[] b=new byte[1024];
			  int result=in.read(b);
			  while(result!=-1){
				  buffer.append(new String(b,0,result,"utf-8"));
				  result=in.read(b);
			  }
			  if(con.getResponseCode()!=200){
				  return null;
			  }
			  return buffer.toString();
		  }catch(Exception ex){
			  ex.printStackTrace();
		  }
		  return null;
	  }
}
