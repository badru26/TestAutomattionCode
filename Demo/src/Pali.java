
public class Pali {

	public static void main(String[] args) {
		
		
		String ab = "abba";
		
		if(palinddrome(ab)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

		
		
	}
	
	static boolean palinddrome(String a){
		
		int i = 0 , j = a.length()-1;
		while(i<j) {
			if(a.charAt(i) != a.charAt(j)) 
				return false;
			i++;
			j--;
		}
		
		
		return true;
		
	}

}
