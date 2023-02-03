package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SteamApi {

	public static void main(String[] args) {
//		ArrayList<Integer> al= Arrays.asList(25,26);
//		
//		al.stream().reduce(null);
//		
		
		List<Integer> number = Arrays.asList(2,3,4,5,8);
		int  even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
			    System.out.println(even);
		
		
		
	}
}
