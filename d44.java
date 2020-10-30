//array1 maxEnd3


public int[] maxEnd3(int[] nums) {
  int[] largerThree = new int[3];

  if (nums[0] > nums[nums.length-1]) {
    largerThree[0] = nums[0];
    largerThree[1] = nums[0];
    largerThree[2] = nums[0];
  } else {
    largerThree[0] = nums[nums.length-1];
    largerThree[1] = nums[nums.length-1];
    largerThree[2] = nums[nums.length-1];
  }

  return largerThree;

}
