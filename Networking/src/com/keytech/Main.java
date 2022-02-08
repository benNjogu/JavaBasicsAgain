package com.keytech;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;


public class Main {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://example.org/somepage.html");//Response code = 404. Error reading webpage
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.addRequestProperty("User-Agent", "Chrome");
			connection.setReadTimeout(30000);
			
			int responseCode = connection.getResponseCode();
			System.out.println("Response code = " + responseCode);
			if (responseCode != 200) {
				System.out.println("Error reading webpage");
				System.out.println(connection.getResponseMessage());//Not Found
				return;
			}
			
			BufferedReader inputReader = new BufferedReader
					(new InputStreamReader(connection.getInputStream()));
			
			String line;
			while ((line = inputReader.readLine()) != null) {
				System.out.println(line);
			}

			inputReader.close();

			
//			urlConnection.setDoOutput(true);
//			urlConnection.connect();
//			

//			Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
//			for(Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
//				String key = entry.getKey();
//				List<String> value = entry.getValue();
//				System.out.println("-------key = " + key);
//				for(String string : value) {
//					System.out.println("value = " + string);
//				}
//			}
//			
			

		} catch (IOException e) {
			System.out.println("IOException " + e.getMessage());
		}
	}

}
