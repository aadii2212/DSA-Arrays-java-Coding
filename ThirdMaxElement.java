package Arrays;

public class ThirdMaxElement {
    public static int maxThirdNum(){
        int [] a={12,24,36,75,45,95,83,-4,-83};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            } else if (a[i]>max2 && a[i] !=max1) {
                max3=max2;
                max2=a[i];
            } else if (a[i]>max3 && a[i] !=max2) {
                max3=a[i];

            }
        }
        return max3 ;

    }

    static void main(String[] args) {
        System.out.println(maxThirdNum());
    }
}
