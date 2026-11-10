package Arrays;

public class MinElement {
    public static int firstMinElement(){
        int [] a={12,24,36,75,45,95,83,-4,-83};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }

    static void main(String[] args) {
        System.out.println(firstMinElement());
    }
}
