class Shape
{
    void draw()
    {
        System.out.println("Drawing");
    }
}

class Rect extends Shape
{
    void draw()
    {
        System.out.println("Drawing Rectangle");
    }
}

class Tri extends Shape
{
    void draw()
    {
        System.out.println("Drawing Triangle");
    }
}

class Methodoverriding
{
    public static void main(String X[])
    {
        Shape s;
        s = new Rect();
        s.draw();
        s = new Tri();
        s.draw();
    }
}