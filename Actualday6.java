//warmup1
public boolean in1020(int a, int b) {
  boolean aaa = false;
  boolean bee = false;


  if (a >= 10 && a <= 20) {
    aaa = true;
  } else if (b >= 10 && b <= 20) {
    bee = true;
  }

return aaa || bee;

}

//logic-1
public int blueTicket(int a, int b, int c) {
  int sum = 0;

  if (a + b == 10 || b + c == 10) {
    sum = 10;
  } else if (a + c == 10) {
    sum = 10;
  } else if (a + b == (b + c) + 10) {
    sum = 5;
  } else if (a + b == (a + c) + 10) {
    sum = 5;
  } else {
    sum = 0;
  }

  return sum;

}


//array-2
public int bigDiff(int[] nums) {
  int Biggest = nums[0];
  int Smallest = nums[0];

  for (int i = 0; i<nums.length-1; i++) {
    if (nums[i + 1] > Biggest) {
      Biggest = nums[i + 1];
    } else if (nums[i + 1] < Smallest) {
      Smallest = nums[i + 1];
    }
  } return Biggest - Smallest;
}
