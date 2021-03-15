import java.util.Arrays;

public class Ko
{
	public static void main(String[] args) {
		String str1 = "Bangalore";
		String str2 = "aB";
		
		char str[] = str1.toCharArray();
		char st3[] = str2.toCharArray();
		
		for(int i =0; i<str.length; i++) {
			for(int j =0; j<st3.length; j++) {
				if(str[i] == st3[j]){
					str[i] = '\u0000';
				}
			}
		}
				System.out.println(Arrays.toString(str).replaceAll(",", ""));
				
	}
	
}