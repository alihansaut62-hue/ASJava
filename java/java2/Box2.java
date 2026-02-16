public class Box2 extends Box1 {

    private double density; // плотность

    public Box2(double length, double width, double height, double density) {
        super(length, width, height);
        this.density = density;
    }

    // автоматический расчёт веса
    public double getWeight() {
        return getVolume() * density;
    }

    // Переопределяем увеличение

    public Box2 increase() {
        return new Box2(length * 2, width * 2, height * 2, density);
    }

    // Сравнение теперь можно делать по весу
    public int compareWeight(Box2 another) {
        double w1 = getWeight();
        double w2 = another.getWeight();

        if (w1 > w2) return 1;
        if (w1 < w2) return -1;
        return 0;
    }

    public void showInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + getVolume());
        System.out.println("Weight: " + getWeight());
    }
}
