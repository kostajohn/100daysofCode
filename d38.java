//warmup1 front22
public String front22(String str) {
  String result = "";


  if (str.length() < 2) {
    result = str + str + str;
  } else {

  result = str.substring(0,2) + str + str.substring(0,2);
  }

  return result;
}
