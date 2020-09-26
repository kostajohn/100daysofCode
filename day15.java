//warmup1 backAround
public String backAround(String str) {
  String lastest = str.substring(str.length() - 1);

  return lastest + str + lastest;
}
