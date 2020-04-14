import java.util.Arrays;
public class OOP14 {

	public static void main(String[] args) {
		
		OOP14 arrays = new OOP14();
		        arrays.RandomArray();
		    }
		    public void RandomArray(){
		        int [] NewArr = new int[9];		       
		        for (int i=0; i<NewArr.length;i++){
		        	NewArr[i] = (int) (Math.random()* 9);		        	
		        }
		        int a = 0;
		        Arrays.sort(NewArr);
		        int max = 0;
		        int min = 0;
		        int greater1 = 0;
		        //MAX Works because array is SORTED in any other conditions it doesn't work
	            max = NewArr[NewArr.length-1];
	            //MIN Works because array is SORTED in any other conditions it doesn't work
	            min = NewArr[0];
		        for (int b:NewArr) {
		           
		        //    System.err.print(b + " ");
		            //SUM of all elements
		            a=a+b;
		            //Quantity elements greater than ONE
		            if(b > 1){
		                greater1++;
		            }
		        }		        
		        System.out.println("Sum = " + a);
		        System.out.println("Maximum number is " + max);
		        System.out.println("Minimum number is " + min);
		        System.out.println("Quantity of digits greater than 1 is " + greater1+".");
		    }
	}