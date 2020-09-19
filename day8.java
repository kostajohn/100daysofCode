//coding bat problems

//warmup1:loneTeen
public boolean loneTeen(int a, int b) {
  boolean aaa = false;
  boolean bbb = false;

  if (a >= 13 && a <= 19) {
    aaa = true;
  }

  if (b >= 13 && b <= 19) {
    bbb = true;
  }

  if (aaa == true && bbb == true) {
    aaa = false;
    bbb = false;
  }

  return aaa || bbb;


}

//array2-sum28
public boolean sum28(int[] nums) {
  boolean summ28 = false;
  int sum = 0;

  for (int i = 0; i<nums.length; i++) {
    if(nums[i] == 2) {
      sum = sum + nums[i];
    }
  } return sum == 8;
}

//Array2: countEvens
public int countEvens(int[] nums) {
  int evenCount = 0;

  for (int i = 0; i<nums.length; i++){
    if (nums[i] % 2 == 0) {
      evenCount = evenCount + 1;
    }
  } return evenCount;
}
