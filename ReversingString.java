public class ReversingString{
    public static void main(String[] args) {
        String str = "Java Program";
        String str1=" ";

        for(int i=str.length()-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);
        }

        System.out.println("string before reversing :- "+str);
            System.out.print("string after reversing :- "+str1);
        }
}