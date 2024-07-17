package arraysPrograms;

public class maxAndMinElement {

	public static void main(String[] args) {
		int a[]= {10,20,30,50,70,110,8,5,6,8};
		int max= a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i] > max)   // for minimum a[i] < max
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
