public class PaladromProgram {
    public static void main(String[] args) {
        String str="Madam";
        String str1="";
        
        str = str.toLowerCase();
        for(int i=str.length()-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);
        }
        
        if(str.equals(str1))
        {
            System.out.println(" It is Paladrom");
        }
        else
        {
            System.out.println("it is not paladrom");            
        }

    }
}
