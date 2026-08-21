import java.util.Scanner;

class SalesAnalyzer {
    // Declare the dailySales array
    double[] Sales;
    // Write the constructor
    SalesAnalyzer(double[]Sales)
    {
        this.Sales=Sales;
    }
    double calculateTotal()
    {
        double total=0;
        for(double x:Sales)
        {
            total+=x;
        }
        return total;
    }
    double calculateAverage()
    {
        double avg=calculateTotal()/Sales.length;
        return avg;
    }
    int findHighestSalesDay()
    {
        int high=0;
        for(int i=1;i<Sales.length;i++)
        {
            if(Sales[i]>Sales[high])
            {
                high=i;
            }
        }
        return high+1;
    }
    int findLowestSalesDay(){
        int low=0;
        for(int i=1;i<Sales.length;i++)
        {
            if(Sales[i]<Sales[low])
            {
                low=i;
            }
        }
        return low+1;
    }
    int countAboveAverageDays()
    {
        int count=0;
        for(int i=0;i<Sales.length;i++)
        {
            if(Sales[i]>calculateAverage())
            {
                count++;
            }
        }
        return count;   
    }
    void  displayReport()

    {
        System.out.println("Number of Days: "+Sales.length);
        System.out.println("Total Sales: "+calculateTotal());
        System.out.println("Average Sales: "+calculateAverage());
        System.out.println("Highest Sales Day: "+findHighestSalesDay());
        System.out.println("Highest Sales: "+(Sales[findHighestSalesDay()-1]));
        System.out.println("Lowest Sales Day: "+findLowestSalesDay());
        System.out.println("Lowest Sales: "+(Sales[findLowestSalesDay()-1]));
        System.out.println("Days Above Average: "+(countAboveAverageDays()));
    }
}

public class Salesanalyze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the number of days
        int days=scanner.nextInt();
        // Create and populate the sales array
        double[] Sales=new double[days];
        for(int i=0;i<days;i++)
        {
            Sales[i]=scanner.nextDouble();
        }
        // Create the SalesAnalyzer object
        SalesAnalyzer S=new SalesAnalyzer(Sales);
        // Display the report
        S.displayReport();
    }
}