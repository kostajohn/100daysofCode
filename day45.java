//array has23

public boolean has23(int[] nums) {
  boolean TwoorThree = false;

  for (int i = 0; i<nums.length; i++) {
    if (nums[i] == 2 || nums[i] == 3) {

    TwoorThree = true;


    }
  } return TwoorThree;
}
