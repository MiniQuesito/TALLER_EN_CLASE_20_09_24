import java.util.Scanner;

public class App {

    //Variables globales
    
    static String con1 = "1";
    static String con2 = "2";
    static String con3 = "3";
 


    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese el numero de su cedula: ");
        String numcedula = entrada.nextLine();

        System.out.println("Su numero de cedula es: " + numcedula);



       cedula(numcedula);

       

    }
 
    public static String cedula(String num){
         
        if (num.contains(con1)){
        
            System.out.println("Su puesto de votacion es en Soacha");
            
        }else if (num.startsWith(con2)){
            System.out.println("Su puesto de votacion es en Funza");
        }
        else if(num.contains(con3)) {
            System.out.println("Su puesto de votación es en madrid");
        }
        return num;

    }
}
