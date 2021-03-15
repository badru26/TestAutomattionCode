import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Df{
	
	public static void main(String[] args) {
	
//	int a[] = {1,2,3,4,5,6};
//	
//	for(int i =0 ; i<a.length; i++) {
//		
//		if(a[i]%2==0) {
//			System.out.println(a[i]);
//		}
//	}
//	
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "abc");
		map.put(2, "kjkj");
		map.put(3, "lkhlkjkl");
		map.put(4, "yuiy");
		map.put(5, "abnbn");
		map.put(6, "ioioi");
		
		int i = 1;
			for(Map.Entry m : map.entrySet() ) {
				if(i%2==0)
					System.out.println(m.getValue());
			i++;
			}
		
		
		
		
		
		
		
		
	}
	
	
}