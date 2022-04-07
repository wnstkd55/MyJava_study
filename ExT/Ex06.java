package ExT;

public class Ex06 {

	public static void main(String[] args) {
		int max = 0;
		int[] arr = {4,5,1,3,7,10};
		
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("최대값은: "+max);
	}

}
