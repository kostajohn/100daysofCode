//warmup2
public int arrayCount9(int[] nums) {
  int count = 0;

  for (int i = 0; i<nums.length; i++) {
    if (nums[i] == 9) {
      count = count + 1;
    }
  } return count;
}
