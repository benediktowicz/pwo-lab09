package factory;

/**
 *
 * @author Darya Benedziktovich
 */
public class Sunday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Dzień dobry Niedziela.";
    }

    @Override
    public String createMainMessage() {
        return "Dzień dobry Niedziela.";
    }

    @Override
    public String createClosingMessage() {
        return "Ostatni dzień weekendu minął";
    }
}