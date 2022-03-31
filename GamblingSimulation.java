package GamblingSimulation;

import java.util.Random;
import java.util.Scanner;

public class GamblingSimulation {

	static final int Stack = 100;
	static final int EveryDayBet = 1;
	static final int Win = 1;
	static final float StakeValue = 0.5f;
	public static void main(String[] args) {
		
		System.out.println("Welcome To Gambling Simulation");
		System.out.println("Gambling Starts With $100");
		System.out.println("Bet Per Share Is $1");
	}
	
	public void Winloss() {
		Random random = new Random();
		int value = random.nextInt(2);
		if (value == 1) {
			System.out.println("Won");
		
		}
		else {
			System.out.println("lose");
		}	
	}
		
	public int resignStake(int day) {
		
		lose = (int) Math.round(Stake * StakeValue);
	    win = (int) Math.round(Stake + (Stake * StakeValue));
        boolean stop = true;
        stake = Stake;
        while (stop == true) {
        	Winloss();
        	if (stake == lose) {
        		daysLoss.put(day,stake);
        		stop = false;
        	
        	}
        	if (stake == win) {
        		dayswon.put(day,stake);
        		stop = false;
        }
        
	
	}

	return Stake
	
		if (Math.random() <0.5) {
		
        System.out.println("Wins");
		}
		else
		{
	    System.out.println("Lose");
		}
	}
}
	


