public class RemoveSpace {
    public static void main(String[] args) {
        String str = "Java Program";
        String str1 ="";
        for(int i=0;i<=str.length()-1;i++)
        {
            if(str.charAt(i)==32)
            {
                System.out.print("");
            }
            else
            {
            str1=str1+str.charAt(i);
            }
            System.out.println(str1);
        }
        
    }
}
