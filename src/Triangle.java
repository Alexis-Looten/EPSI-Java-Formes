public class Triangle extends FormeGeometrique{
    private double cote1;
    private double cote2;
    private double cote3;

    @Override
    public double calculerPerimetre() {
        return (this.cote1 + this.cote2 + this.cote3);
    }

    public Triangle(String nom, double cote1, double cote2, double cote3) {
        super(nom);
        this.cote1 = cote1;
        this.cote2 = cote2;
        this.cote3 = cote3;
    }

    public double getCote1() {
        return cote1;
    }

    public void setCote1(double cote1) {
        this.cote1 = cote1;
    }

    public double getCote2() {
        return cote2;
    }

    public void setCote2(double cote2) {
        this.cote2 = cote2;
    }

    public double getCote3() {
        return cote3;
    }

    public void setCote3(double cote3) {
        this.cote3 = cote3;
    }
}
