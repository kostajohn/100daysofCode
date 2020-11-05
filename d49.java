//String3 equalIsNot

public boolean equalIsNot(String str) {

  int countIs = 0;
  int countNot = 0;

  for (int i = 0; i<str.length()-1; i++) {
    if (str.charAt(i) == 'i' && str.charAt(i+1) == 's') {
      countIs = countIs+1;
    }
  }

  for (int i = 0; i<str.length()-2; i++) {
    if (str.charAt(i) == 'n' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 't') {
      countNot = countNot + 1;
    }
  }
  
  return countNot == countIs;



}
