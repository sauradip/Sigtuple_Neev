import java.util.*;
import java.io.*;


public class q1 {

    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(br.readLine());
         Scanner scan = new Scanner(System.in);
         
        int arr[]=new int[i];
        for ( int j=0;j < i;j++)
        {
            arr[j]=Integer.parseInt(scan.next());
        }
        int num1,num2,result=0;
        int head=i-1;  // start point of calculation
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
                        // System.out.println(num1 + " + " + num2 + " = " + k);
                         result=result+1;
                    }
                        
                }
            }
        }
    

    System.out.println(result);
    }
}
