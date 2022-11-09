package adapter;

/**
 *
 * @author Darya Benedziktovich
 */
public class Utils {

    public interface CircleR {

        double getR();
    }

    public static double circAreaR(CircleR circle) {
        return Math.PI * Math.pow(circle.getR(), 2);
    }
}
