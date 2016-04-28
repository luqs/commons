package com.cuize.commons.utils;
import java.util.Random;

public class RandomUtil {
//	public static final String NUMBERCHAR = "0123456789";
	public static String generateString(int length){
		StringBuffer sb = new StringBuffer();  
        Random random = new Random(); 
		for(int i=0;i<length;i++){
			int number=random.nextInt(10);
			sb.append(number);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
//		String qrcodeImgName = UUID.randomUUID().toString();
//		System.out.println(qrcodeImgName);
//		System.out.println();
//		 if(qrcodeImgName.contains("-")){
//			 qrcodeImgName=qrcodeImgName.replaceAll("-", "");
//		 }
//		 System.out.println(qrcodeImgName);
		
//		DateFormat format=new SimpleDateFormat("yyyyMMddHHmmssSSSS");
//		System.out.println(format.format(new Date()));
		
//		for(int i=0;i<10;i++){
//			String num=generateString(8);
//			System.out.println(num);
//			System.out.println("-----------------------------------");
//		}
	}
	
}
