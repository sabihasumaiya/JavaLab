
public class NegativePosative {

	public static void main(String[] args) {

		int[] numbers = { -11, -22, 36, 56, -2, 0, 99, 12 };
		int[] negArray = new int[numbers.length];
		int[] posArray = new int[numbers.length];
		int k = 0, j = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				negArray[k] = numbers[i];
				k++;
			}
		if (numbers[i] >= 0) {
			posArray[j] = numbers[i];
			j++;
		}
		}
		System.out.println("Ngative numbers :\n");
		for(int a=0; a<k;a++)
		System.out.println(negArray[a]);
		System.out.println("Posetive Numbers:\n");
		for(int b=0; b<j;b++)
			System.out.println(posArray[b]);
	}
	}
