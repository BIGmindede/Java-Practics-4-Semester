package P6.Builder;

public class Director {
    public int[] constructedItem;
    public Director() {
        ConcreteBuilder1 builder1 = new ConcreteBuilder1();
        builder1.buildStaff();
        ConcreteBuilder2 builder2 = new ConcreteBuilder2();
        builder2.buildStaff();
        constructedItem = new int[]{builder1.getResult(), builder2.getResult()};
    }
}
