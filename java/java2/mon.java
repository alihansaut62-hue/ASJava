public class mon{
    double eyes;
    double hands;
    double legs;

    public mon(double eyes, double hands, double legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
        System.err.println("the number of eyes " + eyes);
        System.err.println("the number of hands " + hands);
        System.err.println("the number of legs " + legs);
    }

    public mon(double size) {
        this(size, size, size);
    }

        public mon() {
        this.eyes = 2;
        this.hands = 2;
        this.legs = 2;
        System.err.println("the number of eyes " + eyes);
        System.err.println("the number of hands " + hands);
        System.err.println("the number of legs " + legs);
    }

    void voice(){
    System.err.println("Grrrrrrrr");
    }


    void voice(double number){
        for (int i = 0; i < number; i++) {
            voice();
        }
    }

    void voice(double nom, String Grrr){
          for (int i = 0; i < nom; i++) {
                 System.err.println(Grrr);
          }

    }


    










}