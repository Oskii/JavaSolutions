//This is the solution code for Warmup-1: posNeg
public boolean posNeg(int a, int b, boolean negative) {
  return ( a*b < 0 && !negative) || (a < 0 && b < 0 && negative) ;
}
