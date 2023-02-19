import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
            System.out.print("enter the no of rows:- ");
            int r=sc.nextInt();
            System.out.print("\nenter the no of columns:- ");
            int c=sc.nextInt();
        
        for(int i = 0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0||i==(r-1)/2||j==0||j==c-1)
                {
                    if(i==0 && j==c-1 )
                    {
                        System.out.print(" ");
                    }
                    else if(i==0&& j==0)
                    {
                    System.out.print(" ");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                  
                    
                }
            
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
        
    }


}

    
