package lesson021.okulapp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Utility {
	
	private static Scanner scanner = new Scanner(System.in);

	// String tarih ="12/12/1992";
	/**
	 * 
	 * @param stringDate gun ay yıl şeklinde gelen string "dd/MM/yyy"
	 * @return Localdate türünde bir veri
	 */

	public static LocalDate stringToLocalDateGunAyYil(String stringDate) {
		LocalDate date = null;
		try {
			String format = "dd/MM/yyy";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
			date = LocalDate.parse(stringDate, formatter);
			return date;
		} catch (Exception e) {
			System.out.println("Geçerli bi tarih formatı giriniz gun/ay/yıl şeklinde");

		}
		return date;

	}
	/**
	 * 
	 * @param stringDate gun ay yıl şeklinde gelen string "dd/MM/yyy"
	 * @return Localdate türünde bir veri
	 */


	public static LocalDate stringToLocalDateDayMonthYear() {
		System.out.println("Lütfen gun/ay/yıl şeklinde bir tarih giriniz");
		String stringDate = scanner.nextLine();
		LocalDate date = null;
		try {
			String format = "dd/MM/yyy";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
			date = LocalDate.parse(stringDate, formatter);
			return date;
		} catch (Exception e) {
			System.out.println("Geçerli bi tarih formatı giriniz gun/ay/yıl şeklinde");

		}
		return date;
	}
}
		