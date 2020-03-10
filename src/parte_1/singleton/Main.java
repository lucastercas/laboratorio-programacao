package parte_1.singleton;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    LogManager service1, service2, service3;

    service1 = LogManager.getInstance();
    service2 = LogManager.getInstance();
    service3 = LogManager.getInstance();

    service1.writeToLog("oi");
  }
}
