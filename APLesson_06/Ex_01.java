import java.util.Scanner;
public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = kb.next();
		
		for (int i =0; i <= word.length(); i++)
		{
			System.out.println(word);
		}
	}
}