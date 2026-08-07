import java.util.Scanner;
public class p10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total=0;
        int days=scanner.nextInt();
        for(int i=1;i<=days;i++){
            int no=scanner.nextInt();
            total+=no;
            }
            System.out.println("Total solved: "+total);
            if(total<10){
                System.out.println("Status: Needs more practice");
            }
            else if(total<19){
                System.out.println("Status: Can do better");
            }
            else{
                System.out.println("Status: Excellent");
            }

        
    }
} 