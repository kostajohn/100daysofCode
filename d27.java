//warmup2 stringTimes
public String stringTimes(String str, int n) {
  String repeated = "";

  for (int i = 0; i<n; i++) {
    repeated = repeated + str;
  }
  return repeated;

}


//warmup2 frontRepeat
public String frontTimes(String str, int n) {
  String frontRepeat = "";




  for (int i = 0; i<n; i++) {
    if (str.length() < 3) {
      frontRepeat = frontRepeat + str;
    } else {

    frontRepeat = frontRepeat + str.substring(0,3);
  }
  }
  return frontRepeat;
}

//logic1 cigarParty
public boolean cigarParty(int cigars, boolean isWeekend) {

  if (isWeekend && cigars >= 40) {
    return true;
  } else if (!isWeekend && (cigars>=40 && cigars <= 60)) {
    return true;
  } else {
    return false;
  }



}


//String2 countHi
public int countHi(String str) {

  int count = 0;

  for (int i = 0; i<str.length()-1;i++){
    if (str.charAt(i)=='h' && str.charAt(i+1)=='i') {
      count++;
    }
  } return count;


}

//String2 catDog
public boolean catDog(String str) {
  int catCount = 0;
  int dogCount = 0;


  for (int i = 0; i<str.length()-2; i++) {
    if (str.charAt(i) == 'c' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 't') {
      catCount++;
    }

    if(str.charAt(i) == 'd' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 'g') {
      dogCount++;
    }


  } return catCount == dogCount;
}

//String2 xyzThere
public boolean xyzThere(String str) {

  boolean xyzAfterPeriod = false;


   if(str.equals("xyz")) {
      xyzAfterPeriod = true;
    }



  for (int i = 0; i<str.length()-3; i++) {
    if (str.charAt(i) != '.' && str.charAt(i+1) == 'x' && str.charAt(i+2) == 'y' && str.charAt(i+3) == 'z') {
      xyzAfterPeriod = true;
    }



   if (str.substring(0,3).equals("xyz")){
    xyzAfterPeriod = true;
   }

  } return xyzAfterPeriod;


}
