// FIO05-J. Do not expose buffers or their backing arrays methods to untrusted code Given the non-compliant code below:

final class Dup {
  CharBuffer cb;
 
  public Dup() {
    cb = CharBuffer.allocate(10);
    // Initialize
  }
 
  public CharBuffer getBufferCopy() {
    return cb.duplicate();
  }
}

// Correct the code as shown in the Compliant Solution below:

final class Dup {
  CharBuffer cb;
 
  public Dup() {
    cb = CharBuffer.allocate(10);
    // Initialize
  }
 
  public CharBuffer getBufferCopy() {
    return cb.asReadOnlyBuffer();
  }
}
