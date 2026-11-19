
import java.util.Scanner;

class underageExcep extends Exception {

    underageExcep() {
        super("you are too young");
    }
}

class drivelicence {

    int age;

    void takeage() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
    }

    void verify() throws underageExcep {
        if (age < 18) {
            underageExcep uae = new underageExcep();
            throw uae;

            // throw new underageExcep();
        } else {
            System.out.println("eligible");
        }
    }
}

public class customExcep {

    public static void main(String[] args) {

        drivelicence dl = new drivelicence();
        dl.takeage();

        try {

            dl.verify();
        } catch (underageExcep e) {
            e.printStackTrace();
        }

    }
}
