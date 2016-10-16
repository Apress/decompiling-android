public class Casting {

 static final String ascStr = "ascii ";
 static final String chrStr = " character ";

 public static void main(String args[]){

  for(char c=0; c < 128; c++) {
      System.out.println(ascStr + (int)c + chrStr + c);
  }
 }
}