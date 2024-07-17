package arraysPrograms;

public class equalityOfArray {

	public static void main(String[] args) {
		int a[]= {10,20,50,70};
		int b[]= {10,20,500,70};
		boolean status= true;
		if(a.length == b.length)
		{
			for( int i=0; i<a.length; i++)
			{
				if(a[i] != b[i])
				{
					status =false;
				}
			}
		}
		else
		{
			status=false;
		}
		if(status == true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}

	}

}
