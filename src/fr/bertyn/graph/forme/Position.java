package fr.bertyn.graph.forme;

public class Position {
    private int x;
    private int y;

    public Position(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }

    public double CalculerDistanceAvec(Position p){
        double distance = Math.sqrt(Math.pow(p.x- this.x,2)+Math.pow(p.y- this.y,2));
        return distance;
    }
    public double CalculerDistanceAvec(int x, int y){
        double distance = Math.sqrt(Math.pow(x- this.x,2)+Math.pow(y- this.y,2));
        return distance;
    }

    @Override
    public java.lang.String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
