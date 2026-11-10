package Arrays;

public class SecondMin {
    public static int secondMinElement(){
        int [] a={12,24,36,75,45,95,83,-4,-83,-56};
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min1){
                min2=min1;
                min1=a[i];
            } else if (a[i]<min2 && a[i] !=min1) {
                min2=a[i];

            }
        }
        return min2 ;
    }

    static void main(String[] args) {
        System.out.println(secondMinElement());
    }
}
