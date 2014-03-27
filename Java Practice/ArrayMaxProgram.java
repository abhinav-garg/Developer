// Program for finding the maximum element in an array 
public class ArrayMaxProgram	{
	static int arrayMax(int[] A, int n)	{
		int currentMax = A[0];
		for (int i = 1; i< n; i++)	{
			if (currentMax < A[i])
				currentMax = A[i];
		}
	return currentMax;
	}

	public static void main(String args[])	{
		int[] num = {10, 15, 3, 5, 56, 107, 22, 16, 85};
		int n = num.length;
		System.out.println("The maximum element is " + arrayMax(num, n) + ".");
	}
}