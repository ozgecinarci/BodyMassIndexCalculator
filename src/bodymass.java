import java.util.Scanner;
public class bodymass {
	public static void main (String[] args){
	Scanner scan= new Scanner(System.in);
    System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
    float length= scan.nextFloat();
    System.out.println("Lütfen kilonuzu giriniz: ");
    float weight = scan.nextFloat();
	float bodymassindex = weight/(length*length);
	System.out.println("Vücut kitle endeksiniz: "+ bodymassindex);
	
	
	
	}
}
