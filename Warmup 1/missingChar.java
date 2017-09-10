//This is the solution code for Warmup-1: missingChar

public String missingChar(String str, int n) {
  return str.substring(0, n) + str.substring(n + 1, str.length());
  
}
