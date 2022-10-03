import java.util.Scanner;

public class calGrade {
    public static void main(String args[]) {
        calscore obj = new calscore();
        // Create obj of calscore class
        obj.calculate();
    }

}

class calscore {
    // Method for calculate
    public void calculate() {
        double score;
        // Input Score
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Score 10: ");
        score = scan.nextDouble();

        if (score >= 80) {
            System.out.println("Grade is A");
        } else if (score >= 70) {
            System.out.println("Grade is B");
        } else if (score >= 60) {
            System.out.println("Grade is C");
        } else if (score >= 50) {
            System.out.println("Grade is D");
        } else {
            System.out.println("Grade is F");
        }
    }
}