import java.util.*;
public class uniqueString {
	public static void main(String args[]){
		String m1 = "abasmkvlsmv";
		String m2 = "sdfsadojfiosajfp";
		System.out.print(check(m1));
		System.out.print(check(m2));
	}
	public static boolean check(String m){
		if(m == null || m.length() <= 1){
			return true;
		}
		if(m.length() >32){
			return false;
		}
		long  result = 0;
		for(int i = 0;i < m.length();i++){
			long temp = m.charAt(i) - 'a';
			int r = 1<<temp;
			if((result & r) == 0){
				result = result|r;
			}else{
				return false;
			}
			
		}
		return  false;
	}
}
