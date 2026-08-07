import java.util.Scanner;
public class p11{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double Mon_income=scanner.nextDouble();
        double Rent=scanner.nextDouble();
        double Food=scanner.nextDouble();
        double travel=scanner.nextDouble();
        double expense=Rent+Food+travel;
        double rem_amo=Mon_income-expense;
        System.out.println("Total expense: "+expense);
        System.out.println("Remaining: "+rem_amo);
        if (rem_amo>=0) {
            System.out.println("Status: Within budget");
    }
    else{
        System.out.println("Status: Over budget");
        }
        scanner.close();
    }
}
