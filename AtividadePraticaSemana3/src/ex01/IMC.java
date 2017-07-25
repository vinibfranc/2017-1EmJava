package ex01;

public class IMC {
	
	private double massa;
	private double altura;
	
	public IMC(double m, double a) { 
		this.massa = m; 
		this.altura = a; 
	}
	
	public double getMassa() { 
		return massa; 
	}
	
	public double getAltura() { 
		return altura; 
	}
	
	public double getIMC() {
		double result = massa / Math.pow(altura, 2);
		return result;
	}
}
