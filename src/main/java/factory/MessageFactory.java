package factory;

/**
 *
 * @author Darya Benedziktovich
 */
public interface MessageFactory {
    String createIntroMessage();
    String createMainMessage();
    String createClosingMessage();
}