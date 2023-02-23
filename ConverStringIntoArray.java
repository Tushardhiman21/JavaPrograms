public class ConverStringIntoArray {
    public static void main(String[] args) {
    
        String str = "JAVA PROGRAM";
       // String str1 = " ";
       int n= str.length();
       char arr[]=new char[n];
        for(int i=0;i<=str.length()-1;i++)
        {
            arr[i]=str.charAt(i);  
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
