package com.ssh.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MD5Util {
	
	public static String string2MD5(String instr) {
		
		//确定计算方法
		MessageDigest md5=null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			 System.out.println(e.toString()); 
			e.printStackTrace();
		}
		char[] charArray = instr.toCharArray();
		byte[] byteArray = new byte[charArray.length];
		for(int i=0;i<charArray.length;i++)
			byteArray[i] = (byte) charArray[i];
			byte[] md5Bytes = md5.digest(byteArray);
			StringBuffer hexValue = new StringBuffer();
			for(int j = 0; j < md5Bytes.length; j++){
				int val =( md5Bytes[j]) & 0xff;
				if(val < 16)
					hexValue.append("0");
				hexValue.append(Integer.toHexString(val));
			}
		System.out.println(hexValue.toString());
		return hexValue.toString();
	}
	public static boolean checkPassword(String newPassword ,String oldPassword){
		if(string2MD5(newPassword).equals(oldPassword)){
			System.out.println("oldPassword:"+oldPassword);
			return true;
		}else{
			return false;
		}		
	}
}
