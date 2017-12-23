import java.util.*;
import java.io.*;


public class sum {

    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        // reading the integer value N
        int i=Integer.parseInt(br.readLine());
         Scanner scan = new Scanner(System.in);
         
        int arr[]=new int[i];
        
        // reading distinct values space separated
        for ( int j=0;j < i;j++)
        {
            arr[j]=Integer.parseInt(scan.next());
        }
        Arrays.sort(arr);
        int num1,num2,result=0;
        // start point of calculation is end of array
        int head=i-1;  
        for (int k=head; k>0;k--)
        {
            for(int x=0 ;x< k ; x++)
            {
                num1=arr[x];
                for(int y=x+1 ; y <k ; y++ )
                {
                    num2=arr[y];
                   
                    if( arr[k] == (num1+num2))
                    {
                        // System.out.println(num1 + " + " + num2 + " = " + arr[k]);
                         result=result+1;
                    }
                        
                }
            }
        }
    

    System.out.println(result);
    }
}
