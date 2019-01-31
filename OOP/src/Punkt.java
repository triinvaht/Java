public class Punkt {
    private double x;
    private double y;
    private int veerand;

    public Punkt() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getVeerand() {
        if (x > 0 && y > 0) veerand = 1;
        else if (x > 0 && y < 0) veerand = 2;
        else if (x < 0 && y < 0) veerand = 3;
        else if (x < 0 && y > 0) veerand = 4;
        else veerand = 0;
        return veerand;
    }

    @Override
    public String toString() {
        return "(" + this.getX() +
                " , " + this.getY() +
                "), " + this.getVeerand() +
                ". veerand";
    }
}