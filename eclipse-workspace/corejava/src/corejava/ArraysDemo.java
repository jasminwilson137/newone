package corejava;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] ar= {10,20,30,40,50};
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		for (int i : ar) {
			System.out.println(i);
		}
		
		int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println(mat[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		int[] star= {110,20,310,90,50};
		
		for (int i = 0; i < star.length; i++) 
		{
			for (int j = i+1; j < star.length; j++) 
			{
				int temp = 0;
                if (star[j] < star[i]) 
                {
 
                    temp = star[i];
                    star[i] = star[j];
                    star[j] = temp;
                }
            }
 
            // Printing sorted array elements
            System.out.print(star[i] + " ");
		}
	}
}
