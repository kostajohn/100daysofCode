//String1 makeOutWord
public String makeOutWord(String out, String word) {

  return out.substring(0,2) + word + out.substring(2);

}

//String1 lastChars
public String lastChars(String a, String b) {

 String firstA = "";
 String lastB = "";


 if (a.length() == 0) {
   firstA = "@";
 } else {
   firstA = a.substring(0, 1);
 }

 if (b.length() == 0) {
   lastB = "@";
 } else {
   lastB = b.substring(b.length()-1);
 }

 return firstA + lastB;

}
