//aray2 sum13
public int sum13(int[] nums) {
  int sum = 0;

  for (int i = 0; i <nums.length; i++) {
    if (nums[i] != 13) {
      sum = sum + nums[i];
    } else {
      i = i + 1;
    }
  }return sum;

}
