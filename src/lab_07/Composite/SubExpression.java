package lab_07.Composite;

// Паттерн «Компоновщик» позволяет сгруппировать множество
// объектов в древовидную структуру

public interface SubExpression {
    public Number value();

    public void add(SubExpression expr);
    public void sub(SubExpression expr);
    public SubExpression getSubExpression(int index);
}
