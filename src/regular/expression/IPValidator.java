package regular.expression;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidator {

	
	
	public void validateIP(int N,String... ips){
        
		String[] OUTPUT_ARRAY = new String[N];
		
        Pattern IPV4_PATTERN = Pattern.compile("([0-9]?[0-9]{1}\\.){3}[0-255]");
        Pattern IPV6_PATTERN = Pattern.compile("([0-9a-f]{1,4}:){7}",Pattern.CASE_INSENSITIVE);
        
        
        
        for(String ip:ips){
            
        	String address = ip.trim();
        	
        
        }
    }
}
