package com.challenge;

import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import javax.print.event.PrintJobAttributeListener;

public class Main {

	private static ArrayList<Album> albums = new ArrayList<Album>();

	public static void main(String[] args) {

		Album album = new Album("Megatron", "Nicki Minaj");
		album.addSong("megatron", 5.4);
		album.addSong("star ships", 3.4);
		album.addSong("high school", 4.4);
		album.addSong("chunli", 5.9);
		album.addSong("anaconda", 6.4);
		album.addSong("bed of lies", 5.4);
		album.addSong("knock out", 2.4);
		album.addSong("goodbye", 3.6);

		albums.add(album);

		album = new Album("Carter", "Lil Wayne");
		album.addSong("groly", 5.5);
		album.addSong("Drop the world", 3.5);
		album.addSong("corazon", 2.5);
		album.addSong("mirror", 4.45);
		album.addSong("my Nigga", 4.58);
		album.addSong("Lollipop", 4.45);
		album.addSong("bling bling", 3.48);

		albums.add(album);

		LinkedList<Song> playList = new LinkedList<Song>();
		albums.get(0).addToPlayList("bed of lies", playList);
		albums.get(0).addToPlayList("goodbye", playList);
		albums.get(0).addToPlayList("knock out", playList);
		albums.get(0).addToPlayList("bitches love me", playList);// not there
		albums.get(0).addToPlayList(4, playList);
		albums.get(1).addToPlayList(4, playList);
		albums.get(1).addToPlayList(3, playList);
		albums.get(1).addToPlayList(2, playList);
		albums.get(1).addToPlayList(56, playList);// there is no track 24

		play(playList);

	}

	private static void play(LinkedList<Song> playList) {

		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forwad = true;
		System.out.println("\n");
		printMenu();

		ListIterator<Song> listIterator = playList.listIterator();
		if (playList.size() == 0) {
			System.out.println("No songs in playlist");
			return;
		} else {
			System.out.println("Now playing " + listIterator.next().toString());
		}

		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
			case 0:
				System.out.println("Playlist complete");
				quit = true;
				break;
			case 1:
				if(!forwad) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
				}
				forwad = true;
				if(listIterator.hasNext()) {
					System.out.println("Now playing "+listIterator.next().toString());
				}else {
					System.out.println("We have reached the end of the playlist");
					forwad = false;
				}
				break;
			case 2:
				if(forwad) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
						
					}
				}
				forwad = false;
				if (listIterator.hasPrevious()) {
					System.out.println("Now playing "+listIterator.previous().toString());
				}else {
					System.out.println("We are at the start of the playlist");
					forwad = true;
				}
				break;
			case 3:
				if (forwad) {
					if (listIterator.hasPrevious()) {
						System.out.println("Now replaying "+listIterator.previous().toString());
						forwad = false;
					}else {
						System.out.println("We are at the start of the playlist");
					}
				}else {
					if (listIterator.hasNext()) {
						System.out.println("Now playing "+listIterator.next().toString());
						forwad = true;
					}else {
						System.out.println("We are at the end of the playlist");
					}
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if (playList.size()>0) {
					String current = listIterator.previous().toString();
					listIterator.remove();
					System.out.println("removed "+current);
					if(listIterator.hasNext()) {
						System.out.println("Now playing "+listIterator.next());
					}else if (listIterator.hasPrevious()) {
						System.out.println("Now playing "+listIterator.previous());
					}
				}
				break;
			default:
				break;
			}
		}

	}

	private static void printList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("==========================================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		
		System.out.println("===========================================");
	}

	private static void printMenu() {
		System.out.println("Available actions.\npress,");
		System.out.println("0-to quit\n"
				         + "1-to play the next song\n"
				         + "2-to play the previous song\n"
				         + "3-to replay the previous song\n"
				         + "4-to list songs in the playlist\n"
				         + "5-to print available actions\n"
				         + "6-to delete current song\n");
	}

}
