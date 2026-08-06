public class nesteddoWhile{
    public static void main(String []args)
    {
        int i=0;
        do{
        int j=0;
        do{
            System.out.println("*");
            j++;
        }while(j<5);
        i++;
        System.out.println();
    }while(i<5);

    }
}