package P7.Composite;

public interface SubExpression {
    public Number value();

    public void add(SubExpression expr);
    public void sub(SubExpression expr);
    public SubExpression getSubExpression(int index);
}
