public class Continue{
    public static void main(String [] args){
        for(int i=1;i<=3;i++){
            for (int j=1;j<=5;j++){
                if(j==3){
                    
                    continue;//Skips the current iteration
            }
            System.out.println("i: "+i+" j: "+j);
        }
        System.out.println();
        
    }
}
}