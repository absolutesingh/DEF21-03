package arrays;

public class JaggedArrays {

	public static void main(String[] args) {
		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[4];
		
		//We cannot use initializers list here because it doesn't create an object in heap
		int arr2[][] = new int[3][];
//		arr2[] = {1,2,3};
		
		arr2[0] = new int[] {1,2,3};
		arr2[1] = new int[] {4,5};
		arr2[2] = new int[] {6,7,8,9};
		
		for(int rows = 0; rows < arr2.length; rows++)
		{
			for(int cols = 0; cols < arr2[rows].length; cols++)
			{
				System.out.print(arr2[rows][cols] + " ");
			}
			System.out.println();
		}
		
	}

}
