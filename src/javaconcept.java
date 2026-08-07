import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class javaconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		String job = "F NT job";
		char letters = 'r';
		double kt = 7.99;
		boolean mycard = true;
		int a;
		int b;
		// string is an object // string literal
		String ac = "Zubair Ahmed Xubair";
		String ab = "Zubairs Ahmeds";
		// new
		String ad = new String("Object ");

		// int[] arr= new int[5];
//		arr[0]=1;
//		arr[1]=2;
//
//		int [] arr2={1,2,3,4,5};
		String[] name = { "Xubair", "Ahmed", "7073", "lol" };
		int[] numbers = { 1, 2, 3, 4, 5 };
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		System.out.println("Total Sum: " + sum);
		javaconcept jc = new javaconcept();
		String h = jc.display(4);
		System.out.println(h);
		display2(8);

//
		// for (int i=0;i<arr2.length;i++)
//		{ if(arr2[i]%2==0) {
		// System.out.println(arr2[i]);

		// } else {
		// System.out.println("fk u");
		// }

		// }

		// for (int j=0;j<name.length;j++)
//		{
		// System.out.println(name[j]);

//		for (String g: name) {
		// System.out.println(g);
//		}

		// When we don't want to declear the size of the arry we use arrylist a class in
		// java.

//	List<String> c = new ArrayList<String>();
//	c.add("X");
//	c.add("U");
//	c.add("B");
//c.add("A");
//	c.add("I");
//	c.add("R");

// (int k=0;k<c.size();k++) {
//		System.out.println(c.get(k));
//	}
//	System.out.println("***********");
//	for ( String val : c) {
//		System.out.println(val);
//	}

//	System.out.println(c.contains("X"));
//	System.out.println("***********");
		// converting arry into arry list
//	List<String> m = Arrays.asList(name);
//	System.out.println(m.contains("Xubair"));

		// String[] splitterstring = ac.split(" ");
//	System.out.println(splitterstring[0]);
//	System.out.println(splitterstring[1]);

//	String[] splitterstring2 = ac.split("Ahmed");
		// System.out.println(splitterstring2[0]);
///	System.out.println(splitterstring2[1]);
//	System.out.println(splitterstring2[1].trim());
//
//	for (int i=0;i<ac.length();i++) {
		// System.out.println(ac.charAt(i));
		// }
//	for (int ki=ac.length()-1;ki>=0;ki--) {
		// System.out.println(ac.charAt(ki));
		// }
	}

	public String display(int i) {
		System.out.println("love" + i);
		return "love 2";

	}

	public static String display2(int i) {
		System.out.println("static love" + i);
		return "love 2";

	}
}
