class Point {
    private int x,y;
    public Point(){ this(0,0);  }   //추가가능?? 파라메터 비어서 호출하는거 없어도 왜 있어야하지..
    public Point(int x, int y){ this.x = x; this.y = y;}
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y){ this.x = x; this.y = y;}

    @Override
    public String toString() {
        return "(" + x + "," + y + ")" + "의 점";
    }
}

public class PositivePoint extends Point {
    public PositivePoint(int x, int y){
        super(x,y);
        int checkX = getX();
        int checkY = getY();

        if(checkX<0 || checkY <0){
            super.move(0,0);
        }
    }
    public PositivePoint(){ super(); }

    @Override
    protected void move(int x, int y) {
        if (x >= 0 && y >= 0) { super.move(x,y); }
    }

    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");

        p.move(-5,5);
        System.out.println(p.toString() + "입니다.");

        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");
    }
}