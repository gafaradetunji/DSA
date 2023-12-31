import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDice, dice1, dice2;
        dice1 = (int) (Math.random() * 6) + 1;
        dice2 = (int) (Math.random() * 6) + 1;
        totalDice = dice1 + dice2;
        // System.out.println("Your first guess is: " + dice1);
        // System.out.println("Your second guess is: " + dice2);
        // System.out.println("Total of the two dice is: " + totalDice);

        // System.out.println("Please enter your name");
        // String name = scanner.nextLine();
        // System.out.println("Hello " + name.toUpperCase() + " nice to meet you!");

        System.out.println("How many eggs do you have?");
        int eggs = scanner.nextInt();
        int gross = 144;
        if (eggs >= gross) {
            int Gross = eggs / gross;
            System.out.println("Your number of eggs is " + Gross + " gross");
        }
        if (eggs >= 12) {
            int Dozen = eggs / 12;
            System.out.println("Your number of eggs is " + Dozen + " dozen");
        }
    }
}

// If you have N eggs, then you have N/12 dozen eggs, with N%12 eggs left over.
// (This is
// essentially the definition of the / and % operators for integers.) Write a
// program that asks
// the user how many eggs she has and then tells the user how many dozen eggs
// she has and
// how many extra eggs are left over.
// A gross of eggs is equal to 144 eggs. Extend your program so that it will
// tell the user
// how many gross, how many dozen, and how many left over eggs she has. For
// example, if
// the user says that she has 1342 eggs, then your program would respond with
// Your number of eggs is 9 gross, 3 dozen, and 10