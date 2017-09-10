//This is the solution code for Warmup-1: backAround

public String backAround(String str) {
  int l = str.length();
  return str.charAt(l - 1) + str + str.charAt(l - 1);
}
