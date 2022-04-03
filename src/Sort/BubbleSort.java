package Sort;

public class BubbleSort {
	public static void main(String arg[]) {
		int[] sort = {6,1,8,5,3};
		
		for(int i = sort.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(sort[j] > sort[j+1]) {
					int temp = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = temp;
				}
			}
		}
		
		for(int i = 0; i < sort.length;i++) {
			System.out.print(sort[i] + " ");
		}
	}
}
