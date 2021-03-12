package regular.expression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {
		

		Pattern pattern = Pattern.compile("(dog)|(female)");
		
		Matcher matcher =  pattern.matcher("The dog she bought is a female dog.");
		
		//System.out.println(matcher.groupCount());
		
		while(matcher.find()) {
		//	System.out.println(matcher.group());
		}
		
//		System.out.println(matcher.lookingAt());
//		System.out.println(matcher.matches());
//		System.out.println(matcher.matches());
//		System.out.println(matcher.replaceAll("Cat"));
//		
		IPValidator ipValidator = new IPValidator();
		
		ipValidator.validateIP(1,"121.18.19.20");
		
	}

	
}
