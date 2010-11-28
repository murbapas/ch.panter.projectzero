package ch.hszt.junitgettingstarted;

public class MdpJunitDemoImpl implements IMdpJunitDemo{
	
	public boolean isEmpty(String s){
		if (s == null || s.length() == 0){
			return true;
		}
		return false;
	}
	
	public String capitalize(String s){
		StringBuilder b = new StringBuilder();
		String c;
		
		c = s.substring(0, 1).toUpperCase();
		b.append(c);
		c = s.substring(1).toLowerCase();
		b.append(c);
		
		return b.toString();
	}
	
	public String reverse(String s) 
		throws NullPointerException{
		if (s == null){
			throw new NullPointerException("Argument ist null");
		}
		
		StringBuilder b = new StringBuilder();
		char[] c = s.toCharArray();
		
		for (int i = c.length - 1; i >= 0; i--){
			b.append(c[i]);
		}		
		return b.toString();	
	}

	public String join(String... strings) {
		StringBuilder c = new StringBuilder();
		String space = " ";
		
		for (String s : strings){
			s = s.trim();
			c.append(s + space);
		}
		
		return c.toString().trim();
	}

}
