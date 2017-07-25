package atividadepratica3;

public class IMC {
	
	private double massa, altura;
	
	public IMC(double m, double a)
	{ massa=m; altura=a;}
	
	public double getMassa()
	{return massa;}
	
	public double getAltura()
	{ return altura; }
	
	public double getIMC()
	{
		return massa/Math.pow(altura, 2);		
	}	
}
