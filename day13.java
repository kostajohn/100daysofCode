//string-1 helloName
public String helloName(String name) {
  return "Hello " + name + "!";
}
//string-1 seeColor
public String seeColor(String str) {

  String colorOrEmpty = "";

if (str.length() >= 3 && str.substring(0, 3).equals("red")){
  colorOrEmpty = "red";
} else if (str.length() >= 4 && str.substring(0, 4).equals("blue")){
  colorOrEmpty = "blue";
}

  return colorOrEmpty;
}

//string-1 nonStart
public String nonStart(String a, String b) {
  return a.substring(1, a.length()) + b.substring(1, b.length());
}


//string-2
public String repeatSeparator(String word, String sep, int count) {
  String wordAdder = word;

if (count == 0){
  wordAdder = "";
}

for (int i = 1; i < count; i++) {
  wordAdder += sep + word;
}

return wordAdder;

}
