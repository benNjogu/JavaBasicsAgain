package com.keytech;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://example.org");
			URI uri = url.toURI();
			
			System.out.println("Scheme = " + uri.getScheme());
			System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
			System.out.println("Authority = " + uri.getAuthority());
			System.out.println("User info = " + uri.getUserInfo());
			System.out.println("Host = " + uri.getHost());
			System.out.println("Port = " + uri.getPort());
			System.out.println("Path = " + uri.getPath());
			System.out.println("Query = " + uri.getQuery());
			System.out.println("Fragment = " + uri.getFragment());
			
			/**
			 * Scheme = http
				Scheme-specific part = //example.org
				Authority = example.org
				User info = null
				Host = example.org
				Port = -1
				Path = 
				Query = null
				Fragment = null
			 * */
				
		} catch (URISyntaxException e) {
			System.out.println("Uri bad syntax: " + e.getMessage());
		}catch (MalformedURLException e) {
			System.out.println("Malformed url " + e.getMessage());
		}
	}
	
}
