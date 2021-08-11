package com.keytech;

import java.util.Random;

class Movie {

	private String name;

	public Movie(String name) {
		this.name = name;
	}

	public String plot() {
		return "No plot here!";
	}

	public String getName() {
		return name;
	}

}

class Friends extends Movie {

	public Friends() {
		super("Friends");
	}

	public String plot() {
		return "How are you doing...";
	}

}

class BlackList extends Movie {

	public BlackList() {
		super("Reddington");
	}

	@Override
	public String plot() {
		return "Where is my money?!!";
	}
}

class Vikings extends Movie {

	public Vikings() {
		super("Vikings");
	}

	@Override
	public String plot() {
		return "Lets sail to the East";
	}

}

class PrisonBreak extends Movie {

	public PrisonBreak() {
		super("PrisonBreak");
	}

	@Override
	public String plot() {
		return "This is where we part";
	}
}

class GOT extends Movie {

	public GOT() {
		super("G.O.T.");
	}

	@Override
	public String plot() {
		return "Things we do for love";
	}

}

class ForgetableMovie extends Movie {

	public ForgetableMovie() {
		super("ForgetableMovie");
	}

}

public class Main {

	public static void main(String[] args) {

		for(int i = 1; i<11; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie #"+i+""
					+ " : "+movie.getName() + "\n" + 
					"plot: "+ movie.plot()+" \n");
		}
		
	}

	public static Movie randomMovie() {
		int randomNumber = (int) (Math.random()*6) +1;
		System.out.println("Random number generated was "+randomNumber);
		
		switch(randomNumber) {
		    case 1:
			return new Friends();
			case 2:
				return new BlackList();
			case 3:
				return new Vikings();
			case 4:
				return new PrisonBreak();
			case 5:
				return new GOT();
			case 6:
				return new ForgetableMovie();
		}
		
		return null;
	}

}
