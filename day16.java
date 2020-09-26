//string1 nTwice
public String nTwice(String str, int n) {
  String firstPlusLast = "";

 firstPlusLast = str.substring(0, n) + str.substring(str.length()-n, str.length());

  return firstPlusLast;

}
//string1 twoChar
public String twoChar(String str, int index) {

  String twoCharacters = "";



   if (str.length() < index || str.length() < index + 2) {
    twoCharacters = str.substring(0,2);
  } else if (index < 0) {
    twoCharacters = str.substring(0,2);
  } else {
    twoCharacters = str.substring(index, index+2);
  }




  return twoCharacters;

}
