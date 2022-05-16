package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
			List<String> list = new ArrayList<String>();
	        list.add("1");
	        list.add("2");
	        list.add("3");
	        list.add("1");
	        list.add("4");
	        list.add("5");
	        list.add("1");
	        list.add("6");
	        for (int b=0;b<=list.size()-1;b++)
	        {
	        	if ("1"==list.get(b))
	        	{
	        		a++;
	        	}
	        }
	     System.out.println("print no of 1 "+ a);

	     

	}

}
