public class AbstractClassDemo {
    public static void main(String[] args) {
        // Instansiasi objek Lebah
        Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        System.out.println("=== INFO LEBAH ===");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();

        System.out.println();

        // Instansiasi objek Ular
        Ular ular1 = new Ular(true, 12.5, "Daging", "Hutan");
        System.out.println("=== INFO ULAR ===");
        ular1.cetakInfo();
        ular1.bergerak();
        ular1.bernapas();
    }
}