
public class first
{
	public static void main(String[] args) 
	{
		int x=1;
		int l=0,r=x;
		int m;
		
		if(x==1)
		{
			System.out.println("Output Value: 1");
			System.exit(1);
		}
		while(l+1<r)
		{
			m=l+(r-l)/2;
			if(predicate(m,x)==0)
				l=m; 
			else
				r=m;
		}
		System.out.println("Output Value: "+l);
	}
	public static int predicate(int m,int x)
	{
		if(m*m<=x)
			return 0;
		else
			return 1;
	}

}
