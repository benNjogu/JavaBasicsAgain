package com.keytech.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Main {

	public static void main(String[] args) {
		
		try {
			InetAddress address = InetAddress.getLocalHost();//getBN
			DatagramSocket socket = new DatagramSocket();
			
			Scanner scanner = new Scanner(System.in);
			String echoString;
			
			do {
				System.out.println("Enter string to be echoed: ");
				echoString = scanner.nextLine();
				
				byte[] buffer = echoString.getBytes();
				DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 5000);
				socket.send(packet);
				
				//response not needed in real world application
				byte[] buffer2 = new byte[50];
				packet = new DatagramPacket(buffer2, buffer2.length);
				socket.receive(packet);
				System.out.println("Text received is: " + new String(buffer2,0,packet.getLength()));
				
			} while (!echoString.equals("exit"));
			
		} catch (SocketTimeoutException e) {
			System.out.println("Socket timed out: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
	}
}