package com.keytech;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		try {
//			URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phone?os=android#samsung");
			URI baseUri = new URI("http://username:password@mynewserver.com:5000");
			URI uri1 = new URI("/catalogue/phone?os=android#samsung");
			URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung");
			URI uri3 = new URI("/stores/locations/?zip=12345");
			
			URI resolvedUri1 = baseUri.resolve(uri1);
			URI resolvedUri2 = baseUri.resolve(uri2);
			URI resolvedUri3 = baseUri.resolve(uri3);
			
			URL url1 = resolvedUri1.toURL();
			System.out.println("url 1 = " + url1);
			//url 1 = http://username:password@mynewserver.com:5000/catalogue/phone?os=android#samsung
			URL url2 = resolvedUri2.toURL();
			System.out.println("url 2 = " + url2);
			//url 2 = http://username:password@mynewserver.com:5000/catalogue/tvs?manufacturer=samsung
			URL url3 = resolvedUri3.toURL();
			System.out.println("url 3 = " + url3);
			//url 3 = http://username:password@mynewserver.com:5000/stores/locations/?zip=12345
			
			URI relativizedUri = baseUri.relativize(resolvedUri2);
			System.out.println("Relative URI = " + relativizedUri);
			//Relative URI = catalogue/tvs?manufacturer=samsung
	
		} catch (URISyntaxException e) {
			System.out.println("Uri bad syntax: " + e.getMessage());
		}catch (MalformedURLException e) {
			System.out.println("Malformed url " + e.getMessage());
		}
	}
	
}
