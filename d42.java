//warmup1

public int intMax(int a, int b, int c) {
  int d = Math.max(a, b);

  int e = Math.max(d, c);

  if (d > e) {
    return d;
  } else return e;
}
