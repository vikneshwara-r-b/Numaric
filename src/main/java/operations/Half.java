package operations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import NumericOperations.Library;

public class Half {
	public static void Halfed(int n,int d)
	{
		final Logger logger=LoggerFactory.getLogger(Half.class);
		logger.info("Calling Half logic");
		int i,j;
		double v;
		 System.out.println("halfed values:");
		
		for(j=1;j<=n;j++)
		{
			v=j;
		  for(i=1;i<=d;i++)
		 {
		System.out.print(v+" ");
		v/=2;
		 }
		  
		}
	}
}
