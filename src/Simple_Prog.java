import java.io.IOException;

public class Simple_Prog {
	
	
	
	/*  1
	 * public static void main(String[] args) { int x = 10*10-10;
	 * System.out.println(x); }
	 */
	
	//   2 
	//  catch(IOException | Exception e) {    In Teh catch either we need to remove IOException OR need to throws IOException
	/*
	 * public static void main(String[] args) {
	 *  try { 
	 *  throw new IOException("Hello"); }
	 * catch(IOException | Exception e) {
	 * System.out.println(e.getMessage()); } } }
	 */

	//  3. Input -> String str = "AABACCADDA";
	 //Find the occurence of characters prsent inside the String?
	

	// 4. 2nd largest integer in an Integer Array. 
	
	//5. int_Array -> 2nd largest in the array
	//int[] int_Array={10,32,3,5,47};
	
	
	//  6. Write a Program to find whether String is Palindrome or not
	
	
	// 7.  int[] int_Array={1,9,8,19,4,1...............1000 items};
	//Which 3 consecutive no. are there in the Array has maximum sum?
	//		1,2,3 _ 2,3,4 _ 3,4,5 _ ....


   // 8.Input: "I AM  in   TSYS"
//	Write a genric way so that I get output as "I AM in TSYS".

	
	// 9.
	
	/*
	 * public class Super { public int index = 1; }
	 * 
	 * static class App extends Super { public App(int index) { this.index = index;
	 * } public static void main(String args[]) { App myApp = new App(10);
	 * System.out.println(myApp.index); } }
	 */


	//10 . Wonot execute bcs  class adder should be 'static' and its a overload no name or parametr should be same
	
	/*
	 * class Adder{ 
	 * static int add1(int a,int b){
	 *  return a+b; } 
	 *  static double add(int a,int b){ 
	 *  return a+b; } }
	 * 
	 * 
	 * public static void main(String[] args){ System.out.println(Adder.add(11,11));
	 * }
	 */
		
	//11.2. Find out the middle charcater?
	//String str="Hellojava";
	
	// Function that prints the middle
    // character of a string
	/*
	 * public static void printMiddleCharacter(String str) { // Finding string
	 * length int len = str.length(); System.out.println("Length is :" +len);
	 * 
	 * // Finding middle index of string int middle = len / 2;
	 * 
	 * // Print the middle character // of the string
	 * System.out.println(str.charAt(middle)); }
	 * 
	 * // Driver Code public static void main(String args[]) { // Given string str
	 * String str = "Hellojava";
	 * 
	 * // Function Call printMiddleCharacter(str); }
	 */

	//12. O/P === AUTOMATION   (in syso  s1=s2 -> last s2 value it will print   
	//                                   s2=s1 -> last s1 value it will print 
	/*
	 * public static void main(String[] args) { String s1 = new
	 * String("automation"); String s2 = new String("AUTOMATION");
	 * System.out.println(s1 = s2); }
	 */
	
	
	// 13. Strings Anagram
	
	// 14. 
	public static void main(String args[]){
	 
	  String helloWorld="This is hello world";
	  System.out.println("length of helloWorld string :"+getLengthOfString(helloWorld));
	  System.out.println("Completed");
   System.out.println("Cheking for Result \n");
   
    String s1 = new String("automation");
     String s2 = new String("AUTOMATION");
	 System.out.println(s1 = s2); 
	 
	  }
	 
	  public static int getLengthOfString(String str)
	  {
	    int i=0;
	  try{
	   for(i=0;;i++)
	   {
	    str.charAt(i);
	   }
	 
	  }
	  catch(Exception e)
	  {
	 
	  }
	  return i;
	 }
	
}
