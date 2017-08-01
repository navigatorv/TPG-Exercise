package Solution;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Pattern;


public class IPValidationRegex {

	/**
	 * This method checks if each input address is an valid IPv4 address.
	 */
	static String checkIPs(String ip) {
    	String result;

    	String[] splitArr4 = ip.split("\\.");
    		
    	if (splitArr4.length == 4){
    		String regex = "^(((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))\\.){3}((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))$"; 
    		if (Pattern.matches(regex, ip)){
    			result = ip;
    		}else{
    			result = "invalid";
    		}
    	}else{
    		result = "invalid";
    	}
    	return result;
    }

	public static void main(String[] args) {
		try{
			String result;
			InputStream in = new FileInputStream(new File("IP_List.txt")); 
	        Scanner s = new Scanner(in); 
	        System.out.println("Valid IP address:");
	        while(s.hasNextLine()){ 
	            result = checkIPs(s.nextLine()); 
	            if (result != "invalid"){
	            	System.out.println(result);
	            }
	        } 
	        s.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
		  
}
