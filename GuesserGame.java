import java.util.*;
class Guesser{
    int guessNum;
    int gussingNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gusser kindly guess the number ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}
class player{
    int guessNum ;
   int guessingNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("players kindly guess the number ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}
class umpire{
    int numFromguesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser(){

        Guesser g = new Guesser();
        numFromguesser = g.gussingNumber();
    }
   void collectNumFromPlayers(){

        player p1 = new player();
        player p2 = new player();
        player p3 = new player();

        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
   }
    void compare(){

        if(numFromguesser == numFromPlayer1){
            System.out.println("player 1 won the game");
        }else if(numFromguesser == numFromPlayer2){
            System.out.println("player 2 won the game");
        }else if(numFromguesser == numFromPlayer3){
            System.out.println("player 3 won the game");
        }else{
            System.out.println("sab ke sab galat han , dobara shru kro");
        }
   }
}
public class GuesserGame {
    public static void main(String[] args){

        System.out.println("game started ");

        umpire u = new umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}
