//This is the solution code for Warmup-1: notString

public String notString(String str) {
  //Return "not" strings unchanged
  if(str.equals("not"))
    return str;
  
  //return strings that start with "not"
  if (str.length() >= 3 && str.substring(0,3).equals("not")) 
    return str;

  //return any other strings with new "not" at the beginnning
  return "not " + str;
}