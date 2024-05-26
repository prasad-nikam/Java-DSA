
public class b_c{
	public static int b2c(int bin){
		int dec=0,power=0,lastDigit;
		while (bin>0) {
			lastDigit=bin%10;
			dec+=lastDigit*(int)((Math.pow(2, power)));
			power++;
			bin/=10;
		}
   		return dec;
	}
	public static void main(String[] args) {

		System.out.println(b2c(11));
	}
}