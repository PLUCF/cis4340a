// MET01-J. Never use assertions to validate method arguments Given the non-compliant code below:

public static int getAbsAdd(int x, int y) { assert x != Integer .MIN VALUE;
assert y != Integer .MIN VALUE;
int absX = Math.abs(x);
int absY = Math.abs(y);
assert (absX <= Integer .MAXVALUE − absY); return absX + absY ;
}
//Usage : getAbsAdd( Integer .MIN VALUE, 1); Correct the code as shown in theCompliant Solution below:

public static int getAbsAdd(int x, int y) {
if (x == Integer.MINVALUE || y == Integer.MINVALUE) {
throw new IllegalArgumentException ();
}
int absX = Math.abs(x);
int absY = Math.abs(y);
if (absX>Integer.MAXVALUE−absY){
throw new IllegalArgumentException ();
}
return absX + absY ;
}
