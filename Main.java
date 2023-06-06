public class Main {
    public static void main (String[] args){
        //Instancia-----------------------------------------------
        Figuras2D square= new Figuras2D(4, 6, 5);
        square.setLado(3);

        //Menu----------------------------------------------------
        System.out.println("\n------------------------------- Bienvenido! ---------------------------\n");

        System.out.println("Mi figura es: " + square.areaCuadrado(4));
    }
}
