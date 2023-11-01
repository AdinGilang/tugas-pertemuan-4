package pertemuan4;

c class Kubus extends Perhitungan{
    private double s;

    public Kubus(double s) {
        this.s = s;
    }

    @Override
    public double Volume() {
        //rumus volume kubus 
        return s*s*s;
    }

    @Override
    public double LuasPermukaan() {
        //rumus luas permukaan kubus
        return 6 * s * s;
    }
}