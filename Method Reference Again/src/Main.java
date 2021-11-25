import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		String[] nameArray = {"ben","basili","daagi","nyoko","chamigeigh","Kamjoro","cha pa"};
		System.out.println(Arrays.asList(nameArray));
		
		//using for loop
		for (String s : nameArray) {
			System.out.println(s);
		}
		//using lambda expression
		
		
	}

}
