public class ReverseCase3 {
    public static void main(String[] args) {
        String str ="Java Program";
        String str1="";
        
        String arr[] = str.split(" ");
        for(String element : arr)
        {
            for(int i=element.length()-1;i>=0;i--)
            {
                str1=str1+element.charAt(i);
            }
            str1=str1+" ";
        }
        System.out.println(str1);

    }
}
