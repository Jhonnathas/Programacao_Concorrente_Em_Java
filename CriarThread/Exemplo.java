package CriarThread;
import java.util.Scanner;

public class Exemplo{
    public static void main (String [] args){
        int x = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Exemplo de Criação");
        Thread t1 = new MyThread(x);
        Thread t2 = new MyThread(x);
        //while(true){
        t1.start();
        t2.start();
            //System.out.println("Para Parar digite 1");
            //x = sc.nextInt();
          //  if(x == 0) break;
        //}
    }
}