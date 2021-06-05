
public class Only_Alpha_Nt_Spl_Char {
	
	/*
	 ASCII value of capital letter alphabets starts from 	 to 90 (A-Z) and the ASCII
      value of small letter alphabet starts from 97 to 122 (a-z). 
	
	 */

	public static void main(String[] args)   
	{  
		
		
		/* 
	//1 way
		
		//declare a string having special characters   
	String str="@#& Selen ium@##";  
	String resultStr="";  
	//loop execute till the length of the string   
	for (int i=0;i<str.length();i++)  
	{  
		
	//comparing alphabets with their corresponding ASCII value  
	if ((str.charAt(i)>64 && str.charAt(i)<91) || (str.charAt(i)>96 && str.charAt(i)<=122 )) //returns true if both conditions returns true  
	{  
		//System.out.println(str.charAt(i));
	//adding characters into empty string   
	resultStr=resultStr+str.charAt(i);  
	}  
	}  
	System.out.println("Result:"+resultStr);  
	
	*/
	
		
		//2 way
		String str= "@#&Se!len iu3m@##.";   
		str = str.replaceAll("[^a-zA-Z]", "");  // ^ nagation - except a-zA-Z remove all 
		System.out.println(str); 
		
		
	}  
	}	