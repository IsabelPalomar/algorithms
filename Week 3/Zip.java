
public class Zip {
	public static String compress(String str){
		StringBuffer sb = new StringBuffer();
		if (str != null){
			int size = 0;
			char last = 0;
			for (int i=0; i < str.length(); i++, size++){
				char c = str.charAt(i);
				if (last == 0) last = c;
				if (c != last){
					sb.append(last).append(size);
					size = 0;
					last = c;
				}
				if (i+1 == str.length()){
					sb.append(c).append(size+1);
				}
			}
		}
		if (str.length() >= sb.length()){
			return sb.toString();
		}
		return str;
	}
	
	public static void main(String[] args) {
		System.out.println(Zip.compress("AAAAAABCDE"));
	}

}
