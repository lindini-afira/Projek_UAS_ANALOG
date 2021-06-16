package UAS;

public class Hasil {
	String nama, nim, kode_buku;
	String tanggalph, tanggalpb, tanggalpt;
	String tanggalkh, tanggalkb, tanggalkt;
	
	
	@Override
	public String toString() {
		return "Hasil [nama=" + nama + ", nim=" + nim + ", kode_buku=" + kode_buku + ", tanggalph=" + tanggalph
				+ ", tanggalpb=" + tanggalpb + ", tanggalpt=" + tanggalpt + ", tanggalkh=" + tanggalkh + ", tanggalkb="
				+ tanggalkb + ", tanggalkt=" + tanggalkt + "]";
	}
	public Hasil(String nama, String nim, String kode_buku, String tanggalph, String tanggalpb, String tanggalpt,
			String tanggalkh, String tanggalkb, String tanggalkt) {
		super();
		this.nama = nama;
		this.nim = nim;
		this.kode_buku = kode_buku;
		this.tanggalph = tanggalph;
		this.tanggalpb = tanggalpb;
		this.tanggalpt = tanggalpt;
		this.tanggalkh = tanggalkh;
		this.tanggalkb = tanggalkb;
		this.tanggalkt = tanggalkt;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getKode_buku() {
		return kode_buku;
	}
	public void setKode_buku(String kode_buku) {
		this.kode_buku = kode_buku;
	}
	public String getTanggalph() {
		return tanggalph;
	}
	public void setTanggalph(String tanggalph) {
		this.tanggalph = tanggalph;
	}
	public String getTanggalpb() {
		return tanggalpb;
	}
	public void setTanggalpb(String tanggalpb) {
		this.tanggalpb = tanggalpb;
	}
	public String getTanggalpt() {
		return tanggalpt;
	}
	public void setTanggalpt(String tanggalpt) {
		this.tanggalpt = tanggalpt;
	}
	public String getTanggalkh() {
		return tanggalkh;
	}
	public void setTanggalkh(String tanggalkh) {
		this.tanggalkh = tanggalkh;
	}
	public String getTanggalkb() {
		return tanggalkb;
	}
	public void setTanggalkb(String tanggalkb) {
		this.tanggalkb = tanggalkb;
	}
	public String getTanggalkt() {
		return tanggalkt;
	}
	public void setTanggalkt(String tanggalkt) {
		this.tanggalkt = tanggalkt;
	}
	
}
