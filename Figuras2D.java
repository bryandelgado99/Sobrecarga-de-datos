public class Figuras2D {

    //Definimos triangulo equilatero y cuadrado------------------------------------

    //Atributos--------------------------------------------------------------------
    int num_lados; //Si se usa private, no se puede osbervar los atributos en el main
    float lado, altura;

    //Constructor-------------------------------------------------------------------
    public Figuras2D(int num_lados, float lado, float altura) {
        this.num_lados = num_lados;
        this.lado = lado;
        this.altura = altura;
    }

    //Setter y Getter---------------------------------------------------------------
    //Para num_lados:
    public int getNum_lados() {
        return num_lados;
    }

    public void setNum_lados(int num_lados) {
        this.num_lados = num_lados;
    }

    //Para lados:
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    //Método para definir áreas y perímetros---------------------------------------
    public float areaCuadrado(int lado){
        return this.lado * this.lado;
    }

    private float perimetroCuadrado(){
        return this.lado*4;
    }

    public float areaTriangulo(){
        return (this.lado*this.altura)/2;
    }

    private float perimetroTriangulo(){

    }

}
