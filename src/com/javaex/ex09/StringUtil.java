package com.javaex.ex09;

public class StringUtil { // 다음에
    
    public static String concatString(String[] arr){
    	String answer = "";
    	
    	for (int i = 0; i < arr.length; i++) {
    		answer += arr[i];
    	}
    	return answer;
    }

}
