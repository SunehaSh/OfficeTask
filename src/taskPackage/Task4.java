package taskPackage;

public class Task4 {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9,3};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]+"array elements are equal which is"+arr[j]);
				}
			}
		}
	}

}
