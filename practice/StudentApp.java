
import java.util.Scanner;

class Student {

    String name;
    String Coursename;
    int completeTopic;
    int questionSolved;

    void setDetails(String name, String Course) {
        this.name = name;
        this.Coursename = Course;

    }

    void setProgress(int topic, int ques) {
        this.completeTopic = topic;
        this.questionSolved = ques;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Course Name: " + Coursename);
    }

    void displayProgress() {
        System.out.println("Completed Topics: " + completeTopic);
        System.out.println("Questions Solved: " + questionSolved);
    }

    void addTopics(int newtopic) {
        this.completeTopic = completeTopic + newtopic;
        //this.completeTopic = totaltopic;
    }

    void addQuestion(int newSolved) {
        this.questionSolved = questionSolved + newSolved;
        //this.questionSolved = totalsolved;
    }
}

public class StudentApp {

    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner scan = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("      STUDENT PRACTICE TRACKER     ");
        System.out.println("===================================");
        System.out.println("");
        System.out.print("Enter Student name: ");
        String name = scan.nextLine();
        System.out.print("Enter Course name: ");
        String Course = scan.nextLine();
        System.out.print("Enter  total Completed Topics: ");
        int pasttopic = scan.nextInt();
        System.out.print("Enter total QuestionSolved: ");
        int pastques = scan.nextInt();
        s1.setDetails(name, Course);
        s1.setProgress(pasttopic, pastques);
        int choose;
        do {
            System.out.println("===================================");
            System.out.println("                MENU               ");
            System.out.println("===================================");
            System.out.println("1. View Student Details");
            System.out.println("2. View Progress");
            System.out.println("3. Add Completed Topics");
            System.out.println("4. Add Solved Questions");
            System.out.println("5. Exit");
            System.out.println("");
            System.out.print("Enter your choice: ");
            choose = scan.nextInt();
            if (choose>=1&& choose<= 5) {
                switch (choose) {
                    case 1:
                        s1.displayDetails();
                        break;

                    case 2:
                        s1.displayProgress();
                        break;

                    case 3:
                        // System.err.println("How many new topics did you complete?");
                        System.out.print("Enter New Completed Topics: ");
                        int topics = scan.nextInt();
                        s1.addTopics(topics);
                        break;
                    case 4:
                        System.out.print("Enter New Questions Solved: ");
                        int Q = scan.nextInt();
                        s1.addQuestion(Q);
                        break;

                    case 5:
                        System.out.println("Thank you for using Student Practice Tracker.");
                        System.out.println("Keep Practicing!");
                }
            } else {
                System.out.println("Invalid choice.");
                System.out.println("Please enter a value between 1 and 5.");
            }
        } while (choose != 5);

    }
}
