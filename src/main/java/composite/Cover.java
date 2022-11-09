package composite;

/**
 *
 * @author Darya Benedziktovich
 */

public class Cover extends WaterSystem {

    @Override
    public void fill() {
        super.fill();
        System.out.println("Otwieram pokrywe");
    }

    @Override
    public void afterFill() {
        super.afterFill();
        System.out.println("Zamykam pokrywe");
    }

    @Override
    public void drain() {
        super.drain();
        System.out.println("Otwieram pokrywe");
    }

    @Override
    public void afterDrain() {
        super.afterDrain();
        System.out.println("Zamykam pokrywę");
    }
}