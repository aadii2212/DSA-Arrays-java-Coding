//Write a Java Program to find the Identical Arrays in the given arrays.

package Arrays;

public class IdenticalArrays {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,120};
        int[] b={10,20,30,40,50,120};
        identical(a,b);
    }
    public static void identical(int[] a,int[]b){
        if(a.length!=b.length){
            System.out.println("It is not an identical arrays");
        }
        else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]){
                    System.out.println("It is not an identical arrays");
                    return;
                }

            }

            System.out.println("It is an identical array");
        }
        }

    }
