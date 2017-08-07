package com.ssh.util;

import java.util.List;

import com.ssh.entity.Resources;

public class BinarySearchUtil {
	
	public static void listt(String[] str,List<Resources> listrs,long[] ids){
		for(int i = 0;i<str.length;i++){
			String s = str[i];
			int ss = Integer.valueOf(s);
			BinarySearchUtil.binarySearch(ids, ss);
			//BinarySearchUtil.list(str, listrs);
		}
	}
	
	public static int binarySearch(long[] res,int s){
		int low = 0;
		int height = res.length-1;
		int middle ;
		
		while(low<=height){
			middle = low+(height-low)/2;
			if(s==res[middle]){
				return middle;
			}else if(s>res[middle]){
				low = middle+1;
			}else{
				height = middle-1;
			}
		}
		
		
		return -1;
		
	}
	
	public static int list(String[] str,List<Resources> listrs){
		for(int i = 0;i<str.length;i++){
			String s = str[i];
			int ss = Integer.valueOf(s);
				for(int j = 0;j<listrs.size();j++){
					Resources resources = listrs.get(j);
					Long id =resources.getRid();
					if(ss==id){
						;
					}
				}	
			}
		return -1;
		
	}

}
