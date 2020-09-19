//warmup1
public boolean parrotTrouble(boolean talking, int hour) {
  boolean trouble = false;

  if (talking == true && hour < 7) {
    trouble = true;
  } else if (talking == true && hour > 20){
    trouble = true;
  }

  return trouble;
}


//warmup1 icyHot
public boolean icyHot(int temp1, int temp2) {
  boolean hotAndCold = false;

  if (temp1 < 0 && temp2 > 100){
    hotAndCold = true;
  } else if (temp2 < 0 && temp1 >100){
    hotAndCold = true;
  }

  return hotAndCold;
}
