import java.util.Scanner;

public class SecretNumber
	{
		static int guess;
		static int counter = 0;
		static int secretNumber = 0;
		static int difChoice;
		static boolean stillguessing =true;
		static Scanner userInput = new Scanner(System.in);
		
		public static void main(String[] args)
			{				
				setDifficulty();
				dif1Guess();
				dif2Guess();
				dif3Guess();
				dif4Guess();
				playGame();
			}
		
		public static void setDifficulty()
			{			
				System.out.println("What do you want the difficulty to be?");
				System.out.println("1: Easy \n2: Medium \n3: Hard \n4: Random");
				difChoice = userInput.nextInt();
			}
		
		public static void playGame()
			{
				do
					{
						guess = userInput.nextInt();
						
						if(guess > secretNumber)
							{
								System.out.println("That guess is too high");			
								counter++;
							}
						if(guess < secretNumber)
							{
								System.out.println("That guess is too low");
								counter++;
							}
						if(guess == secretNumber)
							{
								System.out.println("You guessed the number!");
								stillguessing = false;
								counter++;
								System.out.println("It took you " + counter + "   guesses!");
							}
					}
				while(stillguessing);
			}
		
		public static void dif1Guess()
			{
				if (difChoice == 1)
					{
						System.out.println("Guess a random number between 1 and 10");
						secretNumber = (int) (Math.random()*10+1);	
					}
			}
		
		public static void dif2Guess()
			{
				if(difChoice == 2)
					{
						System.out.println("Guess a random number between 1 and 15");
						secretNumber = (int) (Math.random()*16+1);	
					}	
			}
		
		public static void dif3Guess()
			{
				if(difChoice == 3)
					{
						System.out.println("Guess a random number between 1 and 25");
						secretNumber = (int) (Math.random()*26+1);	
					}
			}
		
		public static void dif4Guess()
			{
				if(difChoice == 4)
					{
						int random = (int) (Math.random()*101+1);	
						System.out.println("Guess a random number between 1 and " + random);
						secretNumber = (int) (Math.random()*random+1);	
					}
			}	
	}