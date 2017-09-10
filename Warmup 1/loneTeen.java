//This is the solution code for Warmup-1: loneTeen
public boolean loneTeen(int a, int b) {
  boolean isTeenA = a >= 13 && a <= 19;
  boolean isTeenB = b >= 13 && b <=19;
  
  //^ is the xor operation: either one or the other but not both
  return isTeenA ^ isTeenB;
}
