import java.util.Scanner;
public class bodymass {
	public static void main (String[] args){
	Scanner scan= new Scanner(System.in);
    System.out.println("L�tfen boyunuzu (metre cinsinde) giriniz: ");
    float length= scan.nextFloat();
    System.out.println("L�tfen kilonuzu giriniz: ");
    float weight = scan.nextFloat();
	float bodymassindex = weight/(length*length);
	System.out.println("V�cut kitle endeksiniz: "+ bodymassindex);
	
	
	
	}
}
