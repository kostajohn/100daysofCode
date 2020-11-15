 class PracticeMethods {

 public static void main(String[] args) {

   String firstName = "John";
   String lastName = "Kosta";
   String fullName = createFullName(firstName, lastName);

   String fullName2 = createFullName("Demetri", "Kosta");
   System.out.println(fullName);
   System.out.println(fullName2);

   System.out.println(exponents(8));


   System.out.println(backwardsName("John"));


}

public static String createFullName(String a, String b) {
  return a + " " + b;



}


public static int exponents(int a){
  return a * a;
}



public static String backwardsName(String c) {
  String newName = "";
  for (int i = c.length()-1; i>=0; i--) {
    newName = newName + c.charAt(i);
  } return newName;

}



}
