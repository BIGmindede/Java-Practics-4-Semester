package P6.Builder;

public class ConcreteBuilder2 implements Builder{
    int staff;

    @Override
    public void buildStaff() {
        staff = 2;
    }
    public int getResult() {
        return staff;
    }
}
