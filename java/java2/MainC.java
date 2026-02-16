public class MainC {

    public static void main(String[] args) {

        scratch employees = getEmployees();

//        employees.add("James");
//        employees.remove(4);
//        employees.remove("Max");
//        employees.add("asasas");
        employees.get(1);
        employees.get(1);
        employees.get(1);
        employees.get(1);


        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }

    private static scratch getEmployees() {

        scratch employees = new scratch();

        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");

        return employees;
    }
}
