package arraysPrograms;

public class linearSearch {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,10,20,30,90};
		 int search = 500;
		 
		 for(int i=0; i<a.length; i++)
		 {
			 if(a[i] == search)
			 {
				 System.out.println("Seraching element are found");
				 break;
			 }
		 }
		 System.out.println("Element not found");
		

	}

}
