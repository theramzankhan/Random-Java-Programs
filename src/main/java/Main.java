// public class Main {
//   public static void main(String[] args) {
//     System.out.println("Hello world!!!");
//   }
// }

public class Main {
  public static void main(String[] args) {
    
    int grades[]={85,34,97,75,42,86,76,88};
    
    for(int i=0;i<grades.length;i++){
      if(grades[i]<=70){
        continue;
      }
      System.out.println("Passing grades of course number : "+ i + " " + grades[i]);
    }
  }
}