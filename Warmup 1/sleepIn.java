//This is the solution code for Warmup-1: sleepIn
//This includes a one-line solution I wrote

public boolean sleepIn(boolean weekday, boolean vacation) {
  if(weekday){
       if(vacation){
            return true;
       }
       return false;
  }
  return true;
//One liner 
//return(weekday && vacation) || !(weekday || vacation) || (!weekday && vacation);
}
