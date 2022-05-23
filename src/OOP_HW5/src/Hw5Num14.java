interface Shape {
    final double PI = 3.14;          // 상수
    void draw();                    // 도형을 그리는 추상 메소드
    double getArea();               // 도형의 면적을 리턴하는 추상 메소드
    default public void redraw() { // 디폴트 메소드
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Circle implements Shape{
    private int radius;

    public Circle(int rad){                 //이건 왜 매개변수 없는 생성자 안만들어도 되는거지???
        radius = rad;
    }

    @Override
    public void draw(){
        System.out.println("반지름이 " + radius + "인 원입니다.");
    }

    @Override
    public double getArea(){
        return 3.14*(radius*radius);
    }
}

class Oval implements Shape{
    int width;
    int height;

    public Oval(int wid, int hei) {
        width = wid;
        height = hei;
    }

    @Override
    public void draw(){
        System.out.println(width + "x" + height + "에 내접하는 타원입니다.");
    }

    @Override
    public double getArea() {
        return 3.14*width*height;
    }
}

class Rect implements Shape{
    int width;
    int height;

    public Rect(int wid, int hei) {
        width = wid;
        height = hei;
    }

    @Override
    public void draw() {
        System.out.println(width + "x" + height + "크기의 사각형 입니다.");
    }

    @Override
    public double getArea() {
        return width*height;
    }
}

public class Hw5Num14 {
    public static void main(String[] args) {
        Shape [] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20,30);
        list[2] = new Rect(10,40);

        for(int i = 0; i<list.length; i++) list[i].redraw();
        for(int i = 0; i< list.length; i++) System.out.println("면적은 " + list[i].getArea());
    }
}
