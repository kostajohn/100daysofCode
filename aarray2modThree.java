public boolean modThree(int[] nums) {
  boolean odderEven = false;


  for (int i = 0; i<nums.length-2; i++) {
    if (nums.length < 3) {
    odderEven = false;
  } else if (nums[i] % 2 == 0 && nums[i + 1] % 2 != 0) {
      odderEven = false;
  } else if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i+2] % 2 != 0) {
    odderEven = true;
  } else if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i+2] % 2 == 0) {
    odderEven = true;
  }



  } return odderEven;
}
