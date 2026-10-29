package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
          System.out.println(Arrays.toString(reverse(arr)));
        }
    public static int [] reverse(int [] arr){
        int st=0,end=arr.length -1;
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
        return arr;
    }
}
