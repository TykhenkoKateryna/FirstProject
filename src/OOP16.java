//Different digits in a three-digit number
/*
import java.lang.ArrayIndexOutOfBoundsException;

public class OOP16 {

	public static void main(String[] args) {
		try		{
		int[] array = new int[5];	
		for (int i = 0; i < 5; i++) {			
		    array[i] = ((int)(Math.random() *900) +100); 
		    System.out.println(array[i]);
		 							}	
		 for (int i = 0; i < 5; i++) {
			if (array[i]/100 != (array[i]%100/10) && array[i]/100 != array[i]%10 && (array[i]%100/10) != array[i]%10) {
				String  a= "YES";	
				System.out.println(a);
									}else {
				String  a= "NO";	
				System.out.println(a);
											}		    	  
		}
	    	    
		}
		    catch ( java.lang.ArrayIndexOutOfBoundsException e) {
		    	  System.out.println(e);
		      }
		}

	}	*/

/*import java.util.Scanner;

public class OOP16 {

	public static void main(String[] args) {
		Scanner Number = new Scanner(System.in);
		int[] array = new int[5];
		  //int i = Number.nextInt();
		  int p=0;
		while(true) {
			
			array[p] = Number.nextInt();
			p++;
			if (p==5) {break;}
		}
			
			
		for (int i = 0; i < 5; i++) {
			if (array[i]/100 != (array[i]%100/10) && array[i]/100 != array[i]%10 && (array[i]%100/10) != array[i]%10) {
				String  a= "YES";	
				System.out.println(a);
									}else {
				String  a= "NO";	
				System.out.println(a);
											}
					}    
		
	}
}*/

import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

public class OOP16 {

	public static void main(String[] args) {
		try		{
		int[] array = new int[5];	
		Scanner Number = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {			
		    array[i] = Number.nextInt();
		    // array[i] = ((int)(Math.random() *900) +100); //it will be numbers from 100 to 999
		 							}	
		 for (int i = 0; i < 5; i++) {
			if (array[i]/100 != (array[i]%100/10) && array[i]/100 != array[i]%10 && (array[i]%100/10) != array[i]%10) {
				String  a= "YES";	
				System.out.println(a);
									}else {
				String  a= "NO";	
				System.out.println(a);
											}		    	  
		}
	    	    
		}
		    catch ( java.lang.ArrayIndexOutOfBoundsException e) {
		    	  System.out.println(e);
		      }
		}

	}	
	