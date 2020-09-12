public boolean makes10(int a, int b) {
  boolean tenner = false;

  if (a == 10 || b == 10) {
    tenner = true;
  } else if (a + b == 10) {
    tenner = true;
  } return tenner;
}
