//String2
public String repeatFront(String str, int n) {
  String frontRepeat = "";

  for (int i = 0; i<n; i++){
    frontRepeat = frontRepeat + str.substring(0,n-i);
  }


  /*rontRepeat = frontRepeat + str.substring(0, 4) + str.substring(0,3) + str.substring(0,2) + str.substring(0,1);
  */
  return frontRepeat;


}
