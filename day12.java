
//string1 middleThree
public String middleThree(String str) {

int middle = str.length() / 2;

return str.substring(middle-1, middle+2);

}


//string1 firstTwo
public String firstTwo(String str) {
  String onlyTwo = "";

  if (str.length() < 2) {
    onlyTwo = str;
  } else {
    onlyTwo = str.substring(0,2);
  }

  return onlyTwo;
}


//string1 extraFront
public String extraFront(String str) {
  String timesThree = "";

  if (str.length() < 2) {
    timesThree = str + str + str;
  } else {
    timesThree = str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
  }

  return timesThree;

}

//string2 doubleChar
public String doubleChar(String str) {
  String doublestr = "";

  for (int i = 0; i < str.length(); i++) {
    doublestr = doublestr + str.charAt(i) + str.charAt(i);
  } return doublestr;
}
