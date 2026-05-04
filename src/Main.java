public class Main {
    public static void main(String[] args) {
        Smartphone hp = new Smartphone("Samsung", 25, "Android");
        Laptop laptop = new Laptop("Asus", 65, "RTX 3060");

        System.out.println("=== Katalog Inventaris Elektronik ===");
        hp.tampilkanInfo();
        laptop.tampilkanInfo();
    }
}