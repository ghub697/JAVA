abstract class Sem4
{
    abstract void display();
}

class Java extends Sem4
{
    void display()
    {
        System.out.println("Java is one of the subject in 4th sem");
    }
}

class DSP extends Sem4
{
    void display()
    {
        System.out.println("DSP is one of the subject in 4th sem");
    }
}

class SE extends Sem4
{
    void display()
    {
        System.out.println("SE is one of the subject in 4th sem");
    }
}

class OS extends Sem4
{
    void display()
    {
        System.out.println("OS is one of the subject in 4th sem");
    }
}

class Abstract
{
    public static void main(String X[])
    {
        Sem4 r;
        r = new Java();
        r.display();
        r = new DSP();
        r.display();
        r = new SE();
        r.display();
        r =  new OS();
        r.display();
    }
}