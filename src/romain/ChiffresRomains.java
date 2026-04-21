package romain;

public class ChiffresRomains {

	private int[] numvx = { 5, 10 };
	private String[] vx = { "V", "X"};
	private String[] ix = { "I", "X"};
	private int[] numix = { 1, 10 };

	public String helper(int n, int j) {
		StringBuilder r = new StringBuilder();
		int nbI = n;

			if (n >= numvx[j]) {
				r.append(vx[j]);
				nbI = n - numvx[j];
			}

		for (int i = 0; i < nbI; i = i + numix[j]) {
			r.append(ix[j]);
		}

		return r.toString();
	}
	
	public String toChiffresRomains(int n) throws IllegalArgumentException {

		if (n < 1 || n > 3999)
			throw new IllegalArgumentException();

		if (n == 4)
			return "IV";
		if (n == 9)
			return "IX";

		if(n<10) {
			return helper(n,0);
		}
		
		int d = n % 10 ;
		n = n - d;
		return helper(n,1) + helper(d,0);

	}

}
