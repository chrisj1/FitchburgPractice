
public class SumRun {

	private static int sum(int n) {
		if(n < 3) return n;
		for(int start = 1; start < n; start++) {
			int sum = start;
			for(int next = start + 1; next < n; next++) {
				sum += next;
				if(sum == n) {
					return next - start + 1;
				} else if(sum > n) {
					break;
				}
			}
		}
		return 1;
	}
	
	public static void main(String[] args) {
		for(int i = 1; i < 1000; i++) {
			System.out.println(i + " " + sum(i));
		}
	}
	
}
