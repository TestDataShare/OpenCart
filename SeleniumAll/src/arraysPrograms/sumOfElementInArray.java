package arraysPrograms;

public class sumOfElementInArray {

	public static void main(String[] args) {
		int a[]= {12,45,3,5,65,4,45};
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum =sum+a[i];
		}
		System.out.println(sum);

	}

}
