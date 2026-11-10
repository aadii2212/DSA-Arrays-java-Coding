package Arrays;

public class SecondMaxElement {
    public static int secondMax(){
        int [] a={12,24,36,75,45,95,83,-4,-83};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            } else if (a[i]>max2 && a[i] !=max1) {
                max2=a[i];

            }
        }
        return max2 ;
    }

    static void main(String[] args) {
        System.out.println(secondMax());
    }
}
