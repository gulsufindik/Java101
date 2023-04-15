package com.gulsufindik;
import java.util.Scanner;

public class Main {

	static void RecursiveMethod () {
	//Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. 
	//Her çıkarma işlemi sırasında ekrana son değeri yazdırın. 
	//Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. 
	//Yine her ekleme işleminde sayının son değerini ekrana yazdırın.		
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz :");
        int n = input.nextInt();

      int ilkSayi = n;
      System.out.print("Çıktı :" +n+" ");

      for (int i=n; i>0;i-=5){
          ilkSayi-=5;
          System.out.print(ilkSayi+" ");
      }
      
      int sonSayi =ilkSayi;
      for (int i=sonSayi;i<n;i+=5){
          sonSayi+=5;
          System.out.print(sonSayi+" ");

      }

    }
    public static void main(String[] args) {

        RecursiveMethod();
    }
}