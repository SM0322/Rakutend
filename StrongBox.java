public class StrongBox<E> {
  private E item;
  public void put(E item) {
    this.item = item;
  }
  public E get() {
    return this.item;
  }
}