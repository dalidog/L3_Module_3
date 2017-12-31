package interfaces;


public class backwardsString extends SpecialString{

	public backwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		String newString = "";
		for (int i = 0; i < s.length(); i++) {
		newString +=s.substring(s.length()-i-1, s.length()-i);
		
		}
		return newString;
	}

}
