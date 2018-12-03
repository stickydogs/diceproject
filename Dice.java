import java.util.Scanner;
import java.util.Random;



public class Dice {


    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);
        int y=1;




        while(y==1){

            System.out.print("Do you still want to play? 1 for continue and 0 for not");


            defDice();

            printDice();

            rollDice();

            drawline();

            y = console.nextInt();

        }




    }

    public static int defDice() {

        int DICENUM=1;

        String dice[][]=new String[6][5];
        String gameDice[][]=new String[DICENUM][];


        for(gameDice[1][]){
            System.out.println(" " + "-------" + " ");
        }
        

        System.out.println("I'm in defDice()");


    }

    public static int rollDice(){
        System.out.println("I'm in rollDice()");

    }


    public static int drawline(){

        System.out.println("I'm in drawline()");

  }
    public static int printDice(){

        System.out.println("I'm in printDice()");
    }
}