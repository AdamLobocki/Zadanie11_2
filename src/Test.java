public class Test {
    public static void main(String[] args) {
        ShapeCalculator calc = new ShapeCalculator();
        Ball ball = new Ball(4);
        Circle circle = new Circle(3);
        Cube cube = new Cube(4, 2, 8);
        Line2D line2D = new Line2D(2, 4, 1, 5);
        Rectangle rectangle = new Rectangle(2, 5);

        double ballV = calc.ballVolume(ball);
        double circleA = calc.circleArea(circle);
        int cubeV = calc.cubeVolume(cube);
        double lineL = calc.lineLenght(line2D);
        int rectangleA = calc.rectangleArea(rectangle);

        System.out.println("Objetosc kuli: " + ballV);
        System.out.println("Pole koła: " + circleA);
        System.out.println("Objętość sześcianu: " + cubeV);
        System.out.println("Długośc odcinka: " + lineL);
        System.out.println("Pole prostokąta: " + rectangleA);
    }
}
