//String1

public String extraEnd(String str) {
  String ending = "";

  ending = str.substring(str.length()-2);

  ending = ending + ending + ending;
  return ending;
}
