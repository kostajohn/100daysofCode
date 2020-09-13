public int sum2(int[] nums) {
  int summer = 0;

  if (nums.length == 0) {
    summer = 0;
  } else if (nums.length == 1) {
    summer = nums[0];
  } else {
    summer = nums[0] + nums[1];
  }



  return summer;
}
