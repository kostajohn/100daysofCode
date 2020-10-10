//warmup1 monkeyTrouble
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return (aSmile && bSmile) || (!aSmile && !bSmile);
}

//warmup1 sumDouble
public int sumDouble(int a, int b) {
  if (a != b) {
    return a + b;
  } else {
    return (a + b) * 2;
  }
}



//warmup2 doubleX
boolean doubleX(String str) {

  for (int i = 0; i <str.length()-1; i++) {

    if (str.charAt(i) == 'x') {

      if (str.charAt(i+1) == 'x') {
        return true;
      }
      return false;
    }
    } return false;
  }
