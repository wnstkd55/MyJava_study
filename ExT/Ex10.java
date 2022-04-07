package ExT;

public class Ex10 {

	public static void main(String[] args) {
		int[] arr = new int[99];
		int x;
		int y;
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+1;
			 x = arr[i]/10;
			 y = arr[i]%10;
			 
			 if((x==3)||(x==6)||(x==9)&&(y==3)||(y==6)||(y==9)) {
				 System.out.println(arr[i]+" ¹Ú¼ö Â¦Â¦");
			 }
			 else if((x==3)||(x==6)||(x==9)) {
				 System.out.println(arr[i]+" ¹Ú¼ö Â¦");
			 }
			 else if((y==3)||(y==6)||(y==9)) {
				 System.out.println(arr[i]+" ¹Ú¼ö Â¦");
			 }
		}
	}

}
