import java.util.*;
// public class Book implements TangibleAsset 
public class Book {
  private String title;
  private String publishDate;
  private String comment;
  String isbn;
  // public Book(String name, int price, String color, String isbn) {
  //   super(name, price, color);
  //   this.isbn = isbn;
  // }
  public String getIsbn() {
    return this.isbn;
  }
  public String getTitle() {
    return this.title;
  }
  public int hashCode() {
    return Objects.hash(this.title, this.publishDate);
  }
  public int compareTo(Book obj) {
    return this.publishDate.compareTo(obj.publishDate);
  }
  // public Book Clone() {
  //   Book result = new Book();
  //   result.title = this.title;
  //   result.publishDate = this.publishDate;
  //   return result;
  // }
  public Book(String title, String publishDate, String comment) {
    this.title = title;
    this.publishDate = publishDate;
    this.comment = comment;
  }
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }
  public int compareTo(Book o) {
    return CompareToBuilder.reflectionCompare(this, o, "comment", "title");
  }
}