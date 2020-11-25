import java.util.Arrays;
class countDown {

public static void main(String args[]) {

for (int i = 10; i >= 0; i--) {
  System.out.println(i);

}

System.out.print(Arrays.toString((counting(5))));
System.out.print(Arrays.toString((counting(101))));
//need to use arrays.tostring, otherwise will just print memory location of array


}

public static int[] counting(int a) {
int[] counter = new int[a+1];
for (int i = 0; i<=a; i++) {
  counter[i] = i;

} return counter;

}




}
