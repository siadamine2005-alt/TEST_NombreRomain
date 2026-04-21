package romain;

public class ChiffresRomains {

	public String toChiffresRomains(int n) throws IllegalArgumentException{

		if(n<1 || n>3999) throw new IllegalArgumentException();
		StringBuilder r = new StringBuilder();
		for(int i = 0; i < n; i++ ) {
			r.append("I");
		}
		
		return r.toString();
	}

}
