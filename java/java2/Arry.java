import java.util.ArrayList;

public class Arry {


    public static void main(String[] args) {
        int a = 0;

        ArrayList<Integer> nomers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            nomers.add(i);
        }
        for (int nomer : nomers) {
            System.out.println(nomer);
        }


        ArrayList<String> employees = new ArrayList<>();

        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        for (String employee : employees) {
            System.out.println(employee);


        }
        System.out.println(nomers);
        System.out.println(employees);

        for (int i = 0; i < nomers.toArray().length; i++) {
            System.out.println(nomers.get(i) + "-" + employees.get(i) );

        }

    }
}
