package fr.bertyn.graph.forme;

public class Forme {
   Position position;
   Couleur couleur;

   public Forme(int x,int y,int r,int g,int b){
      this.position=new Position(x,y);
      this.couleur=new Couleur(r,g,b);

   }
   public Forme(int x,int y,int r,int g,int b,int a){
      this.position=new Position(x,y);
      this.couleur=new Couleur(r,g,b,a);

   }

   public void deplacer(int x, int y){
      this.position.setX(this.position.getX()+x);
      this.position.setY(this.position.getY()+y);
   }

   public String toString (){
      return "La forme ce trouve a la "+this.position+"\n et sa "+this.couleur;

   }
}
