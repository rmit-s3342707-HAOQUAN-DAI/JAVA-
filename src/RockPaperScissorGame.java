import java.io.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/*
 * @HAOQUAN DAI
 * @March.2018
 * Basic programming practice
 * 
 */
public class RockPaperScissorGame {
	static int computerIndex = 0; //get computer input number 1,2,3
	static int playerIndex= 0; // get player input number 1,2,3
	static String computer; //transfer from index to item: 3 = rock 2 = scissor 1 = paper
	static String player;
	static String gameResult;
	static int computerWinRound = 0;
	static int playerWinRound = 0;
	static int evenGameRound = 0;
	static int totalGameRound = 0;
	private static Timestamp timestamp;//timestamp to get the current system date
	static int gameID = 0;
	static ArrayList<String> playerRecord = new ArrayList<String>();
	static ArrayList<String> computerRecord = new ArrayList<String>();
	static ArrayList<String> gameOutCome = new ArrayList<>();
	
//	public static void main(String[] args) throws Exception
//	{
//		
//		iniGame();	
//	}
	
	//save result to "Record.txt"
	public static void saveResult() throws IOException 
	{
		File file = new File("Records.txt");
		BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
		if (!file.exists()) 
		{
            file.createNewFile();
        }// if the fire not exists,create new one
		timestamp = new Timestamp(System.currentTimeMillis()); // get system time
		//gameID = getRandomNumber(10000,99999);
		out.write("---------New Game---------" + "\r\n");
		out.write(timestamp + "\r\n");
		out.write("Game 0"+ totalGameRound + "," + printComputer(computer) +","+ printPlayer(player) +","+ printOutCome(gameResult) + "\r\n");
		out.write("--------------------------" + "\r\n");
		out.flush();

	}
	

	public static void iniGame() throws Exception 
	{	
//		String mainMenu = ("===============================================\n" 
//				+"Welcome!\n"
//				+"Please select to start\n"
//				+"1: Start Game\n"
//				+"2: Exit");
//
//		System.out.println(mainMenu);

		startGame();
		
	}
	
	
	public static void startGame() throws Exception {
	
			System.out.println("===============================================");
			System.out.println("Welcome!Please select to start");
			System.out.println("1: Start game");
			System.out.println("2: Show records");
			System.out.println("0: Exit");
			Scanner s = new Scanner(System.in); 
			int person = s.nextInt();
			
			if(person == 1) 
			{
				gameMenu();
			}
			if(person == 2) 
			{
				try 
				{
					gameRecord();
				}
				catch(Exception e) 
				{
					System.out.println("Read error");
					startGame();
				}
				
			}
			if(person == 0) 
			{
				System.out.println("Good bye~");
				System.exit(0);
			}
			if(person != 1 && person != 2 && person !=0)
			{
				System.out.println("Wrong pick, please select 1, 2 or 3");
				startGame();
			}
			
	}
	
	
	public static void gameMenu() throws Exception 
	{
		do
		{			
			totalGameRound ++;
			System.out.println("=====================================");
			System.out.println("This is round number:" + " " + totalGameRound);
			System.out.println("Please pick to start:");
			System.out.println("1 for Paper");
			System.out.println("2 for Scissor");
			System.out.println("3 for Rock");
			System.out.println("0 to return last menu");
			System.out.println();
			System.out.println("Please enter:");
			System.out.println("..........................");
	
			Scanner s = new Scanner(System.in);
			playerIndex = s.nextInt();
			
			//System.out.print(computerIndex=getRandomNumber(1,3));
			
			if(playerIndex==1 || playerIndex==2 || playerIndex==3) 
			{
				System.out.println("You have select:" + " " + printPlayer(player));
				System.out.println();
				System.out.println("Computer turn!");
				System.out.println("..........................");	
				
				computerIndex = getRandomNumber(1,3);
				computerRecord.add(printComputer(computer));
				playerRecord.add(printPlayer(player));
				gameOutCome.add(printOutCome(gameResult));

				try 
				{
					compare();		
					System.out.println();
				} 
				catch(Exception e) 
				{
					System.out.println("error!");
					System.out.println("Restaring Game...");
					startGame();
				}
				finally 
				{
					System.out.println("Round end...");
					System.out.println();
					saveResult();
				}
				
			}
			else if(playerIndex==0)
			{
				totalGameRound--;
				startGame();
			}
			else
			{
				System.out.println("Wrong pick, please select again!");
				gameMenu();
			}	
			System.out.println();

		}while(playerIndex !=1 || playerIndex !=2 || playerIndex !=3);
		
	}
	
