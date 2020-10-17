//warmup1
public String notString(String str) {
  String Not = "not ";

  if (str.length() >= 3 && str.substring(0,3).equals("not")) {
    return str;
  } else return Not + str;


}
