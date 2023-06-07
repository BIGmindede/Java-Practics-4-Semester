package lab_07.flyWeight;

// этот паттерн про экономию памяти за счет использования общих параметров для отдельных экземпляров

public interface Brush {
    public void setColor(String color);
    public void draw(String content);
}
