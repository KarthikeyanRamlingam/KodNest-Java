
public class pra05 {

    public static void main(String[] args) {
        double H = 1.8;
        double W = 72.0;
        double time = 2.0;
        double rate = 6.5;
        double princi = 10000.0;
        int[] marks = {78, 84, 69, 91, 88};
        double SI = princi * rate * time / 100.0;
        double bmi = W / (H * H);
        double TOT = princi + SI;
        int n = marks.length;
        int TotM = 0;
        for (int i = 0; i < n; i++) {
            TotM += marks[i];
        }
        double Perc = (double) TotM * 100.0 / 500;
        System.out.println("Simple Interest: " + SI);
        System.out.println("Total Amount: " + TOT);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + TotM);
        System.out.println("Percentage: " + Perc);

    }
}
