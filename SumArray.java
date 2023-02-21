class Sum{
    int add(int arr[])
    {
        int result =0;
        for(int n: arr)
        {
            result=result+n;
        }
        return result;
    }
    
}


public class SumArray{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Sum obj = new Sum();
        int result= obj.add(arr);
        System.out.println(result);


    }
}