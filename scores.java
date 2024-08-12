import java.util.Scanner;
public class scores {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= 5;
        String[] studentNames = new String[n];
        int[] scores = new int[n];
        int sum = 0;
        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = s.next();
            System.out.print("Enter the score of " + studentNames[i] + ": ");
            scores[i] = s.nextInt();
            sum += scores[i];
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }
        double average = (double) sum / n;
        System.out.println("\nStudent Scores:");
        for (int i = 0; i < n; i++) {
            System.out.println(studentNames[i] + ": " + scores[i]);
        }
        System.out.println("\nAverage Score: " + average);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Highest Score: " + highest);

     }
}
