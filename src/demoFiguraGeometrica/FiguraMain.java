package demoFiguraGeometrica;

public class FiguraMain {

    public static void main(String[] args) {

        FiguraUtil util = new FiguraUtil();
        FiguraGeometrica[] arr = new FiguraGeometrica[3];

        arr[0] = new Circulo(4);
        arr[1] = new Triangulo(2, 5);
        arr[2] = new Rectangulo(3, 4);

        System.out.println("El area promedio es " + util.areaPromedio(arr));
    }
}
