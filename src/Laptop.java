public class Laptop extends PerangkatElektronik {
    private String gpu;

    public Laptop(String merk, int dayaListrik, String gpu) {
        // Mengirimkan data merk dan dayaListrik ke constructor PerangkatElektronik
        super(merk, dayaListrik); 
        this.gpu = gpu;
    }

    @Override
    public void tampilkanInfo() {
        // Memanggil metode tampilkanInfo() milik superclass agar merk & daya muncul
        super.tampilkanInfo(); 
        System.out.println("GPU          : " + gpu);
        System.out.println("Kategori     : Komputer Portabel");
        System.out.println("---------------------------");
    }
}