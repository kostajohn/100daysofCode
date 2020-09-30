//String1
public String left2(String str) {
return str.substring(2, str.length()) + str.substring(0,2);

}


//String1
public String conCat(String a, String b) {

  if (a.length() < 1) {
    return b;
  } else if (b.length() < 1) {
    return a;
  } else if (a.substring(a.length()-1).equals(b.substring(0,1))) {
    return a + b.substring(1);
  } else {
    return a + b;
  }

}


//array1
public boolean no23(int[] nums) {
  boolean noTwoThree = true;

  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2 || nums[i] == 3) {
      noTwoThree = false;
    }
  } return noTwoThree;
}
