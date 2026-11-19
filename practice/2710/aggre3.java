
import java.util.Scanner;

class mentor {

    private String name;

    mentor(String name) {
        this.name = name;
    }

    String getname() {
        return name;
    }
}

class student {

    private String stud;
    //private mentor mtr;

    public student(String stud, mentor m) {
        this.stud = stud;
        //this.mtr=new mentor(mname);
        System.out.println(m.getname() + " is mentor to " + stud);
    }
}

public class aggre3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studname = sc.next();
        String menname = sc.next();
        mentor m = new mentor(menname);
        student s = new student(studname, m);
    }
}
