//logic2
public boolean evenlySpaced(int a, int b, int c) {

  int small = 0;
  int medium = 0;
  int large = 0;


  if (a < b && a < c) {
    small = a;
  } else if (a > b && a > c) {
    large = a;
  } else {
    medium = a;
  }

  if (b < a && b < c) {
    small = b;
  } else if (b > a && b > c) {
    large = b;
  } else {
    medium = b;
  }

  if (c < a && c < b) {
    small = c;
  } else if (c > a && c > b) {
    large = c;
  } else {
    medium = c;
  }

  if (a == b && b != c) {
    return false;
  } else if (a == c && b != a) {
    return false;
  }



  int distanceSmallMedium = Math.abs(small - medium);
   int distanceMediumLarge = Math.abs(medium - large);


  if (distanceSmallMedium == distanceMediumLarge){
    return true;
  } else {
    return false;
  }



}
