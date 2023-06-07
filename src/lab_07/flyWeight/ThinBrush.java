package lab_07.flyWeight;

public class ThinBrush implements Brush {

     // intrinsic state - shareable
    final BrushSize brushSize = BrushSize.THIN;

    // extrinsic state - supplied by the client
    private String color = null;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing ‘" + content + "' in thin color : " + color);
    }
}
