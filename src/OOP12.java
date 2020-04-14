//A set of two-digit numbers from two numbers from 0 to 9

import java.util.Scanner;

public class OOP12 {

	public static void main(String[] args) {
		 Scanner Number = new Scanner(System.in);
	      int A = Number.nextInt();
	      int B = Number.nextInt();
	      StringBuilder sb = new StringBuilder();
	      sb.append(A);
		sb.append(B);
		sb.toString();
		int R = Integer.parseInt(sb.toString());
	    
	      StringBuilder sa = new StringBuilder();
	      sa.append(B);
		sa.append(A);
		sa.toString();
		int D =  Integer.parseInt(sa.toString());
	      if (R > D) {
	    	  if (B==0) {
	    		  System.out.print(R);
	    	  }else {
	    		  System.out.print(D+" "+R);
	    	  }
	    	 
	      } else {
	    	  if (R < D){
	    		  if (A==0) {
		    		  System.out.print(D);
		    	  }else {
		    		  System.out.print(R+" "+D);
		    	  }
		    		      	      	 
		      
	    	  } else {
	    		  if (R==0 && D==0) {
	    			  System.out.print("-1");
	    		  }else {
	    			  if (R==D){
	    				  System.out.print(R+" "); 
	    			  }
	    			  
	    		  }
	    		 
	    	  }
	      }
	      Number.close();
	      }
	}