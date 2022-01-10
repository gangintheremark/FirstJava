
public class test_07 {
	public static void main(String[] args) {
		
		int data[] = new int[10];
		int sum =0;
		System.out.print("·£´ıÇÑ Á¤¼öµé : ");
		
		for(int i=0;i<10;i++) {
			data[i] =(int)(Math.random()*10 + 1);
			sum+= data[i];
			System.out.print(data[i] + " ");
		}
		System.out.println();
		
		double avg = (double) sum / 10.0;
		
		System.out.println("Æò±ÕÀº " + avg);
	}
}
