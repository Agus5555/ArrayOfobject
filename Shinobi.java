class Shinobi {
    private String NoRegistrasi, Nama, Peringkat;

    public void setNoRegistrasi (String NoRegistrasi) {
    this.NoRegistrasi = NoRegistrasi;
    }
    public String getNoRegistrasi() {
    return NoRegistrasi;
    }
    public void setNama (String Nama) {
    this.Nama = Nama;
    }
    public String getNama() {
    return Nama;
    }
    public void setPeringkat (String Peringkat) {
    this.Peringkat = Peringkat;
    }
    public String getPeringkkat() {
    return Peringkat;
    }
}
class Shinobi {
    public static void main(String[] args) {
    Shinobi[] s = new Shinobi[3];

    //membentuk objek 1
    s[0] = new Shinobi();
    s[0].setNoRegistrasi(012606);
    s[0].setNama(Uchiha Sasuske);
    s[0].setPeringkat(Genin);

    //membentuk objek 2
    s[1] = new Shinobi();
    s[1].setNoRegistrasi(012607);
    s[1].setNama(Uzumaki Naruto);
    s[1].setPeringkat(Genin);

    //membentuk objek 3
    s[2] = new Shinobi();
    s[2].setNoRegistrasi(012601);
    s[2].setNama(Haruno Sakura);
    s[2].setPeringkat(Chunin);

    //menampilkan 3 objek dari array
    System.out.println("Data Shinobi \n");
    for(Shinobi x:s) {
    System.out.println("NoRegistrasi : " + x.getNoRegistrasi());
    System.out.println("Nama : " + x.getNama());
    System.out.println("Peringkat : " + x.getPeringkkat());
    }
    }
}
