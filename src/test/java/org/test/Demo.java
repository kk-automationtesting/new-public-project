package org.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Demo {
public static void xyz(String[] args) {
	System.out.println(getTest());
	Map<String, String> contactData = new HashMap<String, String>();
	ArrayList<String> al = new ArrayList<>();
	System.out.println("contactData is empty : " +  contactData.isEmpty() +" Contact data null : ");//+ al == null );//+"\n"+ contactData);
	
	System.out.println("is null or empty : "+ isNullOrEmpty(al));
	String xpath ="//div[text()='test']";
	String script  = "var vendor = document.evaluate(\""+ xpath+"\", document, null, XPathResult.STRING_TYPE, null); return vendor.stringValue;";
	System.out.println(script);
}

private static String getTest() {
	String x = "out";
	try {
		 x= "in try";
		
		
	} catch(Exception e){
		
	} finally {
		
		
	}
	return x;
	
}



public static String isNullOrEmpty( final Collection< ? > c ) {
    
	Boolean a = c==null;
	return "wdc : " ;
}
}
