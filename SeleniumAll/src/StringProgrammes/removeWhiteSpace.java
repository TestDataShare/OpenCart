package StringProgrammes;

public class removeWhiteSpace {

	public static void main(String[] args) {
		String s1= "hi    I am Using              Selenium";
		s1=s1.replaceAll("\\s","");
		System.out.println(s1);
	}

}
