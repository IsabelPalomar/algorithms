
public class CadenasCompresas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CadenasCompresas cadenasCompresas = new CadenasCompresas();
		System.out.print(cadenasCompresas.comprimir("aaaabbbbc"));
	}
	public static String comprimir(String cadena){
		int count = 1;
		StringBuffer compResult = new  StringBuffer();
		for(int i = 0; i < cadena.length(); i++){
			String temp = String.valueOf(cadena.charAt(i));
			if((i+1) < cadena.length() && temp.equalsIgnoreCase(String.valueOf(cadena.charAt(i+1))))
				count++;
			else{
				compResult.append(temp +count);
				count=1;
			}
		}
		if(compResult.toString().length() < cadena.length())
			return compResult.toString();
		return cadena;
	}
}
