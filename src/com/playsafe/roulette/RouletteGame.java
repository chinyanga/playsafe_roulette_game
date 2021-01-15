package com.playsafe.roulette;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.playsafe.roulette.models.Player;

public class RouletteGame {
	
	static int programBetNumber = 0;
	static List<Player> playerList = new ArrayList<>();
	static List<Player> currentGamePlayers = new ArrayList<>();
	static boolean isGameOn = true;
	static boolean playerExist = false;
	static int controlCounter = 0;
	
	public static void main(String[] args) {
		
		readPlayersFromFile();
		programIntro();

	}
	
	public static void programIntro() {
		System.out.println("=====================================================================");
		System.out.println("\t\tRoulette Game Started ,the sessions will end in 30 seconds");
		System.out.println("=====================================================================");
		System.out.println("==================Valid formaties are============================");
		System.out.println("\t\t\tJack EVEN 9.0\n \t\t\tJack ODD 9.0\n \t\t\tJack 2 9.0");
		System.out.println("==================================================================");
	}
	
	public static void readPlayersFromFile() {
		try {
			BufferedReader in = new BufferedReader(new FileReader("src/input.txt"));
			String playerDetail = in.readLine();
			while (playerDetail != null) {
				System.out.println(playerDetail);
				if (playerDetail.split(" ").length == 3) {
					playerList.add(new Player(playerDetail.split(" ")[0], playerDetail.split(" ")[1],
							Double.valueOf(playerDetail.split(" ")[2]), "", 0.0));
				} else
					playerList.add(new Player(playerDetail, 0, 0.0, "", 0.0));
				playerDetail = in.readLine();
			}
			System.out.println("=============\tThere are:\t" + playerList.size() + "\tplayers\t==========");
			in.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void generateRandomNum() {
		Random randomBetNum = new Random();
		int betNum = randomBetNum.nextInt(36);
		programBetNumber = betNum;
	}
	
	public static void printOutput() {
		System.out.println("Number: \t" + programBetNumber);
		System.out.println("Player: \t\t\t Bet \t\t\tOutcome\t\t\tWinnings");
		for (Player p : currentGamePlayers) {
			System.out.println(p.getName() + "\t\t\t\t" + p.getBetType() + "\t\t\t" + p.getGameStatus().toUpperCase()
					+ "\t\t\t" + p.getWinnings());
		}
	}

	public static void gameController() {
		if (controlCounter == 0) {
			controlCounter = 1;
		} else {
			if (controlCounter == 1) {
				System.out.println("\n------------------------------------------------------------------------");
				System.out.println("Game session Ended here are the results. Restart to play the next round");
				printOutput();
				playerList = new ArrayList<>();
				currentGamePlayers = new ArrayList<>();
				controlCounter++;
				isGameOn = false;
			}

		}

	}


}
