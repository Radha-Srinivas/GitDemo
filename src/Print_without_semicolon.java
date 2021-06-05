

public class Print_without_semicolon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<1;System.out.println("Hello World"))
		{
			i++;
		}
		
		/*
		if(System.out.println("Hello World")==null)
		{
			
		}
		*/
		
		// Print the sentence next line if space is found
		String str1=" I am Radha";  
        
        //Removes the white spaces using regex  
        str1 = str1.replace(" ", "\n");  
          
        System.out.println("String after removing all the white spaces : " + str1);  
        
        
        String str2= "Hello";
        String str3= new String("Hello").intern();
        System.out.println("Are both are same : " +(str2 == str3));
    
	}

}
