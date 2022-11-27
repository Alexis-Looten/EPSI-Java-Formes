public class FormeConteneur {
    FormeGeometrique[] tableauFormes;

    public FormeConteneur() {
        this.tableauFormes = new FormeGeometrique[10];
    }

    public void addForme(int index, FormeGeometrique forme) {
        this.tableauFormes[index] = forme;
    }

    public static void main(String args[]){
        var carre = new Carre("ABCD", 4);
        var cercle = new Cercle("cercle1", 2.6);
        var triangle = new Triangle("ABC", 3, 4 , 5);


        System.out.println(carre.toString());
        System.out.println(cercle.toString());
        System.out.println(triangle.toString());
    }
}
