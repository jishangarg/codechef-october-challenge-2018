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
			MulcanSorted[i]=Candies[i]*ballons[i];
    		}		
    		
		Arrays.sort(MulcanSorted);
		int start=MulcanSorted[0];
		int end=MulcanSorted[n-1];
		int result=0;
		while(end>=start)
		{
			int toCheck=(start+end)/2;
			int flag=0;
			int m2=0;
			for(int i=0;i<n;i++)
			{
				if(Mulcan[i]>toCheck)
				{
					m2+=Math.ceil(Mulcan[i]-toCheck)/5;
				}
				if(m2>m)
				{
					flag=1;
					break;
				}
				
			}
			if(flag==1)
				start=toCheck+1;
			else{
			    result=toCheck;
				end=toCheck-1;
			}
		}
		System.out.println(result);
    		
    		
	}
}


