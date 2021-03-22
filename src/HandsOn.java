import java.util.Scanner;

public class HandsOn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = sc.nextLine();
		
		
		
		if(name.toLowerCase().equals("akil")) 
		{
			System.out.println("Whats popping " + String.valueOf(name.charAt(0)).toUpperCase() + name.replaceFirst(String.valueOf(name.charAt(0)), " ") + "?");
		}
		else if(name.toLowerCase().equals("john")) 
		{
			System.out.println("Wassup " + String.valueOf(name.charAt(0)).toUpperCase() + name.replaceFirst(String.valueOf(name.charAt(0)), "") + "?");
		} 
		else 
		{
			System.out.println("I dont kow you man");
		}
		
		sc.close();

	}

}
