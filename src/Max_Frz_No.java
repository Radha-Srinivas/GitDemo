/*
int [] arrA = {4, 1, 5, 2, 1, 5, 9, 8, 6, 5, 3, 2, 4, 7};
Output: Element repeating maximum no of times: 5, maximum count: 3
*/

public class Max_Frz_No {
	
	 public void MaxRepeatingElement(int [] arr){
	        int maxCounter = 0;
	        int element=0;
	        int counter =1;
	        for (int i = 0; i <arr.length ; i++) {
	           // int counter =1;
	            for (int j = i+1; j <arr.length ; j++) {
	                if(arr[i]==arr[j]){
	                    counter++;
	                }
	            }
	            if(maxCounter<counter){
	                maxCounter=counter;
	                element = arr[i];
	            }
	        }
	        System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCounter);
	    }

	    public static void main(String[] args) {
	     int [] arr = {4, 1, 5, 2, 1, 5, 9, 8, 6, 5, 3, 2, 4, 7};
	     Max_Frz_No m = new Max_Frz_No();
	     m.MaxRepeatingElement(arr);
	    }

}
