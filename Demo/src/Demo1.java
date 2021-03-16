
public class Demo1 {

	public static void main(String[] args) {
		
		int[] arr = {12,11,22,1,35,2,1,5,44,1,6};
	
		int min=0;
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1 ; j<arr.length; j++)
			{
				if(arr[i] < arr[j]) {
					min = arr[i];
					arr[i] = arr[j];
					arr[j] = min;
				
				}
			}
		}
		System.out.println("yuyhu");
		System.out.println(arr[1]);
	}

}
