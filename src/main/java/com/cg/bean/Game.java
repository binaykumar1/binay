package com.cg.bean;

public class Game {

	

	private String gameName;
	private byte noOfPlayers;
	
	public Game() {
		super();
		
	}
	
	public Game(String gameName, byte noOfPlayers) {
		super();
		this.gameName = gameName;
		this.noOfPlayers = noOfPlayers;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public byte getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(byte noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

}
