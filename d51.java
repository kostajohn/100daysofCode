//String3 countTriple
public int countTriple(String str) {
  int count3 = 0;

  for (int i = 1; i<str.length()-1; i++) {
    if (str.charAt(i) == str.charAt(i-1) && str.charAt(i) == str.charAt(i+1)) {
      count3 = count3 + 1;
    }
  } return count3;

}

//String3 sumDigits
public int sumDigits(String str) {

  String digits = "";
  int count = 0;

  for (int i = 0; i<str.length(); i++) {
    if (Character.isDigit(str.charAt(i))) {
      count = count + Integer.parseInt(str.charAt(i) + "");
    }


  } return count;


  }
