public class ReverseCase2{
    public static void main(String[] args) {
        String str = "Java Program";
        String str1 = "";
        String Sarr[]=str.split(" ");

        for(int i=Sarr.length-1;i>=0;i--)
        {
            str1=str1+Sarr[i]+" ";    
        }
        System.out.println(str1);
    }
}
