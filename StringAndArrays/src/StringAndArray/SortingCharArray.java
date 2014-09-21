package StringAndArray;

public class SortingCharArray {
	String str;
	
	SortingCharArray(String temp){
		char[] test = temp.toCharArray();
		java.util.Arrays.sort(test);
		str = new String(test);
	}

	public static void main(String[] args) {
		SortingCharArray obj = new SortingCharArray("abhishekagrawal");
		System.out.println(obj.str);

	}

}
