package uebung_2_1;

public class uebung_2_1 {

	public static void main(String[] args) 
	
	{
	double p;
	double q;
	
	p=8;
	q=15;
	
	double unterderwurzel = ((p/2)*(p/2))-q;
	double vorderwurzel = -1*p/2;
	
	double loesung1 = vorderwurzel + Math.sqrt(unterderwurzel);
	double loesung2 = vorderwurzel - Math.sqrt(unterderwurzel);
	
	System.out.println("x1 = "+loesung1);
	System.out.println("x2 = "+loesung2);
	

	
	
		
		
		
	}

}
