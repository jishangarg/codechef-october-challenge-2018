import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
    	  	int n=in.nextInt();
    	  	long m=in.nextLong();
    	  	long[] balloons=new long[n];
    	  	long[] Candies=new long[n];
    		long[] Mulcan=new long[n];
    		long[] MulcanSorted=new long[n];		
    		for(int i=0;i<n;i++)
    		{
      			balloons[i]=in.nextLong();	    
    		}
		
    		for(int i=0;i<n;i++)
    		{
      			Candies[i]=in.nextLong();	  
      			Mulcan[i]=Candies[i]*balloons[i];
			MulcanSorted[i]=Candies[i]*balloons[i];
    		}		
    		
		Arrays.sort(MulcanSorted);
		long start=MulcanSorted[0];
		long end=MulcanSorted[n-1];
		double result = end-m*Candies[n-1]*1.00;
		if(result<0)
			result=0;
		while(end>start)
		{
			long toCheck=(start+end)/2;
			int flag=0;
			long m2=0;
			for(int i=0;i<n;i++)
			{
				if(Mulcan[i]>toCheck)
				{
					m2+=(long)Math.ceil((Mulcan[i]-toCheck+0.00)/Candies[i]);
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
				end=toCheck;
			}
		}
        
		System.out.println((long)result);
	}
}


