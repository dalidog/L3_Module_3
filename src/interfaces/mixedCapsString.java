package interfaces;

public class mixedCapsString extends SpecialString{

	public mixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		String newString = "";
		s=s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if(i%2==1) {
			newString+= s.substring(i, i+1).toUpperCase();
			}
			else {
				newString+=s.substring(i,i+1);
			}
		}
		// TODO Auto-generated method stub
		return newString;
	}

}
