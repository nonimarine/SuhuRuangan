package com.cilsy;

import java.util.Scanner;

public class SuhuRuangan {
	
		 public static void main(String[] args) {
		 System.out.println("======== KATEGORI - SUHU ========");

		 System.out.println("===================================================");
		 
		 Scanner input = new Scanner(System.in);
		 System.out.print("Input Suhu : ");
		 
		 int suhu = input.nextInt();
		 String category = new SuhuRuangan().getCategory(suhu);
		 
		 switch (category) {
		 
	 	 case "Beku":
		 System.out.println("Ukuran suhu adalah " + suhu + " Celcius. " + "Termasuk kategori Beku");
		 break;
		 
	 	 case "Dingin":
	 	 System.out.println("Ukuran suhu adalah " + suhu + " Celcius. " + "Termasuk kategori Dingin");
		 break;

			 
		case "Sejuk":
			 System.out.println("Ukuran suhu adalah " + suhu + " Celcius. " + "Termasuk kategori Sejuk");
			 break;
			 
			 case "Sedang":
				 System.out.println("Ukuran suhu adalah " + suhu + " Celcius. " + "Termasuk kategori Sedang");
				 break;
			 
			 case "Panas":
				 System.out.println("Ukuran suhu adalah " + suhu + " Celcius. " + "Termasuk kategori Panas");
				 break;
			 
			 case "Mendidih":
				 System.out.println("Ukuran suhu adalah " + suhu + " Celcius. " + "Termasuk kategori Mendidih");
				 break;
		 
		 
		 default:
		 System.out.println("Ukuran suhu yang anda masukan salah");
		 break;
		 }
		 }
	 
			 private String getCategory(int suhu) {
			 if (suhu >= 0)
			 return "Beku";
			 
			 else if (suhu >= 1 && suhu <= 10)
			 return "Dingin";
				 
			 else if (suhu >= 11 && suhu <= 20)
			 return "Sejuk";
				 
			 else if (suhu >= 21 && suhu <= 25)
			 return "Sedang";
				 
			 else if (suhu >= 26 && suhu <= 99)
			 return "Panas";
				 
			else if (suhu >= 100)
			return "Mendidih";
			
			 else
			 return "Invalid";
		 

			 }
	}
