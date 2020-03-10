package parte_1.singleton;

import java.io.File;
import java.io.FileWriter;

/**
 * LogManager
 */
public class LogManager {
  private LogManager() { };

  private static LogManager instance = null;

  public static synchronized LogManager getInstance() {
    if (instance == null)
      instance = new LogManager();
    return instance;
  }

  public void writeToLog(String str) {
    // File file = new File("./log.txt");
    try {
      FileWriter writer = new FileWriter("src/parte_1/singleton/log.txt");
      writer.write("Oi");
      writer.close();
    } catch (Exception e) {
      System.out.println("Error writing to file");
      e.printStackTrace();
    }
  }

}
