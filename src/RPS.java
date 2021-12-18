import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String [] rps= {"ROCK","PAPER","SCISSOR"};
		System.out.println("Enter 0 to stop the game and get results.");
		System.out.println("Enter your choice:\n1. ROCK\n2. PAPER\n3. SCISSORS");
		int pcount=0,ccount=0;
		while(true) {
			int plmove=sc.nextInt();
			if(plmove==1||plmove==2||plmove==3||plmove==0) {
				int rd = (int)(Math.random()*100)%3;
//				System.out.println("Player: "+plmove+"\nComputer: "+rd);
				if(plmove==1) {
					System.out.println("You choiced ROCK");
					System.out.println("Opponent choiced "+rps[rd]);
					if(rd==1) {
						System.out.println("OPPONENT wins.");
						ccount++;
					}
					else if(rd==2) {
						System.out.println("YOU win.");
						pcount++;
					}
					else {
						System.out.println("Draw");
					}
				}
				if(plmove==2) {
					System.out.println("You choiced PAPER");
					System.out.println("Opponent choiced "+rps[rd]);
					if(rd==2) {
						System.out.println("OPPONENT wins.");
						ccount++;
					}
					else if(rd==0) {
						System.out.println("YOU win.");
						pcount++;
					}
					else {
						System.out.println("Draw");
					}
				}
				else if(plmove==3) {
					System.out.println("You choiced SCISSOR");
					System.out.println("Opponent choiced "+rps[rd]);
					if(rd==0) {
						System.out.println("OPPONENT wins.");
						ccount++;
					}
					else if(rd==1) {
						System.out.println("YOU win.");
						pcount++;
					}
					else {
						System.out.println("Draw");
					}
				}
				else if(plmove==0) {
					System.out.println("Player Points: "+pcount);
					System.out.println("Opponent Points: "+ccount);
					sc.close();
					break;
				}
			}
			else {
				System.out.println(">>>>>>>>>>Please enter correctly.<<<<<<<<<<");
			}
		}
	}

}
