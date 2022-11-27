public class Carre extends FormeGeometrique{
    private float cote;

    public Carre(String nom, float cote) {
        super(nom);
        this.cote = cote;
    }

    @Override
    public double calculerPerimetre() {
        return (this.cote*4);
    }

    public float getCote() {
        return cote;
    }

    public void setCote(float cote) {
        this.cote = cote;
    }
}
