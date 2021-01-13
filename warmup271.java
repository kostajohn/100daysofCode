//codingBat has271

public boolean has271(int[] nums) {
  boolean twoSevenOne = false;

  for (int i = 0; i<nums.length-1; i++) {

    if ((nums[i + 1] == nums[i] + 5) && ((nums[i+2] == nums[i] + 1) || (nums[i + 2] == nums[i] - 1))) {
      twoSevenOne = true;
    } else if ((nums[i + 1] == nums[i] + 5) && ((nums[i+2] == nums[i] - 3) || (nums[i + 2] == nums[i] - 2))) {
      twoSevenOne = true;
    }


  } return twoSevenOne;
}
