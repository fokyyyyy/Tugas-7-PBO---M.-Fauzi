public class Mahasiswa<T> {

    private T nim;
    private String nama;

    public Mahasiswa(String nama, T nim) {
        this.nim = nim;
        this.nama = nama;
    }

    public Mahasiswa(String nama2, double nim2) {
        //TODO Auto-generated constructor stub
    }

    public void info() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
    }
}