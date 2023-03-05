package hw5;
import java.util.Scanner;
import java.util.Random;
public class game {

        public static void main(String[] args) {
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple ", "pumpkin", "potato"};
            Random random = new Random();
            int index = random.nextInt(words.length); // pick a random word from the array
            String word = words[index];
            int numGuesses = 0;
            boolean[] guessedLetters = new boolean[word.length()]; // keep track of which letters have been guessed
            Scanner scanner = new Scanner(System.in);

            System.out.println("Guess the word!");
            while (true) {
                System.out.print("Enter a letter or the whole word: ");
                String guess = scanner.nextLine();
                numGuesses++;

                if (guess.equals(word)) {
                    System.out.println("Congratulations, you guessed the word in " + numGuesses + " guesses!");
                    break;
                } else if (guess.length() == 1) {
                    char letter = guess.charAt(0);
                    boolean foundLetter = false;
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) == letter) {
                            guessedLetters[i] = true;
                            foundLetter = true;
                        }
                    }
                    if (foundLetter) {
                        System.out.println("Correct! The word contains the letter " + letter);
                    } else {
                        System.out.println("Incorrect. The word does not contain the letter " + letter);
                    }
                } else {
                    System.out.println("Incorrect. The word is not " + guess);
                }

                // print out the current state of the guessed word
                boolean allLettersGuessed = true;
                for (int i = 0; i < word.length(); i++) {
                    if (guessedLetters[i]) {
                        System.out.print(word.charAt(i));
                    } else {
                        System.out.print("_");
                        allLettersGuessed = false;
                    }
                    System.out.print(" ");
                }
                System.out.println();

                if (allLettersGuessed) {
                    System.out.println("Congratulations, you guessed the word in " + numGuesses + " guesses!");
                    break;
                }
            }
        }
    }

