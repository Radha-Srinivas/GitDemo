

/*
 I/P : selenium
 O/P : s*l*n*u*m  
 
 */
public class selenium_star_InBetween {
	
	public static void main(String[] args) {
		
		String str="seleniumt";                        //8
		//String str = "sentinelese";
		int i=0;
		System.out.print("'");
		
		while(i<str.length())                        //8
		{
			//if(str.length()%2!=0)                    // 8%2 = 0 , 0!=0 => true
			//{
				
				System.out.print(str.charAt(i)+"*");     // i=s => print s
				i+=2;                       		 // i=0, i+2=2
				
				//  if(i<str.length())				 // 0<8 => true
				  
				 // System.out.print("*");             // print *
				 
			}
		/*	
		else
			{
				System.out.print(str.charAt(i)+"*");
				i+=2;
				
			}
			*/
		
		System.out.print("'");
		//}
		
		
	
		
	}

}
