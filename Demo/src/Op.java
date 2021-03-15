
public class Op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int r , sum = 0 , temp;
		int val = 4514;
		
		temp = val;
		while(val>0) {
			
			r = val%10;
			sum = (sum*10)+r;
			val = val/10;
			
		}
		
		if(temp == sum)
			System.out.println("alindrome");
		
		
		
	}

}
