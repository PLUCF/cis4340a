// THI03-J. Always invoke wait() and await() methods inside a loop Given the non-compliant code below:

synchronized (object) {
  if (<condition does not hold>) {
    object.wait();
  }
  // Proceed when condition holds
}

// Correct the code as shown in the Compliant Solution below:

synchronized (object) {
  while (<condition does not hold>) {
    object.wait();
  }
  // Proceed when condition holds
}
