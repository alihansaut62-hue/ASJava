class Main {
    public static void main(String[] args) {

        String[] months = {"December",
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November"        
        };
        int i = 9;
            System.out.println(months[i]);
        String nom = "nom";

        switch (nom){
            case "January":
                System.out.println(months[1]);
                break;
            case "February":
                System.out.println(months[2]);
                break;
            case "March":
                System.out.println(months[3]);
                break;
            case "April":
                System.out.println(months[4]);
                break;
            case "May":
                System.out.println(months[5]);
                break;
            case "June":
                System.out.println(months[6]);
                break;
            case "July":
                System.out.println(months[7]);
                break;
            case "August":
                System.out.println(months[8]);
                break;
            case "September":
                System.out.println(months[9]);
                break;
            case "October":
                System.out.println(months[10]);
                break;
            case "November":
                System.out.println(months[11]);
                break;
            case "December":
                System.out.println(months[0]);
                break;
        }
        }
    }

