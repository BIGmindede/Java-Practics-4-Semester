package lab_06.Builder;

public class Director {
    public int construct() {

        return new ConcreteBuilder1().buildPart() + new ConcreteBuilder2().buildPart();


    }
}
