package HomeWorkExceptionAreaFigure;


public class FigureException {
    public static void main(String[] args) {
        FigureCheck figureCheck = new FigureCheck("Ellipse", "Circle", "Rectangle");
        try {
            FigureCheck.printResult("Circle");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}

class FigureCheck {
    public static String Ellipse;
    public static String Circle;
    public static String Rectangle;

    public FigureCheck(String Ellipse, String Circle, String Rectangle) {
        this.Ellipse = Ellipse;
        this.Circle = Circle;
        this.Rectangle = Rectangle;
    }

    public static void printResult(String str) throws NoSuchFigureException {

        if (str == Ellipse) {
            System.out.println("Shape name is correct " + str);
        } else if (str == Circle || str == Rectangle) {
            System.out.println("Shape name is correct " + str);
        } else {
            throw new NoSuchFigureException(str);
        }
    }


}


class NoSuchFigureException extends Exception {


    public NoSuchFigureException(String str) {
        System.err.println("Shape name is not correct " + str);
    }


}
