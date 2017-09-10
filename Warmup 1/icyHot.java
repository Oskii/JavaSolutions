//This is the solution code for Warmup-1: icyHot
public boolean icyHot(int temp1, int temp2) {
  return (temp1 < 0 && temp2 > 100) || ( temp1 > 100 && temp2 < 0);
}

