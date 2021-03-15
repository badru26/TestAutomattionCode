
public class Duop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ab = "hello orld dfhljkas asslk";
		
//		char[] car = ab.toCharArray();
		int count = 0;
		for(int i =0; i<ab.length(); i++) {
			
//			for(int j = i+1; j<ab.length(); j++) {
				
				if(ab.charAt(i) == 'l') {
//					System.out.println(car[j]);
//					break;
					count++;
//				}
			}
			
		}
		System.out.println(count);

	}

}
