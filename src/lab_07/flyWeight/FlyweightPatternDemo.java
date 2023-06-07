package lab_07.flyWeight;

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        Brush redThickBrush1 = BrushFactory.getThickBrush("RED");
        redThickBrush1.draw("Tree with apples");

        Brush redThickBrush2 = BrushFactory.getThickBrush("RED");
        redThickBrush1.draw("Tree with apples 2 part");

        System.out.println("hashcode: " + redThickBrush1.hashCode());
        System.out.println("hashcode: " + redThickBrush2.hashCode());


        Brush blueThinBrush1 = BrushFactory.getThinBrush("BLUE"); //created new pen
        blueThinBrush1.draw("Hello There !!");

        Brush blueThinBrush2 = BrushFactory.getThinBrush("BLUE"); //created new pen
        blueThinBrush2.draw("Hello There Again!!");

        System.out.println("Hashcode: " + blueThinBrush1.hashCode());
        System.out.println("Hashcode: " + blueThinBrush2.hashCode());


        Brush yellowThinBrush1 = BrushFactory.getMediumBrush("YELLOW"); //created new pen
        yellowThinBrush1.draw("Hello There !!");

        Brush yellowThinBrush2 = BrushFactory.getMediumBrush("YELLOW"); //created new pen
        yellowThinBrush2.draw("Hello There Again!!");

        System.out.println("Hashcode: " + yellowThinBrush1.hashCode());
        System.out.println("Hashcode: " + yellowThinBrush2.hashCode());



    }


}