	//to show all game result
	public static void gameRecord() throws Exception 
	{
		System.out.println("Player has won" + " " + playerWinRound + " " + "rounds");
		System.out.println("Computer has won" + " " + computerWinRound + " " + "rounds");
		System.out.println("Even game"+ " " + evenGameRound + " " + "rounds");
		System.out.println("Total round played:"+ " " + totalGameRound + " " + "rounds");
		System.out.println();
		System.out.printf("%10s%10s%10s%10s%n","Round","Computer:","Player:","Winer:");
		System.out.println("------------------------------------------------");
		for(int i = 0;i<computerRecord.size();i++) 
		{
			System.out.printf("%10s%10s%10s%10s%n",i+1,computerRecord.get(i),playerRecord.get(i),gameOutCome.get(i));
		}
		System.out.println();
		startGame();
	}
	
	
//	public int getComputerSelection() 
//	{
//		return getRandomNumber(1,3);
//	}
	
	public static int getRandomNumber(int min,int max) 
	{
		Random r = new Random();
		return r.nextInt(max- min + 1) + min;
	}
	
	
	//compare to get winer
	public static void compare() 
	{
		if((computerIndex == 3 && playerIndex == 2) 
				|| (computerIndex == 2 && playerIndex == 1) 
				|| (computerIndex ==1 && playerIndex == 3)) 
		{
			computerWin();
			computerWinRound++;
		}
		else if((playerIndex == 3 && computerIndex ==2) 
				|| (playerIndex == 2 && computerIndex == 1)
				|| (playerIndex == 1 && computerIndex ==3)) 
		{
			playerWin();
			playerWinRound++;
		}
		else
		{
			even();
			evenGameRound++;
		}		
	}
	

	private static void computerWin() 
	{
			System.out.println("Player select :" + printPlayer(player));
			System.out.println("Computer select :" + printComputer(computer));
			System.out.println("Computer wins!");
			
	}
	
	private static void playerWin() 
	{
			System.out.println("Player select :" + printPlayer(player));
			System.out.println("Computer select :" + printComputer(computer));
			System.out.println("Player wins!");

	}
	
	private static void even() 
	{
			System.out.println("Player select :" + printPlayer(player));
			System.out.println("Computer select :" + printComputer(computer));
			System.out.println("Even game!");

	}
	
	
	public static String printComputer(String printcomputer) 
	{
		if(computerIndex==3)
		{
			return printcomputer = "Rock";
		}
		else if(computerIndex==2)
		{
			return printcomputer = "Scissor";
		}		
		else
		{
			return printcomputer = "Paper";
		}
	}
	
	public static String printPlayer(String printplayer) 
	{
		
		if(playerIndex==3)
		{
			return printplayer = "Rock";
		}
		else if(playerIndex==2)
		{
			return printplayer = "Scissor";
		}		
		else
		{
			return printplayer = "Paper";
		}
	}
	
	public static String printOutCome(String gameOutCome) 
	{
		
		if((computerIndex == 3 && playerIndex == 2) 
			|| (computerIndex == 2 && playerIndex == 1) 
			|| (computerIndex ==1 && playerIndex == 3))  
		{
			return gameOutCome = "Computer";
		}
		else if((playerIndex == 3 && computerIndex ==2) 
				|| (playerIndex == 2 && computerIndex == 1)
				|| (playerIndex == 1 && computerIndex ==3))  
		{
			return gameOutCome = "Player";
		}
		else 
		{
			return gameOutCome = "None";
		}
	}
}
