
public class compressString {
	public static void main(String args[]){
		String m = "aaaabbbbbdddddaaaa";
		String n = "dsfdsjomdddddd";
		System.out.println(compress(m));
		System.out.print(compress(n));
	}
	public static String compress(String input){
		if(input == null || input.length() <= 1){
			return input;
		}
		int count = doCount(input);
		if(count < input.length()){
			
			return compressString(input);
		}else{
			return  input;
		}
		
	}
	public static int doCount(String input){
		char temp = input.charAt(0);
		int count =1;
		int length = 0;
		for(int i = 1; i < input.length(); i++){
			if(temp == input.charAt(i)){
				count++;
			}else{
				if(count < 9){
					length+=2;
				}else{
					length+=3;
				}
				temp = input.charAt(i);
				count = 1;
			}
		}
		return length;
	}
	public static String compressString(String input){
		StringBuffer m = new StringBuffer();
		int count = 1;
		char temp = input.charAt(0);
		int length = 0;
		for(int i = 1; i < input.length(); i++){
			if(temp == input.charAt(i)){
				count++;
			}else{
				m.append(temp);
				m.append(count);
				temp = input.charAt(i);
				count = 1;
			}
		}
		return m.toString();
	}
}
