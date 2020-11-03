package fr.bertyn.graph;


import fr.bertyn.graph.forme.Forme;

public class Application {

    public static  void main(String args[]){
//        Position point1= new Position(0, 0);
//        Position point2= new Position(0, 0);
//
//        Couleur c1= new Couleur(0,0,0);
//        point1.CalculerDistanceAvec(point2);

        Forme f = new Forme(1,1,2,1,5);
       System.out.println(f.toString());

    }
}

