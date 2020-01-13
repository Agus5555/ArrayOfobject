import java.util.*;
class TabungScanner {
    public static void main(String[] args) {
    final double phi = 3.14;
    double jari,volume,tinggi;
    Scanner scanner + new Scanner(System.in);

    System.out.println("=== Volume Tabung ===");

    System.out.println("Masukan jari-jari :");
    jari = Double.parseDouble(scanner.next());
    System.out.println("Masukan Tinggi :");
    tinggi = Double.parseDouble(scanner.next());

    volume = phi * (jari * jari)* tinggi;
    System.out.println("=== Volume Tabung ===");
    System.out.println("volume tabung adalah : "+ volume);
    }
}
