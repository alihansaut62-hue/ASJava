public class Box1 {
    protected  double length;
    protected double width;
    protected double height;



    double getlengrh(double length){
         this.length = length;
                return length;

    }

    double setlengrh(){
                System.err.println("L=" + length);
                return length;
    }

    // Основной конструктор
    public Box1(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;

        System.err.println("L=" + length + " W=" + width + " H=" + height);
        // System.err.println("the number of width " + width);
        // System.err.println("the number of height " + height);

    }

    // Куб (один размер для всех сторон)
    public Box1(double size) {
        this(size, size, size);
    }

    // Конструктор по умолчанию
    public Box1() {
        this.length = 2;
        this.width = 2;
        this.height = 2;
        System.err.println("L=" + length + " W=" + width + " H=" + height);

        // System.err.println("the number of length " + length);
        // System.err.println("the number of width " + width);
        // System.err.println("the number of height " + height);
    }

    
    // Метод должен быть ВНЕ конструктора
    double getVolume() {
        return length * width * height;
    }

    void copy(Box1 another){
        this.length = another.length;
        this.width = another.width;
        this.height = another.height;
        System.err.println("L=" + length + " W=" + width + " H=" + height);

    }



    int compare(Box1 another){
        double perbox = getVolume();
        double vtobox = another.getVolume();
        if (perbox > vtobox){
            System.err.println(1);
        }else if (perbox < vtobox){
            System.err.println(-1);}
        else {
            System.err.println(0);
        }
        return 2 ;

    }

    Box1 inkris(){
        Box1 box1 = new Box1(length * 2, width * 2, height * 2);
        return box1;
    }

    
}
