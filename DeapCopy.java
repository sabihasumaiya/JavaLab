package deapcopy;

public class DeapCopy {
	public static void main(String[] args) { 
		int [] numbers = {-11,71,-23,-92,103,0,-34,89,-8};
		int [] newArray = new int[numbers.length];
		for (int i = 0; i<numbers.length;i++)
	System.arraycopy(numbers,0,newArray,0,numbers.length);	
		for (int i = 0; i<numbers.length;i++)
			System.out.println(newArray[i]);
	}
}