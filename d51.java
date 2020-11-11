//String3 countTriple
public int countTriple(String str) {
  int count3 = 0;

  for (int i = 1; i<str.length()-1; i++) {
    if (str.charAt(i) == str.charAt(i-1) && str.charAt(i) == str.charAt(i+1)) {
      count3 = count3 + 1;
    }
  } return count3;

}
