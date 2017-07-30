/* @author Matthew J. McKay
 * @studentNumber T00057652
 * @university Thompson Rivers University
 */


public class Array{
	private int i;
	
private void populateArray(int arrayLength){
		final int length = arrayLength;		
		final int myArray[] = new int[length];
		for(i=0;i<myArray.length;i++){
			myArray[i] = (int)(Math.random()*1000);
		}
		for(i=0;i<myArray.length;i++) {
			 System.out.print(myArray[i] + " , ");
			 	if(i % 30 == 0)
			 		System.out.println(); 
		
			} 	
	}
}


	
	

