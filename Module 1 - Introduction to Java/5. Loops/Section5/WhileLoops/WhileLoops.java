public class WhileLoops {
  public static void main(String[] args){
    int number = 25;
    while(number <= 30){
      System.out.println(number);
      number++;
    }
    double choice = 0.01;
    double guess = 0.99;
    while(guess > choice){
      guess = Math.random();
      System.out.println(guess);
    }

  }
}