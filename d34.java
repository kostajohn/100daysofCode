//String2 oneTwo
public String oneTwo(String str) {

  String mixed = "";


  for (int i = 0; i<str.length()-2; i+=3) {
    mixed = mixed + str.substring(i+1, i+3) + str.charAt(i);
  }

  return mixed;
}
