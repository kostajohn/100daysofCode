//warmup2 stringX



public String stringX(String str) {
 String minusX = "";

 if (str.equals("x")) {
   return str;
 }

 if (str.length() == 0) {
   return "";
 }


for (int i = 0; i<str.length(); i++) {
  if(str.charAt(i) != 'x') {
    minusX = minusX + str.charAt(i);
  }

}

if (str.charAt(0) == 'x') {
  minusX = 'x' + minusX;
}

if (str.charAt(str.length()-1) == 'x') {
  minusX = minusX + 'x';
}

return minusX;

}
