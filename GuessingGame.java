import java.util.Scanner;




class Guesser{
    int guessNum;
    int guessingNumFromGuesser(){
        Scanner sc = new Scanner(System.in);
            System.out.print("Guesser please guess number:- ");

            guessNum=sc.nextInt();
        
        return guessNum;

    }
}

class Player{
    int guessNum;
    int guessingNumFromPlayer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Player guess number:- ");

        guessNum=sc.nextInt();
        return guessNum;

    }
}

class Umpire{
    int guessNumFromGuesser;
    int guessNumFromPlayer1;
    int guessNumFromPlayer2;

    void guessingNumFromGuesser(){
        Guesser guess = new Guesser();
        guessNumFromGuesser=guess.guessingNumFromGuesser();

    }

    
    void guessingNumFromPlayer1(){
        Player guess = new Player();
        guessNumFromPlayer1=guess.guessingNumFromPlayer();
    }

    
    void guessingNumFromPlayer2(){
        Player guess = new Player();
        guessNumFromPlayer2=guess.guessingNumFromPlayer();
    }

    void descision()
    {
        if(guessNumFromGuesser==guessNumFromPlayer1)
        {
            if(guessNumFromPlayer1==guessNumFromGuesser && guessNumFromGuesser==guessNumFromPlayer2)
            {
                System.out.println("This match is tie !");
            }

            else
            {
                System.out.println("Player1 Wins the match ");
            }
        }

        else if(guessNumFromGuesser==guessNumFromPlayer2)
        {
            System.out.println("Player2 wins the match");
        }
        

        else{
            System.out.println("try again!All of you ");
    }
        
    
    }
    
      
}





public class GuessingGame{
    public static void main(String[] args) {
    for(int i=0;i<=3;i++)
    {
    Umpire num1 = new Umpire();
    num1.guessingNumFromGuesser();
    num1.guessingNumFromPlayer1();
    num1.guessingNumFromPlayer2();
    num1.descision();
    }
    }
}
