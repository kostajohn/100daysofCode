//codingbat string-1
public String firstHalf(String str) {
  return str.substring(0, str.length()/2);
}

//codingbat string-1
public boolean hasBad(String str) {
 boolean hasBad = false;


  if (str.length() == 3 && str.equals("bad")) {
    hasBad = true;
  } else if (str.length() == 3 && str != "bad") {
    hasBad = false;
  } else if (str.length() < 3) {
    hasBad = false;
  } else if (str.substring(0, 3).equals("bad")) {
    hasBad = true;
  } else if (str.substring(1, 4).equals("bad")) {
    hasBad = true;
  }
  return hasBad;

}


//count array1
public int start1(int[] a, int[] b) {
  int count = 0;

  if (a.length > 0 && a[0] == 1) {
    count = count + 1;
  }

  if (b.length > 0 && b[0] == 1) {
    count = count + 1;
  }

  return count;

}
