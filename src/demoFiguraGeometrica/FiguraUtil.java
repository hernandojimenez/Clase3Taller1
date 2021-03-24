package demoFiguraGeometrica;

public class FiguraUtil {
    public static double areaPromedio(FiguraGeometrica[] arr) {
        double sum = 0;

        for (FiguraGeometrica figura : arr) {
            sum += figura.area();
        }

        return sum / arr.length;
    }
}
