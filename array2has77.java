public boolean has77(int[] nums) {
  boolean sevenSeven = false;

  for (int i = 0; i<nums.length-1; i++) {
    if (nums[i] == 7 && nums[i + 1] == 7) {
      sevenSeven = true;
    } else if (nums[i] == 7 && nums[i+2] == 7) {
      sevenSeven = true;
    } else if (nums[nums.length-2] == 7 && nums[nums.length-1] != 7) {
      break;
    }
  } return sevenSeven;
}
