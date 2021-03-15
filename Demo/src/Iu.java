
public class Iu {

	public static void main(String[] args) {
		
		int num1 = 6;
		int num2 = 4;
		int num3 = 2;
		
		int arr[] = {num1, num2, num3};
		int temp;
		
		for(int i =0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{ 
				if(arr[i]>arr[j])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					
				}
			}
		}
		
		System.out.println(arr[0]+","+arr[1]+","+arr[2]);
		
		
	}

}
