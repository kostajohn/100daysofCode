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


//array2 lucky13
public boolean lucky13(int[] nums) {
  int countOneThree = 0;

  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 1 || nums[i] == 3) {
      countOneThree++;
    }
  } return countOneThree == 0;
}

//array2 Has22
public boolean has22(int[] nums) {
  boolean twoTwo = false;

  for (int i = 0; i < nums.length-1; i++){
    if (nums[i] == 2 && nums[i+1] == 2){
      twoTwo = true;
    }
  }

  return twoTwo;
}
