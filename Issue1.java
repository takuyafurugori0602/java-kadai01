import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Java課題実装1
 */
class Issue1 {
  public static void main(String[] args) {

    // pathの指定を気を付ける
    // Path.getの中身には開いている階層の下を記載する。
    try (BufferedReader reader = Files.newBufferedReader(Paths.get("ip001", "scores.csv"))) {
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}