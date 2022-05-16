package week3.day2;

import java.util.Arrays;

public class FindSecondLargest {
	public static void main(String args[]){
	      int array[] = {3,2,11,4,6,7};
	      int size = array.length;
	      Arrays.sort(array);
	      System.out.println("sorted Array ::"+Arrays.toString(array));
	      int res = array[size-2];
	      System.out.println("2nd largest element is ::"+res);
	   }
	}


