package factory;

/**
 *
 * @author Darya Benedziktovich
 */
public class Wednesday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Dzień dobry Środa.";
    }

    @Override
    public String createMainMessage() {
        return "Dzień dobry Środa.";
    }

    @Override
    public String createClosingMessage() {
        return "Trzeci dzień pracy w tym tygodniu minął";
    }

}