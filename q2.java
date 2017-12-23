import java.util.*;
import java.io.*;
import java.lang.String.*;

 public class bubble {

	public static void bubbleBurst(int[] array) {
		int res = 0;
		List<Integer> row = new ArrayList<>();
		for (int num : array)
			row.add(num);
        
		while (row.size() > 3) {
			int min = MinVal(row);     // I am finding the min denomination value in the bubble remaining
			int index = findIndex(row, min); // I am finding index of this min value
			if (!(index > 0 && index < (row.size() - 1))) {   // checking that index in not on boundaries as my consideration is i will take triplets
				index = ProductIndex(row);  // finding the index of max product of triplets
			}
			res +=getMaxProduct(index,row) ;  // Adding to result
			row.remove(index); // removing that burst bubble from list
		}
		// after all iteration i will have a list with size 3 atleast now to burst remaining 
		res += row.get(0) * row.get(1) * row.get(2) + Math.min(row.get(0) , row.get(2))* Math.max(row.get(0), row.get(2))+ Math.max(row.get(0), row.get(2)); 
		System.out.println(res);
		
	}

// function to find max product from triplet at given index
    public static int getMaxProduct(int index , List<Integer> row){
        int res=0;
        res=row.get(index - 1) * row.get(index) * row.get(index + 1);

        return res;
    }

// function to find the index of bubble centered at index i that gives max product
	public static int ProductIndex(List<Integer> row) {
		int index = 0;
		int maxProd = -100000000;
		for (int i = 1; i < row.size() - 1; i++) {
			if (getMaxProduct(i,row) > maxProd) {
				maxProd = getMaxProduct(i,row);
				index = i;
			}
		}
		return index;
	}

// function to find min value from list 
	public static int MinVal(List<Integer> row) {
		int min = 10000000;
		for (int i : row){
            min = min < i ? min : i;
        }
		return min;
	}

// function to find index of a number from list
	public static int findIndex(List<Integer> row, int num) {
		for (int i = 0; i < row.size(); i++)
			if (row.get(i) == num)
				return i;
		return -1;
	}

	
	


	public static void main(String args[]) throws IOException
	{
		// Reading file from current directory of q2.java
		File file = new File("input.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			stringBuffer.append(line);
		}
		fileReader.close();
		String input=stringBuffer.toString();
		String[] res=input.split(",");
		int i=0,j=0;
		for(String w:res){  
			i=i+1;
		}
		int arr[]=new int[i];
		for(String w:res){  
			arr[j++]=Integer.parseInt(w)  ;
		}  
		bubble cl=new bubble();
	    cl.bubbleBurst(arr);
	}



}

