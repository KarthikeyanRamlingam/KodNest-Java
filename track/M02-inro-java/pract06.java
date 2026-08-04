
public class pract06 {

    public static void main(String[] args) {

        // Fixed values
        int marks = 72;
        int attendance = 80;
        boolean hasBacklog = false;
        boolean projectComplete = true;
        int mockInterviewScore = 65;

        // Rule 1: Academic eligibility
        if (marks < 60 || attendance < 75 && hasBacklog) {
            System.out.println("Improve Academic Eligibility");
        } // Rule 2: Project completion
        else if (!projectComplete) {
            System.out.println("Complete the Project");
        } // Rule 3: Mock interview score
        else if (mockInterviewScore < 75) {
            System.out.println("Improve Interview Skills");
        } // Rule 4: All requirements satisfied
        else {
            System.out.println("Placement Ready");
        }
    }
}
