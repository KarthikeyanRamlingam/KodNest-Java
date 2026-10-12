
import java.util.Scanner;

public class kreverse {

    static void reverse(int[]arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt() % n;
        reverse(arr, 0, k - 1);
        System.out.println(java.util.Arrays.toString(arr));
        reverse(arr, k, n-1);
        System.out.println(java.util.Arrays.toString(arr));
        reverse(arr, 0, n-1);
        System.out.println(java.util.Arrays.toString(arr));
        

    }
}
