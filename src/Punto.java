
public class Punto {
    private int x,y;

    /*  public Punto () {
        this.x = 0;
        this.y = 0;
    }
    */

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double modulo() {
        return (double) Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public Punto (int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public Punto (int a) {
        this(a,a);
    }

    public Punto (  ) {
        this(0,0);
    }

}

