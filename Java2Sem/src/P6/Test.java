package P6;

import P6.AbstractFactory.AbstractProduct;
import P6.AbstractFactory.Client;
import P6.Builder.Director;
import P6.FabricMethod.ConcreteProduct1;
import P6.FabricMethod.ConcreteProduct2;
import P6.FabricMethod.Creator;
import P6.FabricMethod.Product;
import P6.Prototype.ConcretePrototype1;
import P6.Prototype.ConcretePrototype2;
import P6.Prototype.Prototype;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
    public static void main(String ...args) {
        System.out.println("Фабричный метод: ");
        Creator Factory = new Creator();
        Product CarConcern1 = Factory.fabricMethod(1);
        Product CarConcern2 = Factory.fabricMethod(2);
        CarConcern1.info();
        CarConcern2.info();
        System.out.println('\n');

        System.out.println("Абстрактная фабрика: ");
        AbstractProduct[] prodByFact1 = Client.getProductsByFactory1();
        AbstractProduct[] prodByFact2 = Client.getProductsByFactory2();
        prodByFact1[0].info();
        prodByFact1[1].info();
        prodByFact2[0].info();
        prodByFact2[1].info();
        System.out.println('\n');

        System.out.println("Строитель: ");
        Director director = new Director();
        int[] item = director.constructedItem;
        Arrays.stream(item).forEach(a -> System.out.println(a + " элемент объекта"));
        System.out.println('\n');

        System.out.println("Прототип: ");
        Prototype prototype1 = new ConcretePrototype1(1);
        System.out.println("Прототип 1: " + prototype1);
        Prototype cloneOfProt1 = prototype1.clone();
        System.out.println("Клон прототипа 1 без пересоздания объекта: " + cloneOfProt1);
        Prototype prototype2 = new ConcretePrototype2(2);
        System.out.println("Прототип 2: " + prototype2);
        Prototype cloneOfProt2 = prototype2.clone();
        System.out.println("Клон прототипа 2 без пересоздания объекта: " + cloneOfProt2);

    }
}
