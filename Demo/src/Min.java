
public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {12,1,1,3,8,2,45,121,63,552,84,110};
		
		
		
		int min = 0;
		for(int i =0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					min = arr[i];
					arr[i] = arr[j];
					arr[j] = min;
				}
			}
		
		}
		System.out.println(arr[0]);
		
	}

}
