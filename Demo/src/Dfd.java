import java.util.HashMap;
import java.util.Map;

public class Dfd {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1 , "one");
		map.put(2 , "two");
		map.put(3 , "three");
		map.put(4 , "four");
		map.put(5 , "five");
		map.put(6 , "six");
		
		int i = 1;
		for(Map.Entry mapp : map.entrySet()) 
		{
			if(i%2==0)
				System.out.println(mapp.getValue());
			i++;
		}
		
		
		
	}

}
