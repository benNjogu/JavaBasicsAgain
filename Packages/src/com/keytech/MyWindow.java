package com.keytech;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

	public MyWindow(String title) {
		super(title);

		setSize(500, 140);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(0);
			}

		});

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
		Font sansSerifsmall = new Font("SansSerif", Font.BOLD, 12);
		
		g.setFont(sansSerifLarge);
		g.drawString("I Will Have To Be A Java Evangelist", 60, 60);
		g.setFont(sansSerifsmall);
		g.drawString("In Two Years", 60, 100);
		
		
	}

	
}
