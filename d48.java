//warmup2 last2
public int last2(String str) {

  int count = 0;

  for (int i = 0; i<str.length()-2; i++) {

    if(str.charAt(i) == str.charAt(str.length()-2) && str.charAt(i+1) == str.charAt(str.length()-1)) {
      count = count + 1;
    }



  } return count;




}
