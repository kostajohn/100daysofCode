//Ap-1 scores100
public boolean scores100(int[] scores) {
  boolean nextToEachOther = false;
  for (int i = 1; i<scores.length-1; i++) {

    if (scores[i] == 100 && (scores[i+1] == 100 || scores[i-1] == 100)) {
      nextToEachOther = true;
    }

  } return nextToEachOther;




}

//Logic2 makeBricks 
public boolean makeBricks(int small, int big, int goal) {
  if (goal % 5 > small) {
    return false;
  } else if (big * 5 + small < goal) {
    return false;
  } else {
    return true;
  }
}
