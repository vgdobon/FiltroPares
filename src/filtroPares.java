import java.util.Scanner;

public class filtroPares {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un rango de numero");
        int valor=sc.nextInt();
        String divisibles="";
        
        int contador=0;
        
        while(contador<=valor){
            if(contador%2==0){
                divisibles=divisibles+contador+",";
            }
            contador++;
        }

        System.out.println("Los números divisibles por 2 entre 0 y "+valor+" son:"+divisibles);
        
    }
}
