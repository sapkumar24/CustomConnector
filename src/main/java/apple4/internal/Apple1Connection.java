package apple4.internal;


/**
 * This class represents an extension connection just as example (there is no real connection with anything here c:).
 */
public final class Apple1Connection {

  private final String id;

  public Apple1Connection(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void invalidate() {
    // do something to invalidate this connection!
  }
}
