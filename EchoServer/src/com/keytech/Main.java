package com.keytech;

import java.net.ServerSocket;

public class Main {

	public static void main(String[] args) {
		// Port number can be between 0 and 65535 inclusive
		try (ServerSocket serverSocket = new ServerSocket(4000);) {
			
			while (true) {
				new Echoer(serverSocket.accept()).start();
				
//				Socket socket = new ServerSocket().accept();
//				Echoer echoer = new Echoer(socket);
//				echoer.start();
				
			}

		} catch (Exception e) {
			System.out.println("Server exception " + e.getMessage());
		}
	}

	// output after runnig client
	// client connected
}
