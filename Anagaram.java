
import java.util.Arrays;

public class Anagaram {
    public static void main(String[] args) {
        String str = "School Master";
        String str1 = "The Classroom";

        str=str.replace(" ","");
        str1=str1.replace(" ","");

        str=str.toLowerCase();
        str1=str1.toLowerCase();

        char arr[] = str.toCharArray();
        char arr1[] = str1.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        if(Arrays.equals(arr, arr1))
        {
            System.out.print("pangram");
        }
        else{
            System.out.println("it is not ");
        }


    }
}
