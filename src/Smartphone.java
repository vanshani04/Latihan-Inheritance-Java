public class Smartphone extends PerangkatElektronik {
    private String sistemOperasi;

    public Smartphone(String merk, int dayaListrik, String sistemOperasi) {
        super(merk, dayaListrik); // Memanggil constructor superclass
        this.sistemOperasi = sistemOperasi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("OS           : " + sistemOperasi);
        System.out.println("Kategori     : Perangkat Genggam");
        System.out.println("---------------------------");
    }
}