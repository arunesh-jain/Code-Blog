package SOLIDPrinciples.OCP;

public class OCPMain {
    public static void main(String[] args) throws Exception {
        Calculator cal = new Calculator();
        Addition add = new Addition(10,5);
        Subtraction sub = new Subtraction(10,5);
        Multiplication mul = new Multiplication(10,5);
        cal.calculate(add);
        System.out.println("result: "+add.sum);
        cal.calculate(sub);
        System.out.println("result:  "+sub.difference);
        cal.calculate(mul);
        System.out.println("result:  "+mul.product);

    }
}