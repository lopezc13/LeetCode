
public class prefix {

	
	
	//Christopher Lopez 3/31/22 100%
	// https://leetcode.com/problems/longest-common-prefix/
	//
	
	
	    public String longestCommonPrefix(String[] strs) {
	    	
	    	int count = 0;
	    	StringBuilder prefix  = new StringBuilder();
	    	prefix.append("");
	    	
	    	
	    	for(int i = 0; i< strs[0].length(); i ++) 
	    	{
	    		
	
	    		char c = strs[0].charAt(i);
	    		while(count < strs.length) 
	    		{
	    			if(i > strs[count].length()-1||c != strs[count].charAt(i))
	    				return prefix.toString();
	    			
	    			
	    			count++;
	    		}
	    		count = 0;
	    		prefix.append(c);
	    		
	    	}
	    		
	    	
			return prefix.toString();
	        
	    }
	
	


}
