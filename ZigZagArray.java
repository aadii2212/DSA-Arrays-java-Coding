//--------------WAJP to arange the given two arrays in a zig-zag array.

package Arrays;
import java.util.Arrays;

public class ZigZagArray {
    static void main(String[] args) {
        int[] a={10,20,30,40,50,120};
        int[] b={60,70,80,90,100,110};
        int[] c=new int[a.length+b.length];
        zigZagArrange( a, b,c);


    }
        public static void zigZagArrange(int[] a,int[] b,int[] c){
        int aadd=0;
        int badd=0;
        for(int i=0;i<c.length;i++){
            if(i%2==0)
                c[i] = a[aadd++];
            else
                c[i]=b[badd++];
        }
        System.out.println(Arrays.toString(c));
    }
}
