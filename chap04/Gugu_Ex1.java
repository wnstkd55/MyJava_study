package chap04;

public class Gugu_Ex1 {

	public static void main(String[] args) {
		for(int i =1; i<20; i++) {
			for(int j = 1; j<20; j++) {
				
				if(i % 2 == 0) {
					continue;
				}
				
				System.out.println(i+" * "+j+" = "+ (i*j));
				
			}
			if(i % 2 == 0) {
				System.out.println("====="+(i+1)+"??======");
			}
			
		}
	}

}
