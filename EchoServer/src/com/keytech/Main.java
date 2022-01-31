package com.keytech;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) {
		// Port number can be between 0 and 65535 inclusive
		try (ServerSocket serverSocket = new ServerSocket(4000);) {
			Socket socket = serverSocket.accept();
			System.out.println("client connected");
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter outPut = new PrintWriter(socket.getOutputStream(), true);

			while(true) {
				String echoString = input.readLine();
				if (echoString.equals("exit")) {
					break;
				}
				
				outPut.println("Echo from server: "+echoString);
			}
			
		} catch (Exception e) {
			System.out.println("Server exception "+e.getMessage());
		}
	}

}
