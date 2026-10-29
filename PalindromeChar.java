package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class PalindromeChar {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an character");
        int size= sc.nextInt();
        System.out.println("Enter the character of an array");
        char [ ] ch=new char[size];
        for(int i=0;i<ch.length;i++){
            ch[i]=sc.next().charAt(0);
        }
        System.out.println(Arrays.toString(ch));
        System.out.println(palindrome(ch));
    }
    public static String palindrome(char[] ch){
        int last=ch.length-1;
        for(int i=0;i<ch.length/2;i++){
            if (ch[i] != ch[last])
                return "Not Palindrome";
            last--;
        }
        return "It is palindrome";
    }
}
