import java.util.Scanner;

public class HesapMakinesi {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String a=" ";
		int toplam=0;
		System.out.print("Sayi Gir: ");	
		int sayi1=scan.nextInt();
        
		System.out.print("Yapilacak islem: ");
		a=scan.next();

		System.out.print("Sayi Gir: ");
		int sayi2=scan.nextInt();
		switch(a){

			case "+":
				toplam=sayi1+sayi2;
				System.out.println("Sonuc:"+toplam);
				break;
		}
	}

	}