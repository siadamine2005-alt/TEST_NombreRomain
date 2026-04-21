package romain;

public class ChiffresRomains {

	public String toChiffresRomains(int n) throws IllegalArgumentException{

		if(n<1 || n>3999) throw new IllegalArgumentException();
		
		if (n==4) return "IV";
		
		
		StringBuilder r = new StringBuilder();
		int nbI = n;
		if(n>=5) {
			r.append("V");
			nbI = n-5;
		}
		for(int i = 0; i < nbI; i++ ) {
			r.append("I");
		}
		
		return r.toString();
	}

}
