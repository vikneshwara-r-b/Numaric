package operations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square {
	public static void Squared(int n,int d)
	{
		final Logger logger=LoggerFactory.getLogger(Square.class);
		 logger.info("Calling Square logic");
		System.out.println("squared values:");
	    long v;
		int i,j;
		for(j=1;j<=n;j++)
		{
	    v=j;
		for(i=1;i<=d;i++)
		{
		System.out.print(v+" ");
		v*=v;
		}
		System.out.println();
		}
	}

}
