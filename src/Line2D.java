public class Line2D extends Shape2D {
  private   int p1;
  private  int p2;
  private int k1;
  private   int k2;

    public Line2D(int p1, int p2, int k1, int k2) {
        this.p1 = p1;
        this.p2 = p2;
        this.k1 = k1;
        this.k2 = k2;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getK1() {
        return k1;
    }

    public void setK1(int k1) {
        this.k1 = k1;
    }

    public int getK2() {
        return k2;
    }

    public void setK2(int k2) {
        this.k2 = k2;
    }
}
