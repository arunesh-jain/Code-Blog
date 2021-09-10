package SOLIDPrinciples.SRP;

public class SRP_main {
    public static void main(String[] args) {
        TextManipulator textmanipulator = new TextManipulator("Arunesh Jain");
        TextPrinter textPrinter = new TextPrinter(textmanipulator);
        System.out.println(textmanipulator.appendText("SRP_Code_Example"));
        textPrinter.printOutEachWordOfText();
    }
}