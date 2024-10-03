
public class Sucesion 
{
	private int nterminos;
	
	public Sucesion(int nterminos)
	{
		this.nterminos=nterminos;
	}
	public int calculo()
	{
		int n0=0, n1=1, n;
		
		for(int i=0; i<this.nterminos; i++)
		{
			n=n0+n1;
			n0=n1;
			n1=n;
		}
		return n0;
	}
	
	
}
