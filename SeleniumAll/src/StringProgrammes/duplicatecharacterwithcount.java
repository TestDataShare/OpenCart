package StringProgrammes;

public class duplicatecharacterwithcount {

	public static void main(String[] args) {
		String s1= "Vishalshanataramsable";
		int count=0;
		for(int i=0; i<s1.length(); i++)
		{
			for(int j=0; j<s1.length(); j++)
			{
				if(s1.charAt(i) == s1.charAt(j))
				{
					count++;
				}
			}
			
			System.out.println(s1.charAt(i)+"--"+count);
			String d = String.valueOf(s1.charAt(i)).trim();
			s1=s1.replaceAll(d, "");
			count=0;
		}

	}

}
