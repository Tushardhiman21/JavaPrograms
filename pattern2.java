import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the no of rows:- ");
            int r=sc.nextInt();
            System.out.print("\nenter the no of columns:- ");
            int c=sc.nextInt();
        
        for(int i = 0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0||i==r-1||j==0)
                {
                    System.out.print("*");
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

}
