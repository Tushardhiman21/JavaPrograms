public class Pangram1 {
    public static void main(String[] args) {
        Boolean flag=false;
        String str = "ab";
        str=str.replace(" ","");
        str= str.toUpperCase();

        char ch[] = str.toCharArray();
        
        int arr[]= new int [26];

        for(int i=0 ;i<ch.length;i++)
        {
            arr[ch[i]-65]++;
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                
                flag=true;
            }

        }
        if(flag==false)
        {
            System.out.println("it is palagram");
        }
        else{
            System.out.println("pangram");
        }
    }
}
