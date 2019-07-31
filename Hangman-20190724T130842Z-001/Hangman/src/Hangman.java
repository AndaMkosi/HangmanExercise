import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args){


        Scanner s = new Scanner(System.in);
        System.out.println("Player One, enter a word:");
        String word = s.next();
        int life = 8; // lives of player
        char[] filler = new char[word.length()];
        int i = 0;
        while (i< word.length()){
            filler[i] = '_';
            if (word.charAt(i) == ' '){
                filler[i] = ' ';
            }
            i ++;
        }


        System.out.println(filler);
        System.out.println("Player Two, you have " + life + " guesses left. Enter a guess:");
        ArrayList<Character> list = new ArrayList<Character>(); //

        while (life >0){
            char x = s.next().charAt(0);
            if(list.contains(x)){
                System.out.println("You have already guessed '"+x+ "'.");
                System.out.println(filler);
                System.out.println("Player Two, you have " + life + " guesses left. Enter a guess:");

                continue;
            }
            list.add(x);

            if (word.contains(x+ "")){
                for (int y =0; y<word.length(); y++){

                    if (word.charAt(y) == x ){
                        filler[y] = x;
                    }
                }
            }else{
                life --;
            }

            if(word.equals(String.valueOf(filler))){
                System.out.println(filler);
                System.out.println("Game over. Player Two wins!");
                break;
            }
            else if (life  == 0 ){


                System.out.println("Game over. Player One wins! The word was: "+ word);
                break;
            }
            System.out.println(filler);
            System.out.println("Player Two, you have " + life + " guesses left. Enter a guess:");


        }

    }

}