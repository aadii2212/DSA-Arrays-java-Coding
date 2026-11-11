package Arrays;

public class ThirdMin {
    public static int thirdMinElement(){
        int [] a={12,24,36,75,45,95,83,-4,-83};
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int min3=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min1){
                min3=min2;
                min2=min1;
                min1=a[i];
            } else if (a[i]<min2 && a[i] !=min1) {
                min3=min2;
                min2=a[i];
            } else if (a[i]<min3 && a[i] !=min2 && a[i]!=min1) {
                min3=a[i];

            }
        }
        return min3;
    }

    static void main(String[] args) {
        System.out.println(thirdMinElement());
    }
}
