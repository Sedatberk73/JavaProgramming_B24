package day_52inharitance.lyft;

public class lyftXL extends lyft {

    @Override
    public double colculateRate(int mile) {
        return super.colculateRate(mile)*1.2;//lyft clasindan gelen method yeniden override ettik ve buradki sistemde yeniden sekillendirdik.


    }
}
