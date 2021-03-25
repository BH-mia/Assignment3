import java.util.Random;
import java.util.Scanner;

public class WordGame {
    public String randomChar(){
        String s= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char [] chars = s.toCharArray();
        Random random = new Random();
        return String.valueOf(chars[random.nextInt(26)]);
    }

    private boolean isLetters(String s){
        for(int i = 0; i< s.length(); i++){
            if(!Character.isAlphabetic(s.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private boolean isAscending(String s){
        s = s.toUpperCase();
        for(int i = 0; i<s.length()-1; i++){
            if(s.charAt(i) > s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }

    public void playGame(){
        while (true){
            Scanner in = new Scanner(System.in);
            String c = randomChar();
            System.out.println("The letter is: " + c);
            System.out.print("Please input a word starting with " + c+ " : ");
            String word = in.nextLine();
            int base = 0;
            if (word.startsWith(c) || word.startsWith(c.toLowerCase())){
                if(isLetters(word)){
                    for(int i = 0; i< word.length(); i++){
                        base += word.charAt(i);
                    }
                    if(isAscending(word)){
                        base = base*3;
                    }
                    System.out.println("Your score is " + base);
                }else {
                    System.out.println("Your score is 0!");
                }

            }else {
                System.out.println("Your score is 0!");
            }
            System.out.print("Please enter Y if you want to continue, else end the game: ");
            String choice = in.nextLine();
            if (!choice.equals("Y")){
                break;
            }
        }
    }

    public static void main(String[] args) {
        WordGame wordGame = new WordGame();
        wordGame.playGame();
    }
}
