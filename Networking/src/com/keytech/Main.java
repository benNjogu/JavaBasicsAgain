package com.keytech;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		try {
			URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phone?os=android#samsung");
			URL url = uri.toURL();
			System.out.println(url);
			
//			System.out.println("Scheme = " + uri.getScheme());
//			System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
//			System.out.println("Authority = " + uri.getAuthority());
//			System.out.println("User info = " + uri.getUserInfo());
//			System.out.println("Host = " + uri.getHost());
//			System.out.println("Port = " + uri.getPort());
//			System.out.println("Path = " + uri.getPath());
//			System.out.println("Query = " + uri.getQuery());
//			System.out.println("Fragment = " + uri.getFragment());
	
		} catch (URISyntaxException e) {
			System.out.println("Uri bad syntax: " + e.getMessage());
		}catch (MalformedURLException e) {
			System.out.println("Malformed url " + e.getMessage());
		}
	}
	
}
