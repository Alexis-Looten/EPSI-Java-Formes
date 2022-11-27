public abstract class FormeGeometrique {
    private String nom;

    public FormeGeometrique(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return "La forme "+this.nom+"a pour perimétre "+calculerPerimetre();
    }

    public abstract double calculerPerimetre();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
};
