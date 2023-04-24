public class FileWriter {
  String name;
  public FileWriter(String name) {
    this.name = name;
  }
  public FileWriter() {
    this("ダミー");
    System.out.println("FileWriter");
  }
}