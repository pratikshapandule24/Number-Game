import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    int number;
    int inputnumber;
    int NoOfGuesses = 0;

    public int GetNoOfGuesses() {
        return NoOfGuesses;
    }

    public void SetNoOfGuesses(int NoOfGuesses) {
        this.NoOfGuesses = NoOfGuesses;
    }

    GuessingNumber() {
        Random random = new Random();
        this.number = random.nextInt(100);
    }

    void TakeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number ");
        inputnumber = sc.nextInt();
    }

    boolean IsCorrectNumber() {
        NoOfGuesses++;
        if (inputnumber == number) {
            System.out.format("Yes you guessed it right , it was %d\nYou guessed it in %d attempt ", number,
                    NoOfGuesses);
            return true;
        } else if (inputnumber < number) {
            System.out.println("Too low...");
        } else if (inputnumber > number) {
            System.out.println("Too high...");
        }
        return false;
    }

    public static void main(String[] args) {
        GuessingNumber g = new GuessingNumber();
        boolean b = false;
        while (!b) {
            g.TakeUserInput();
            b = g.IsCorrectNumber();
        }
    }
}
