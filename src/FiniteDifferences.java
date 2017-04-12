
public class FiniteDifferences {

	public static void main(String[] args) {
		double fi = 20;
		double dfi = 1;
		double ddfi = 2;
		
		double total = fi;
		
		for(int i = 0; i < 100; i++) {
			dfi += ddfi;
			total +=dfi;
		}
		
		System.out.println(total);
	}
	
}
