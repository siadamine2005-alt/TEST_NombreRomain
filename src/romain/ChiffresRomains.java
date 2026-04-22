package romain;

public class ChiffresRomains {

	private int[] numvx = { 5, 10 };
	private String[] vx = { "V", "X"};
	private int[] numix = { 1, 5,10,100,100,1000};
	private String[] ix = { "I", "X","C","M"};
	private int[] numSp = {4,9, 90,900};
	private String[] roSp= {"IV","IX", "XC","CM"};

	public String helper(int n, int j) {
		
		if (n == numSp[j])
			return roSp[j];
		
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
		
		if(n < 5) {
			
		}

		if(n<10) {
			return helper(n,0);
		}
		
		if(n < 100) {
			int d = n % 10 ;
			n = n - d;
			return helper(n,1) + helper(d,0);			
		}
		
		if(n < 1000) {
			int d = n % 10 ;
			n = n - d;
			int m = n % 100;
			n = n - m;
			return helper(n,2)+ helper(m, 1)+ helper(d,0);
		}
		
		int d = n % 10 ;
		n = n - d;
		int m = n % 100;
		n = n - m;
		int c = n % 1000;
		n = n - c;
		return helper(n, 3) + helper(c,2) + helper(m, 1)+ helper(d,0);

	}

}
