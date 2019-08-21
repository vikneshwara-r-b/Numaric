package operations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoubleOperation {
	
	public static void Doubled(int n,int d)
	{
		final Logger logger=LoggerFactory.getLogger(DoubleOperation.class);
		  logger.info("Calling Double logic");
		long v;
		System.out.println("Doubled values:");
		int i,j;
		for(j=1;j<=n;j++)
		{
			v=j;
		for(i=1;i<=d;i++)
		{
		System.out.print(v+" ");
		v*=2;
		}
		System.out.println();
		}
	}

}
