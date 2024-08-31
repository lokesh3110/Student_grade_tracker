import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        
        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
        
        // Input grades
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter grade for student " + (i + 1) + ":");
            int grade = scanner.nextInt();
            grades.add(grade);
        }
        
        // Calculate average, highest, and lowest scores
        double average = calculateAverage(grades);
        int highest = findHighestScore(grades);
        int lowest = findLowestScore(grades);
        
        // Display the results
        System.out.println("\n--- Grade Summary ---");
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        
        scanner.close();
    }
    
    // Method to calculate the average of grades
    public static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    
    // Method to find the highest score
    public static int findHighestScore(ArrayList<Integer> grades) {
        int highest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }
    
    // Method to find the lowest score
    public static int findLowestScore(ArrayList<Integer> grades) {
        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
