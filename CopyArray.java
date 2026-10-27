//Write a Java Program to copy an element in an array from other array.


package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size= sc.nextInt();
        System.out.println("Enter the elements of an array");
        int [ ] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copyArray(arr)));
    }
    public static int [] copyArray(int [] arr){
        int []b=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            b[i]=arr[i];
        }
        return b;

    }
}
