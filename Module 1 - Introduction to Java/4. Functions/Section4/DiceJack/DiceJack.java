import java.util.Scanner;

public class DiceJack {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int roll1 = rollDice();
    int roll2 = rollDice();
    int roll3 = rollDice();

    System.out.println("Enter 3 numbers between 1 and 6");

    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();

    if(num1 < 1 || num2 < 1 || num3 < 1){
      System.out.println("Numbers cannot be less than 1. Shutting game down");
      System.exit(0);
    }

    if(num1 > 6 || num2 > 6 || num3 > 6){
      System.out.println("Numbers cannot be hire than 6. Shutting the game down");
      System.exit(0);
    }

//    System.out.println(roll1 + "\n" + roll2 + "\n" + roll3);
    int rolls = roll1 + roll2 + roll3;
    int nums = num1 + num2 + num3;

    System.out.println("Dice sum = " + rolls + ". Number sum = " + nums);
    if(didUserWin(rolls, nums)){
      System.out.println("Congrats, youwin!");
    }else{
      System.out.println("Sorry, you lose.");
    }

    scan.close();
  }

  public static int rollDice(){
    double rndmNum = Math.random() * 6;
    rndmNum +=1;
    return (int)rndmNum;
  }

  public static boolean didUserWin(int rolls, int nums) {
    return (rolls < nums && nums - rolls < 3);
  }
}