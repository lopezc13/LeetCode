import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

class RomanNumeralEasy {
			
			
			static String [] r = new String[] {"MCMXCIV",
					"DCXXI"};//28
			final int m = 1000;
			final int d = 500;
			final int c = 100;
			final int l = 50;
			final int x = 10;
			final int v = 5;
			final int i = 1;
//			
//			  public static int romanToInt2(String s) 
//			  {
//			
			static ArrayList<String> rome = new ArrayList<String>();
//				  
//				  public void getCSV() throws IOException 

			public static void getCSV() throws IOException 
			
				
			{
			
			  int count = 0;
			Reader in = new FileReader("Book1.csv");
			@SuppressWarnings("deprecation")
			Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(in);
			rome.add("I");
			for (CSVRecord record : records) 
				{
				
				rome.add(record.get(0));
			    }
				}
//				  
//				
			
			
			
		    public static int romanToInt(String s) 
		    {
		    	
		    	
		    	
		    	
		    	
		    	
		    	int test = 0;
		    	
		    	for(int i = 0;i < s.length();i++) 
		    	{
		    		if(s.charAt(i)== 'I'||s.charAt(i)== 'V'||s.charAt(i)== 'X'||s.charAt(i)== 'L'||s.charAt(i)== 'M'||
		    				s.charAt(i)== 'D'||s.charAt(i)== 'C') 
		    		{
		    			
		    		}else {
		    			break;
		    		}
		    		
		    		
		    		
		    		if(s.length()>15) {
		    			break;
		    		}
		    		
		    		if(s.charAt(i)=='I') 
		    		{
		    			if(i>0)
		    			{
		    				if(s.charAt(i-1)=='V') 
		    				{
		    					//test =test +  1;
		    				}
		    						
		    			}
		    			test = test + 1;
		    			}
		    		
		    		
		    		
		    		
		    		
		    			
		    		
		    		// test for 5 
		    		if(s.charAt(i)=='V') 
		    		{
//		    			if(i>0) 
//		    			{
//		    				if(s.charAt(i-1)=='I') 
//		    				{
//		    				test = test +3;
//		    				}
//		    				else if(i <s.length())
//		    				{
//		    					if(s.charAt(i+1)=='I');
//		    					test = 6;
//		    				}
//		    			}else
//		    			{
//		    				
//		    			}
		    			
		    			if(i>0&&s.charAt(i-1)=='I'&& s.length()==2) 
		    				{
	    				test = 4;
	    				
		    				
		    				}else if (i>1&& s.charAt(i-1)=='I')
			    			{
			    				test = test + 3;
			    				
			    			}
		    			else if (i>1)
		    			{
		    				test = test + 5;
		    				
		    			} else if(i>0) {
		    				test = test +5;
		    			}
		    			else
		    			
		    			
		    			
		    			
		
		    			test =  5;
		    			
		    			
		    			
		    			
		    			
		    		}
		    		
		    		
		    		
		    		
		    		if(s.charAt(i)=='X') 
		    		{

		    			if(i>0&&s.charAt(i-1)=='I'&& i == s.length()-1&& s.length()== 2) 
		    				{
	    				test = 9;
	    				
		    				}
		    			else if (i>1&& s.charAt(i-1)=='I')
		    			{
		    				test = test + 8;
		    				
		    			} else if(i>0) {
		    				test = test +10;
		    			}
		    			else
		    			
		    			
		    			
		    			
		
		    			test =  10;
		    		}
		    		
		    		
		    		
		    		
		    		// test for 50 L
		    		
		    			
		    			

		    		if(s.charAt(i)=='L') 
		    		{

		    			if(i>0&&s.charAt(i-1)=='X'&& i == s.length()-1&& s.length()== 2) 
		    				{
	    				test = 40;
	    				
		    				}
		    			else if (i>1&& s.charAt(i-1)=='X')
		    			{
		    				test = test + 30;
		    				
		    			} else if(i>0&& s.charAt(i-1)=='X') {
		    				test = test +30;
		    			}
		    			else if(i>0) 
		    			{
		    				test = test +50;
		    			}else
		    			
		    			
		    			
		    			
		
		    			test =  50;
		    		}	
		    		
		    		if(s.charAt(i)=='C') 
		    		{

		    			if(i>0&&s.charAt(i-1)=='X'&& i == s.length()-1&& s.length()== 2) 
		    				{
	    				test = 90;
	    				
		    				}
		    			else if (i>1&& s.charAt(i-1)=='X')
		    			{
		    				test = test + 80;
		    				
		    			} else if(i>0&& s.charAt(i-1)=='X') {
		    				test = test +80;
		    			}else if(i>0) {
		    				test = test +100;
		    			}
		    			else
		    			
		    			
		    			
		    			
		
		    			test =  100;
		    		}	
		    		
		    		
		    		
		    		if(s.charAt(i)=='D') 
		    		{

		    			if(i>0&&s.charAt(i-1)=='C'&& i == s.length()-1&& s.length()== 2) 
		    				{
	    				test = 400;
	    				
		    				}
		    			else if (i>1&& s.charAt(i-1)=='C')
		    			{
		    				test = test + 300;
		    				
		    			}else if(i>0&& s.charAt(i-1)=='C') {
		    				test = test +300;
		    			} else if(i>0) {
		    				test = test +500;
		    			}
		    			else
		    			
		    			
		    			
		    			
		
		    			test =  500;
		    		}	
		    		
		    		
		    		
		    		if(s.charAt(i)=='M') 
		    		{

		    			if(i>0&&s.charAt(i-1)=='C'&& i == s.length()-1&& s.length()== 2) //CMI
		    				{
	    				test = 900;
	    				
		    				}
		    			else if (i>1&& s.charAt(i-1)=='C')
		    			{
		    				test = test + 800;
		    				
		    			} else if(i>0&&s.charAt(i-1)=='C') {
		    				test = test +800;
		    			}
		    			else if (i>0)
		    				test = test +1000;
		    			else
		    			
		    			
		    			
		    			
		
		    			test =  1000;
		    		}	
		    		
		    		
		    		
		    	}
		    		
		    		
		    		
		    		
		    		
		    		return test;
		    		
		    		
		    	}
		    	
		

		    	
		    	
		    	/*
		    	if(s.equals("I"))
		    	
		    	
		    	return 1;
		    	
		    	else if (s.equals("II")) 
		    	{
		    		return 2;
		    	}else if (s.equals("III")) 
		    		return 3;
		    	else if(s.equals("IV"))
		    		return 4;
		    	else if(s.equals("V"))
		    		return 5;
		    	
		    	*/
		    	
		    	
		    	
		    	
		    	
				
		        
		    	
		    	
		    	
		   
		    
		    
		    
		    public static void main(String[] args) throws IOException 
		    {
		    	
		    	getCSV();
		    	for(int i = 0; i < rome.size();i++)
		    	System.out.println(rome.get(i));
		    	int count = 0;
		    	int wrong = 0;
		    	for (int i = 0; i < rome.size();i++)
		    	{
		    	count++;
		    	System.out.println(count + " "+romanToInt(rome.get(i)));
		    	if( count != romanToInt(rome.get(i))) {
		    		wrong++;
		    		System.out.println("Bam");
		    		
		    	//System.out.println("Bang");
		    			
		    	}
		    
		    	
		    	}
		    	
		    	System.out.println(wrong +" out of "+count +"are off");
		    	System.out.println(romanToInt("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"));
		    }
		    
		    
		    
		    
		}
		
		
		
		





