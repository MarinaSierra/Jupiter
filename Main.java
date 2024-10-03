import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int nterminos;
		
		System.out.println("Dame el numero de terminos");
		nterminos=sc.nextInt();
		Sucesion fibonacci;
		
		fibonacci=new Sucesion(nterminos);
		
		System.out.print(fibonacci.calculo());
	}
}
