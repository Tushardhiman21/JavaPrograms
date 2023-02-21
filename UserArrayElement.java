import java.util.Scanner;

public class UserArrayElement {
    public static void main(String[] args) {
        System.out.print("enter the no. of elements do you want to store in array:- ");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int arr[]=new int[num];

        System.out.print("enter the elements of array:- ");
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }

        
    }
}
