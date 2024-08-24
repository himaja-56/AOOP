package junit;

public class BinaryToDecimal {
	public static int convertBinaryToDecimal(String binary) {
		int decimal = 0;
		int length = binary.length();
		for(int i = 0;i<length;i++) {
			if(binary.charAt(length-1-i)=='1') {
				decimal+=Math.pow(2, i);
			}
		}
		return decimal;
	}

}
