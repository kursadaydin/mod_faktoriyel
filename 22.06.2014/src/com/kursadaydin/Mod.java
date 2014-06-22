package com.kursadaydin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mod {
	
	
	public static int modbulma( int sayi1, int mod ) {
					
		int modresult=sayi1%mod;
		return modresult;
	}
	
	public static double faktoriyel (double sayi){
		
		double sonuc = 1;
		
		for (double i = sayi; i > 1; i--) {
			
			sonuc *= i;
			
		}
		
		
		return sonuc;
				
	}
	
	

	public static boolean ciftMi(double sayi){
		if ( sayi%2 ==0 ){
			return true;
		}else{
			return false;
		}
			
		
		
		
		
			
				
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		Scanner sc =new Scanner(System.in);
		/*System.out.println("Lütfen Sayýyý Giriniz....");
		int sayi1 = sc.nextInt();
		
		System.out.println("Lütfen Modu Giriniz....");
		int mod = sc.nextInt();*/
		
		//modbulma(sayi1, mod);
	
	
	//System.out.println(modbulma(sayi1, mod));
	
	//System.out.println(faktoriyel(5));
	
	
	ArrayList<Double> ciftliste = new ArrayList<Double>();
	ArrayList<Double> tekliste  = new ArrayList<Double>();
	
	
	for (int i = 0; i < 5; i++) {
		
		System.out.println("Lütfen bir sayi giriniz....");
		double input =sc.nextDouble();
		
		if (ciftMi(input)) {ciftliste.add(input);}
		
		else {tekliste.add(input);}
			
	}
	
	for (int i = 0; i < tekliste.size(); i++) {System.out.println(tekliste.get(i));}
	

	}

}
