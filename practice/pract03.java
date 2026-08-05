public class pract03{
    public static void main(String[]args)
    {
        String roundName;
        int roundCode = 4;
        int attemptsUsed = 2;
        int maxAttempts = 3;
    switch(roundCode)
    {
    case 1: roundName="Aptitude Round";
    break;
    case 2: roundName="Technical Round";
    break;
    case 3: roundName="HR Round";
    break;
    case 4: 
    case 5: roundName="Final Review";
    break;
    default:
    roundName="Invalid Round";
    }

String Attempt=attemptsUsed<maxAttempts?"Attempt Available":"Attempt Limit reached";
System.out.println("Current Round: "+roundName);
System.out.print("Attempt Status: "+Attempt);

    
}}