package ExT;

public class Ex09 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		int sum=0;
		double avg = 0.0;
		
		for (int i = 0; i < arr.length; i++) {
			int n = (int)(Math.random()*10+1);
			arr[i] = n;
			System.out.println("·£´ýÇÑ Á¤¼öµé: "+arr[i]);
			
			sum+=arr[i];
			avg=sum/arr.length;
		}
		
		System.out.println("Æò±ÕÀº "+avg);
	}

}
