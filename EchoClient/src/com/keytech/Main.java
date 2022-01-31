package com.keytech;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Address of the host(127.0.0.1) and port number
		try (Socket socket = new Socket("127.0.0.1", 4000)) {
			BufferedReader echoes = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);
			Scanner scanner = new Scanner(System.in);
			String echoString;
			String response;

			do {
				System.out.println("Enter string to be echoed");
				echoString = scanner.nextLine();
				stringToEcho.println(echoString);
				if (!echoString.equals("exit")) {
					response = echoes.readLine();
					System.out.println(response);
				}
			} while (!echoString.equals("exit"));

		} catch (Exception e) {
			System.out.println("Client error: " + e.getMessage());
		}
	}

	// output after running client
	// Enter string to be echoed
	// My name is Bernad
	// Echo from server: My name is Bernad
	// Enter string to be echoed
}
