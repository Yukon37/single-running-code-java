//javac -encoding utf-8 Main.java
//java Main
import java.util.*;


public class bingo{

	public static void main ( String[] args ) {

    int max = 9;
    
    boolean[] push = new boolean[max];

    int hit = 0;
    hit = new Random().nextInt(max);
    hit++;

    int chose = 0 ;

    System.out.println("Don't push miss number.");
    System.out.println("");
    

    for(int i =0 ; i < max ; i++ ){
            System.out.println("123456789");
        for(int j = 0; j < max; j++){
            if(push[j]){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
            System.out.println("");
            System.out.println("choose the number");
            System.out.println("");
        chose = new Scanner(System.in).nextInt();

        if(chose == hit ){
                System.out.println("you lose");
                break;
        }

        else{
                System.out.println("safe");
                System.out.println("");
                push[chose -1 ] = true;
        }
    




    }



	}


}
