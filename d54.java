//Ap-1 scores100
public boolean scores100(int[] scores) {
  boolean nextToEachOther = false;
  for (int i = 1; i<scores.length-1; i++) {

    if (scores[i] == 100 && (scores[i+1] == 100 || scores[i-1] == 100)) {
      nextToEachOther = true;
    }

  } return nextToEachOther;




}
