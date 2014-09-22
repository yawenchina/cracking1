import java.util.*;
public class checkPermutation {
	public static void main(String args[]){
		String m1 = "aba";
		String m2 = "sdfsadojfiosajfp";
		String m3 = "aab";
		System.out.print(check(m1, m2));
		System.out.print(check(m1,m3));
	}
	public static boolean check(String m1, String m2){
		char[] charm = m1.toCharArray();
		Arrays.sort(charm);
		String m11= new String(charm);
		
		char[] charm1 = m2.toCharArray();
		Arrays.sort(charm1);
		String m111 = new String(charm1);
		if(m11.equals(m111)){
			return true;
		}
		return false;
	}
}
