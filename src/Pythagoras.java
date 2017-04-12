
public class Pythagoras {

	public static void main(String[] args) {
		int a = 20;
		int b = 12;
		int c = 0;
		
		c = (int) Math.sqrt(a*a+b*b);
		if(c*c == a*a + b*b) {
			System.out.println(c);
			return;
		}
		
		int h = a>b?a:b;
		int l = a>b?b:a;
		
		// h*h = l*l + x*x
		//(h^2-l^2) = x^2
		//sqrt(h^2-l^2) = x
		
		
		System.out.println(h);
		System.out.println(l);
		
		int x = (int) Math.sqrt((h*h)-(l*l));
		System.out.println(x);
		if((double) x - Math.sqrt((h*h)-(l*l)) < .001d) {
			System.out.println(x);
			return;
		}
		System.out.println("No");
	}
	
}
