//This is the solution code for Warmup-1: mixStart
public boolean mixStart(String str) {
  if(str.length()>=3)
    return str.substring(1,3).equals("ix");
  return false;
}
