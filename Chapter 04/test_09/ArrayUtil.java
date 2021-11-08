package test_09;

public class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {

		int i;
		int[] data = new int[a.length + b.length];
		for (i = 0; i < a.length; i++)
			data[i] = a[i];
		for (int j = i; j < (b.length + a.length); j++)
			data[j] = b[j-a.length];

		return data;
	}

	public static void print(int[] a) {
		System.out.print("[");
		for (int i = 0; i < a.length; i++)
			System.out.print(" " + a[i] + " ");
		System.out.print("]");
	}
}

class StaticEx {
	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}

}
