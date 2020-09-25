//warmup1 close10
public int close10(int a, int b) {
  int closerToTen = 0;

  if (Math.abs(10 - a) < Math.abs(10 - b)) {
    closerToTen = a;
  } else if (Math.abs(10 - a) > Math.abs(10 -b)) {
    closerToTen = b;
  }

  return closerToTen;
}
