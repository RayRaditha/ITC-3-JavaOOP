public class Main {

    public static void main(String[] args) {
    	/*Mahasiswa daru = new Mahasiswa("Anjar", "123180056", 4.0);
	   //daru.nama = "Allyandaru";
	   //daru.nim = "123180054";
	   //daru.IPK = 4.0;

		daru.setNama("Allyandaru");
		daru.setNim("123180054");
		daru.setIPK(4.0);

		//System.out.println("Nama = " + daru.nama);
		//System.out.println("NIM = " + daru.nim);
		//System.out.println("IPK = " + daru.IPK);
		System.out.println("Nama = " + daru.getNama());
		System.out.println("Nim = " + daru.getNim());
		System.out.println("IPK = " + daru.getIPK());
	    daru.belajar();
	    daru.doTugas();*/

	    Manusia manusia = new Manusia("Riki");
	    Mahasiswa mahasiswa = new Mahasiswa("Akli", "123180030", 4.0);

	    mahasiswa.ktp = "123458555";
	//	System.out.println("Nama : " + mahasiswa.nama);

    // manusia.makan("Anjar");

		mahasiswa.berjoget("TikTok");
    }
}
