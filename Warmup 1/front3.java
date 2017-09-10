//This is the solution code for Warmup-1: front3

public String front3(String str) {
  if(str.length() > 2)
    return str.substring(0,3)+str.substring(0,3)+str.substring(0,3);
    
  return str + str + str;
}
