//warmup1 delDel
public String delDel(String str) {
  if (str.length() < 4) {
    return str;
  } else if (str.substring(1,4).equals("del")) {
    return str.charAt(0) + str.substring(4);
  } else {
    return str;
}
}

//warmup1 mixStrart
public boolean mixStart(String str) {
  if (str.length() < 3) {
    return false;
  } else if (str.substring(1,3).equals("ix")){
    return true;
  } else {
    return false;
  }
}
