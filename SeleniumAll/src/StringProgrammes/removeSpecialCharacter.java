package StringProgrammes;

public class removeSpecialCharacter {

	public static void main(String[] args) {
		String s = "wel@#$@%^come)(*&^%%Vishal&&Sable  9867";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
