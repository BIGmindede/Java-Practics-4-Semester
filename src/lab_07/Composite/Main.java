package lab_07.Composite;

public class Main {
    public static void main(String[] args) {
        // Вычислим выражение - 20 - (5-2) - (11+6)
        // Приведем к следующему виду 20 - a - b
        SubExpression expr = new Expression();

        SubExpression a = new Expression(new IntegerValue(5), new IntegerValue(-2));
        SubExpression b = new Expression(new IntegerValue(11), new IntegerValue(6));

        expr.add(new IntegerValue(20));
        expr.sub(a);
        expr.sub(b);

        System.out.println(expr.value());
    }
}
