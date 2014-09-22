
public class isSubString {
	public static void main(String args[]){
		String m = "watermellon";
		String n = "mellonwater";
		System.out.print(check(m, n));
	}
	public static boolean check(String m,String n){
		if(m.length() > n.length()){
			//if(isSubString(m,n)){
			if(true){
				return true;
			}else{
				return false;
			}	
			}
		if(m.length() < n.length()){
			return false;
		}
		return check(m+m , n);
	}
}
