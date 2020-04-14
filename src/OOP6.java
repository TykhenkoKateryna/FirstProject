
import java.util.*;
import java.lang.*;
import java.io.*;
 
class OOP6
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] massive = new int[10];
 
		int i =10;
		for(int j = 0; j < 10; j++) {
 
			massive[j]=i;
			i--;
 
		}
		System.out.print("Our array:"+ Arrays.toString(massive));
		System.out.println(" ");
		System.out.println("Reverse:");
for(int j = massive.length-1; j >=0; j--) {
 			
			System.out.print(massive[j]+" ");
 
		}
 
	}
}

