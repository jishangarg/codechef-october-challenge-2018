import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
    	  	int n=in.nextInt();
    	  	int m=in.nextInt();
    	  	int[] ballons=new int[n];
    	  	int[] Candies=new int[n];
    		int[] Mulcan=new int[n];
    		int[] MulcanSorted=new int[n];		
    		for(int i=0;i<n;i++)
    		{
      			ballons[i]=in.nextInt();	    
    		}
		
    		for(int i=0;i<n;i++)
    		{
      			Candies[i]=in.nextInt();	  
      			Mulcan[i]=Candies[i]*ballons[i];	    
    		}		
    
    		
    		
	}
}
