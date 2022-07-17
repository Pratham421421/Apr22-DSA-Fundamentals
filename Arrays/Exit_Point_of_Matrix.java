package Arrays;

import java.util.Scanner;

public class Exit_Point_of_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

	    // Declaration & Initialization
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int[][] arr = new int[n][m];

	    // INPUT
	    for (int rows = 0; rows <= n - 1; rows++)
	    {
	      for (int cols = 0; cols <= m - 1; cols++) {
	        arr[rows][cols] = sc.nextInt();
	      }
	    }

	    int direction = 0, row = 0, col = 0;
	    while (row >= 0 && row < n && col >= 0 && col < m)
	    {
	      // Direction updation
	      if (arr[row][col] == 1)
	      {
	        direction = (direction + 1) % 4;
	      }

	      // Move One Step
	      if (direction == 0) // East
	      {
	        col++;
	      }
	      else if (direction == 1) // South
	      {
	        row++;
	      }
	      else if (direction == 2) // West
	      {
	        col--;
	      }
	      else // North
	      {
	        row--;
	      }
	    }

	    // Report Exit Point
	    if (direction == 0)
	    {
	      System.out.println(row);
	      System.out.println(col - 1);
	    }
	    else if (direction == 1)
	    {
	      System.out.println(row - 1);
	      System.out.println(col);
	    }
	    else if (direction == 2)
	    {
	      System.out.println(row);
	      System.out.println(col + 1);
	    }
	    else
	    {
	      System.out.println(row + 1);
	      System.out.println(col);
	    }
	  }
}
