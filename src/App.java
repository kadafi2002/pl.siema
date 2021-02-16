import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     // System.out.println("podaj swoje imię");
      //Scanner scanner = new Scanner (System.in);
     // String firstName = scanner.nextLine();
     // System.out.println("Twoje imię to " + firstName );
    //  scanner.close();
  

        //      System.out.println(A+"+"+B+"+"+C=)
         // KALKULATOR DWÓCH LICZB 
       // System.out.println("Podaj pierwszą liczbę");
        //int a = scanner.nextInt();
        //System.out.println("Podaj drugą licfzbę");      
        //int b = scanner.nextInt();
        //System.out.println(a+" + "+b+" = "+(a+b));      
         // IF ELSE
       // int nr = 10;
        //if(nr == 2){
        //  System.out.println("Liczba to 2");
       // }else if(nr == 3){
       //   System.out.println("Liczba to 3");
      //  }else{
       //   System.out.println("Jakaś inna liczba niż 3 i 2");
       Scanner scanner = new Scanner(System.in);
     
       System.out.println("Wpisz pierwszą liczbę");
      int a = scanner.nextInt();

      System.out.println("Podaj operator + lub -");
      scanner.nextLine();
      String operator = scanner.nextLine();
      
      System.out.println("Wpisz drugą liczbę");
      int b = scanner.nextInt();

      if (operator equal "-"){
        System.out.println("Wynik to: " +(a-b));
        }
        else if(operator equal "+"){
            System.out.println("Wynik to: " +(a+b));
        }
        else{
            System.out.println("Wpisz odpowiedni operator. Spróbój ponownie.");
     
        }
        
      scanner.close();
      
      
    
   
      }
}
