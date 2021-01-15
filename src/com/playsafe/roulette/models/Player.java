package com.playsafe.roulette.models;

public class Player {
	
	private String name;
	private Object betType;
	private double betCost;
	private String gameStatus;
	private double winnings;
	public Player(String name, Object betType, double betCost, String gameStatus, double winnings) {
		this.name = name;
		this.betType = betType;
		this.betCost = betCost;
		this.gameStatus = gameStatus;
		this.winnings = winnings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getBetType() {
		return betType;
	}
	public void setBetType(Object betType) {
		this.betType = betType;
	}
	public double getBetCost() {
		return betCost;
	}
	public void setBetCost(double betCost) {
		this.betCost = betCost;
	}
	public String getGameStatus() {
		return gameStatus;
	}
	public void setGameStatus(String gameStatus) {
		this.gameStatus = gameStatus;
	}
	public double getWinnings() {
		return winnings;
	}
	public void setWinnings(double winnings) {
		this.winnings = winnings;
	}

}
