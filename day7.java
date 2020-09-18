//day 7

//warmup1 max1020
public int max1020(int a, int b) {

  int larger = 0;

  if ((a <= 20 && a >= 10) && (b <= 20 && b >= 10)) {
    larger = Math.max(a, b);
  } else if ((a <= 20 && a >= 10) && (b > 20 || b < 10)) {
    larger = a;
  } else if ((a > 20 || a < 10) && (b <= 20 && b >= 10)) {
    larger = b;
  }

  return larger;

}

//Array1 commonEnd
public boolean commonEnd(int[] a, int[] b) {

  return (a[0] == b[0]) || (a[a.length-1] == b[b.length-1]);
}


//Logic1 lessby10
public boolean lessBy10(int a, int b, int c) {
  boolean tenOrMore = false;

  if(Math.abs(a - b) >= 10) {
    tenOrMore = true;
  } else if (Math.abs(a - c) >= 10) {
    tenOrMore = true;
  } else if (Math.abs(b - c) >= 10) {
    tenOrMore = true;
  }

  return tenOrMore;

}
//failed on logic2:NoTeenSum, makeChocolate; array2:notalone, has12;
