import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
   public class Main {
 /*   static void Hello(){
        System.out.println("Selam");

    }
    static int power(int base, int exp){
        int result=1;
        for (int i=1; i<=exp; i++){
            result *=base;
        }
        return result;
    }*/

    static int f(int n){
        System.out.println(n);
        if (n ==1){
            return 1;
        }
        return f(n-1) +n;
    }


    public static void main(String[] args) {

        f(4);


        /*int base = 2, exp=3, result=1;
        for (int i=1; i<=exp; i++){
            result *=base;
        }
        System.out.println(result);

        base = 4;
        exp=2;
        result=1;
        for (int i=1; i<=exp; i++){
            result *=base;
        }
        System.out.println(result);*/

  }
}