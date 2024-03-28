public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa<Integer> mhs1 = new Mahasiswa<Integer>("Jezo", 12345);
        Mahasiswa<String> mhs2 = new Mahasiswa<String>("Jezo", "12345");
        Mahasiswa<Double> mhs3 = new Mahasiswa<Double>("Jezo", 12345.0);

        mhs1.info();
        mhs2.info();
        mhs3.info();

        Concatenation X = new Concatenation();
        X.add(1, "Jezo");
        X.add(1, "Jezo", "12345");
    }
}
