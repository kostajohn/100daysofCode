//warmup2 arrayFront9
public boolean arrayFront9(int[] nums) {

boolean nineIn4 = false;

if (nums.length<4) {
  for (int i = 0; i<nums.length; i++) {
    if (nums[i] == 9) {
      nineIn4 = true;
    }
  }
} else {
  for (int i = 0; i<4; i++) {
    if (nums[i] == 9) {
      nineIn4 = true;
    }
  }
} return nineIn4;

}
