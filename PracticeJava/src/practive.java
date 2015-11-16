	import java.util.*;
	import java.lang.*;
	import java.io.*;

	/* Name of the class has to be "Main" only if the class is public. */
	public class practive
	{
		   public boolean isPowerOfTwo(int n){

	            boolean isPower=false;
	            int temp=n;
	            while(temp>=2){
	                if(temp%2==0){
	                    isPower=true;
	                }else{
	                    isPower=false;
	                    break;
	                }
	                temp=temp/2;
	            }
	            if(isPower){
	                System.out.println("power of 2");
	            }else{
	                System.out.println("not power of 2");
	            }
	            return isPower;
	        }
		public static void main (String[] args) throws java.lang.Exception
		{
			practive vN= new practive();
			vN.isPowerOfTwo(64);
		}
	}

