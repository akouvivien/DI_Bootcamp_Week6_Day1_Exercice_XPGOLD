public class Circle {

    public double rayon;
    
        // atribut la valeur -1 au cercle par defaut
    public Circle() {
        this.rayon = -1;
    }

    public Circle(double rayon) {
        this.rayon = rayon;
        System.out.println("le rayon du cercle est");
        System.out.println(this.rayon);
    }

    public Circle(int i, String string) {
    }

    // retourne l'aire du cercle avec la methode getArea()
    public void getArea(){
        double aire = Math.PI *  Math.pow ((this.rayon),2 ) ;
        System.out.println("l'aire du cercle est");
        System.out.println(aire);
    }
}