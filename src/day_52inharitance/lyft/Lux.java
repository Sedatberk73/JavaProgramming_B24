package day_52inharitance.lyft;

public class Lux extends lyft {

    @Override
    public double colculateRate(int mile) {
        return super.colculateRate(mile)*1.5;
    }
}
