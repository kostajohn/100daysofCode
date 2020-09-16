
//warm up 1
public int diff21(int n) {
  int ddifference = 0;

  if (n > 21) {
    ddifference = Math.abs(21 - n) * 2;
  } else {
    ddifference = Math.abs(21 - n);
  }

  return ddifference;

}

//array2 either24

public boolean either24(int[] nums) {
  boolean fours = false;
  boolean twos = false;

  for (int i = 0; i<nums.length-1; i++) {
    if (nums[i] == 2 && nums[i+1] == 2) {
      twos = true;
    } else if (nums[i] == 4 && nums[i+1] == 4) {
      fours = true;
    }

  if (fours == true && twos == true) {
    fours = false;
    twos = false;
  }

  } return fours || twos;
}
