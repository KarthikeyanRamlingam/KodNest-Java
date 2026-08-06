public class breaks{
    public static void main(String [] args){
        for(int i=1;i<=3;i++){
            for (int j=1;j<=5;j++){
                if(j==3){
                    
                    break;//breaks the entire loop
            }
            System.out.println("i: "+i+" j: "+j);
        }
        
    }
}}