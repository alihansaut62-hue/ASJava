public class MainH {

    public static void main(String[] args) {
        Hiumen Hiumen1 = new Hiumen();
        Hiumen1.name = "Alihan";
        Hiumen1.age = 10;
        Hiumen1.weight = 65;

        Hiumen Hiumen3 = new Hiumen();
        Hiumen3.name = "Alihfdgan";
        Hiumen3.age = 18;
        Hiumen3.weight = 99;

        Hiumen Hiumen2 = new Hiumen();
        Hiumen2.name = "Alihdfgan";
        Hiumen2.age = 14;
        Hiumen2.weight = 145;
        System.err.println(Hiumen2.name);
                System.err.println(Hiumen1.name);
                        System.err.println(Hiumen3.name);
        double sr = (Hiumen1.weight + Hiumen3.weight + Hiumen2.weight) / 3;
        double str = (Hiumen1.age + Hiumen3.age + Hiumen2.age) / 3;
                System.err.println(sr);
                System.err.println(str);











    }


}