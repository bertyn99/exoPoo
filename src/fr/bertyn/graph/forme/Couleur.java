package fr.bertyn.graph.forme;

public class Couleur {
    private int r;
    private int g;
    private int b;
    private double a;

    public Couleur(int r,int g,int b){
        this.r=r;
        this.g=g;
        this.b=b;
        this.a=a;
    }


    public Couleur(int r,int g,int b,double a){
        this.r=r;
        this.g=g;
        this.b=b;
        this.a=a;
    }

    @Override
    public String toString() {
        return "Couleur{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                ", a=" + a +
                '}';
    }
}

