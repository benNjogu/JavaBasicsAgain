package com.keytech;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.net.URL;
import java.net.URLConnection;

public class Main {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://example.org");
			URLConnection urlConnection = url.openConnection();
			urlConnection.setDoOutput(true);
			urlConnection.connect();
			
			BufferedReader inputStream = new BufferedReader
					(new InputStreamReader(urlConnection.getInputStream()));

			String line = "";
			while (line != null) {
				line = inputStream.readLine();
				System.out.println(line);
			}

			inputStream.close();

		} catch (IOException e) {
			System.out.println("IOException " + e.getMessage());
		}
	}

}
