//warmup2 stringTimes
public String stringTimes(String str, int n) {
  String repeated = "";

  for (int i = 0; i<n; i++) {
    repeated = repeated + str;
  }
  return repeated;

}


//warmup2 frontRepeat
public String frontTimes(String str, int n) {
  String frontRepeat = "";




  for (int i = 0; i<n; i++) {
    if (str.length() < 3) {
      frontRepeat = frontRepeat + str;
    } else {

    frontRepeat = frontRepeat + str.substring(0,3);
  }
  }
  return frontRepeat;
}
