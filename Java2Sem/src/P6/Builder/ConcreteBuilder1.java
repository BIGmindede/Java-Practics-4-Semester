package P6.Builder;

public class ConcreteBuilder1 implements Builder{
    int staff;

    @Override
    public void buildStaff() {
        staff = 1;
    }
    public int getResult() {
        return staff;
    }
}
