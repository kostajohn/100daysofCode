//String1 withoutEnd
public String withoutEnd(String str) {
  return str.substring(1,str.length()-1);
}


//String1 withoutEnd2
public String withouEnd2(String str) {
  if(str.length() <= 2) {
    return "";
  } else {
    return str.substring(1, str.length()-1);
  }
}

//String2 repeatEnd
public String repeatEnd(String str, int n) {

  String lastEnd = "";

  for (int i = 0; i<n; i++) {
    lastEnd = lastEnd + str.substring(str.length()-n);
  }

  return lastEnd;


  //return str.substring(str.length()-3);



}

//String2 sameStarChar
public boolean sameStarChar(String str) {

  boolean starSame = true;

  for (int i = 1; i<str.length()-1; i++) {

    /*if (str.charAt(0) == '*'){
      return false;
    }


    if (str.charAt(str.length()-1) == '*') {
      return false;
    }
  */

    if (str.charAt(i) == '*' && (str.charAt(i-1) != str.charAt(i+1))){
      starSame = false;
    }



  }




  return starSame;
}
