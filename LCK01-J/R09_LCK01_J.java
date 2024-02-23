// LCK01-J. Do not synchronize on objects that may be reused Given the non-compliant code below:

private int count = 0;
private final Integer Lock = count; // Boxed primitive Lock is shared
 
public void doSomething() {
  synchronized (Lock) {
    count++;
    // ...
  }
}

// Correct the code as shown in the Compliant Solution below:

private int count = 0;
private final Integer Lock = new Integer(count);
 
public void doSomething() {
  synchronized (Lock) {
    count++;
    // ...
  }
}
