import java.util.Scanner;
public class p13{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();
        int days=scanner.nextInt();
        int tot=0;
        for(int i=1;i<=days;i++) {
            int a=scanner.nextInt();
            tot+=a;
        }
        double avg=tot/days;
        System.out.println("Learner:"+ name);
        System.out.println("Total solved: "+tot);
        System.out.println("Daily average: "+avg);
        if(avg>=5.0){
            System.out.println("Status: Consistent");
        }
        else{
            System.out.print("Status: Needs consistency");
        }
        scanner.close();
    }
}