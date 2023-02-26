public class Main {

    public static class Tanah {
        private String jenis;
        private double luas;
        private double keliling;

        public Tanah(String jenis, double luas, double keliling) {
            this.jenis = jenis;
            this.luas = luas;
            this.keliling = keliling;
        }

        public String getJenis() {
            return jenis;
        }

        public void setJenis(String jenis) {
            this.jenis = jenis;
        }

        public double getLuas() {
            return luas;
        }

        public void setLuas(double luas) {
            this.luas = luas;
        }

        public double getKeliling() {
            return keliling;
        }

        public void setKeliling(double keliling) {
            this.keliling = keliling;
        }
    }

    public static void main(String[] args) {
        // Persegi
        double sisi = 5;
        double luasPersegi = sisi * sisi;
        double kelilingPersegi = 4 * sisi;
        Tanah persegi = new Tanah("Persegi", luasPersegi, kelilingPersegi);

        // Persegi Panjang
        double panjang = 10;
        double lebar = 5;
        double luasPersegiPanjang = panjang * lebar;
        double kelilingPersegiPanjang = 2 * (panjang + lebar);
        Tanah persegiPanjang = new Tanah("Persegi Panjang", luasPersegiPanjang, kelilingPersegiPanjang);

        // Segitiga
        double alas = 10;
        double tinggi = 7;
        double sisi1 = 8;
        double sisi2 = 9;
        double luasSegitiga = 0.5 * alas * tinggi;
        double kelilingSegitiga = sisi1 + sisi2 + Math.sqrt(alas * alas + tinggi * tinggi);
        Tanah segitiga = new Tanah("Segitiga", luasSegitiga, kelilingSegitiga);

        // Lingkaran
        double jariJari = 7;
        double luasLingkaran = Math.PI * jariJari * jariJari;
        double kelilingLingkaran = 2 * Math.PI * jariJari;
        Tanah lingkaran = new Tanah("Lingkaran", luasLingkaran, kelilingLingkaran);

        // Menampilkan output
        System.out.println("-------------------------------------------");
        System.out.println("|   Luas dan Keliling Tanah Pak Dengklek  |");
        System.out.println("-------------------------------------------");
        System.out.println(persegi.getJenis() + " : \nLuas     = " + persegi.getLuas() + " cm^2 \nKeliling = " + persegi.getKeliling() + " cm\n\n");
        System.out.println(persegiPanjang.getJenis() + " : \nLuas     = " + persegiPanjang.getLuas() + " cm^2 \nKeliling = " + persegiPanjang.getKeliling() + " cm\n\n");
        System.out.println(segitiga.getJenis() + " : \nLuas     = " + segitiga.getLuas() + " cm^2 \nKeliling = " + segitiga.getKeliling() + " cm\n\n");
        System.out.println(lingkaran.getJenis() + " : \nLuas     = " + lingkaran.getLuas() + " cm^2 \nKeliling = " + lingkaran.getKeliling() + " cm\n\n");
    }
}