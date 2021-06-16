package day8;
//enum color{red,green,blue}

public class Main {
	enum color{red,green,blue}
	public static void main(String[] args) {
//		color c;
//		c = color.red;
//		System.out.println(color);
//		
		int[] arr1 = {1,1,1};
		int[] arr2 = {1,1,1};
		int[] arr3 = arr1;
		System.out.println(arr1.equals(arr3));
		System.out.println(arr1==arr3);
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		System.out.println(arr3.hashCode());
		System.out.println("");
		
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = "abc"; 
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		System.out.println("");

		System.out.println(str1.equals(str3));
		System.out.println(str1 == str3);
			
	}
}
