//warmup1 front3

public String front3(String str) {
  String result = "";

 if (str.length() < 3) {
   return str + str + str;
 }


  for (int i = 0; i<3; i++) {
    result = result + str.substring(0,3);
  }

  return result;
}

warmup2
