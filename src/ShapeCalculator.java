public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {
    public static final double PI = 3.14;

    @Override
    double lineLenght(Line2D line) {
        double lenght = (line.getK1() - line.getP1()) * (line.getK1() - line.getP1()) + (line.getK2() - line.getP2())
                * (line.getK2() - line.getP2());
        lenght = Math.sqrt(lenght);
        return lenght;
    }
    @Override
    public double circleArea(Circle circle){
        double area = PI * circle.getR() * circle.getR();
        return area;
    }
    @Override
  public int  rectangleArea(Rectangle rectangle){
        int area = rectangle.getA() * rectangle.getB();
        return area;
    }
    public double ballVolume(Ball ball){
        double volume = PI*ball.getR()*ball.getR()*ball.getR()*3/4;
        return volume;
    }
    public int cubeVolume(Cube cube){
        int volume = cube.getA()*cube.getB()*cube.getC();
        return volume;
    }
}
