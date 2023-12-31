import java.util.Scanner;

public class Solo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the amount loaned:");
        int amount = scanner.nextInt();
        int month;
        double result;

        for (month = 1; month <= 3; month++) {
            result = amount * (.1);
            // System.out.println("month " + month + " Interest: " + result);
            amount = amount - (int) result;
            System.out.println("month " + month + " Balance: " + amount);
        }

        scanner.close();
    }
}

// Suppose that a file named “testdata.txt” contains the following information:
// The first
// line of the file is the name of a student. Each of the next three lines
// contains an integer.
// The integers are the student’s scores on three exams. Write a program that
// will read
// the information in the file and display (on standard output) a message the
// contains the
// name of the student and the student’s average grade on the three exams. The
// average is
// obtained by adding up the individual exam grades and then dividing by the
// number of
// exams.