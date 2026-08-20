import java.util.Scanner;

class WaterTankprob {
    // Declare capacity and currentLevel
    int capacity;
    int currentLevel;
    // Write the constructor
    WaterTankprob(int capacity,int currentLevel)
    {
        this.capacity=capacity;
        this.currentLevel=currentLevel;
    }
    // Write fillWater()
    int fillWater(int amount)
    {
        if(amount<=0)
        {
            return 0;
        }
        int availableSpace=capacity-currentLevel;
        if(availableSpace>=amount)
        {
          this.currentLevel+=amount;
          return amount;
        }else{
            this.currentLevel+=availableSpace;
            return availableSpace;
        }
    }
    // Write drainWater()
    int drainWater(int amount)
    {
        if(amount<=0)
        {
            return 0;
        }
        int remove=Math.min(amount,currentLevel);
        currentLevel-=remove;
        return remove;
    }
    // Write getStatus()
        String getStatus()
        {
            double fillper=currentLevel*100.0/capacity;
            if(currentLevel==0)
            {
                return "Empty";
            }
            if(currentLevel==capacity)
            {
                return "Full";
            }
            if(fillper<=25.0)
            {
                return "Low";
            }
            else if(fillper<=75)
            {
                return "Medium";
            }
            else
            {
                return "High";
            }
        }
        void displayTank()
        {
            System.out.println("Capacity: "+capacity);
            System.out.println("Current Level: "+currentLevel);
            System.out.println("Available Space: "+(capacity-currentLevel));
            System.out.println("Status: "+ getStatus());

        }

    }


public class Watertank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read capacity, initial level and operation count
        int capacity=scanner.nextInt();
        int initiallevel=scanner.nextInt();
        int noofop=scanner.nextInt();
        // int amount=scanner.nextInt();

        WaterTankprob w=new WaterTankprob(capacity,initiallevel);
        for(int i=1;i<=noofop;i++)
        {
            int choice=scanner.nextInt();
            switch(choice)
            {
                case 1: 
                  int amount=scanner.nextInt();
                  int fill=w.fillWater(amount);
                  System.out.println("Operation "+i+" - "+"Filled: "+fill);
                break;
                case 2:
                int Amount=scanner.nextInt();
                int Drain=w.drainWater(Amount);
                System.out.println("Operation "+i+" - "+"Drained: "+Drain);
                break;
                case 3:
                System.out.println("Operation "+i+" - Tank Status");
                w.displayTank();
                break;
                default:
                System.out.println("Operation "+i+"- Invalid Choice");
                
            }


        }
        // Process operations using a loop and switch
        // Display the final tank status
        System.out.println("Final Tank Status");
        w.displayTank();
    }
}