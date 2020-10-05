//array2 sum67 

public int sum67(int[] nums) {
  boolean flag = true;
  int sumOfArray = 0;

  for (int i = 0; i<nums.length; i++){

    if (nums[i] == 6) {
      flag = false;
    }

    if (flag == true) {
      sumOfArray += nums[i];
    }

    if (nums[i] == 7) {
      flag = true;
    }


  } return sumOfArray;
}
