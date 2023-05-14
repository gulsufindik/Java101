package lesson020;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class SiparisGunu {

	public static void main(String[] args) {
		 // Alışveriş tarihi ve fatura tarihi
        LocalDate alisverisTarihi = LocalDate.of(2023, 4, 20);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Fatura tarihini girin (yıl-ay-gün formatında): ");
        String faturaTarihiStr = scanner.nextLine();
        LocalDate faturaTarihi = LocalDate.parse(faturaTarihiStr);

        // Alışveriş tarihi fatura tarihinden önce mi sonra mı kontrol edelim
        if (alisverisTarihi.isBefore(faturaTarihi)) {
            System.out.println("Alışveriş tarihi fatura tarihinden önce.");
        } else if (alisverisTarihi.isAfter(faturaTarihi)) {
            // Fatura tarihine kaç gün kaldığını hesaplayın
            Period kalanSure = Period.between(LocalDate.now(), faturaTarihi);
            int kalanGun = kalanSure.getDays();
            System.out.println("Fatura tarihine " + kalanGun + " gün kaldı.");
        } else {
            System.out.println("Alışveriş tarihi ve fatura tarihi aynı gün.");
        }
    }
}