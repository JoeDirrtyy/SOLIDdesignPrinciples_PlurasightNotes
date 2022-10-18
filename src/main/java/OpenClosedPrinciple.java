import lombok.AllArgsConstructor;
import lombok.Data;

//This principle states that software entities (classes, modules, functions, etc.) should be opened to extension but closed to modification.
//It means that you should avoid having to modify the logic of something on your system when the components are growing



public class OpenClosedPrinciple {

    public static void main(String[] args) {

    }
}

@Data
@AllArgsConstructor
class AreaCalculator {
    private Shape shape;

    public void calculate() {
        shape.calculate();
    }
}

interface Shape {
    void calculate();
}

@Data
@AllArgsConstructor
class Rectangle implements Shape {
    public Double height;
    public Double width;

    @Override
    public void calculate() {
        System.out.println(height * width);
    }
}

@Data
@AllArgsConstructor
class Circle implements Shape {
    public Double radius;

    @Override
    public void calculate() {
        System.out.println(radius * radius * 3.14);
    }
}