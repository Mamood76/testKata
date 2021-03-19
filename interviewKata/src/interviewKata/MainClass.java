package interviewKata;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		

	}
	
	
	public static Integer first(List<Integer> arr) {
	
		Set<Integer> r = new HashSet<Integer>();
		
		for(int i = 0; i < arr.size(); i++) {
			
			if(r.contains(arr.get(i))) {
				return arr.get(i);
			}else {
				r.add(arr.get(i));
			}
		}
		return  null;
		
	}

}
