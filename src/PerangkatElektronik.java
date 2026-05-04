public class PerangkatElektronik {
    protected String merk;
    protected int dayaListrik; // dalam Watt

    public PerangkatElektronik(String merk, int dayaListrik) {
        this.merk = merk;
        this.dayaListrik = dayaListrik;
    }

    public void tampilkanInfo() {
        System.out.println("Merk         : " + merk);
        System.out.println("Daya Listrik : " + dayaListrik + " Watt");
    }
}