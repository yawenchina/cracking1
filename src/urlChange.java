
public class urlChange {
	public static void main(String args[]){
		String m1 = " Mr jong dsfaadsa saf        ";
		String m2 = "dsfa asdfas sadf sdaf         ";
		System.out.print(change(m1,17));
		System.out.print(change(m2,18));
	}
	public static String change(String m, int length ){
		 char[] array = m.toCharArray();
		 int space = 0;
		 boolean s = false;
		 for(int i = 0; i < array.length; i++){
			 if(array[i] ==' '){
				 space++;
				 
			 }
		 }
		 char[] array1 = new char[length+space*2];
		 int k = length-1;
		 int j = array1.length;
		 array1[j] = '\0';
		j--;
		 while(k >= 0){
			 if(array[k] == ' '){
				 array[j--] = '%'; 
				 array[j--] = '2'; 
				 array[j--] = '0'; 
			 }else{
				 array[j--] = array[k--];
			 }
		 }
		 return new String(array);
	}
}
