//This is the solution code for Warmup-1: frontBack

public String frontBack(String str) {
  int length = str.length();
  if(length < 2)
    return str;
  return str.charAt(length - 1) + str.substring(1, length-1) + str.charAt(0);
}
