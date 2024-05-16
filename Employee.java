class Employee
{
    int salary=20000; 
}

class Programmer extends Employee
{
    int bonus=2000;
    public static void main(String X[])
    {
        Programmer p = new  Programmer();
        System.out.println("Employee salary is : "+p.salary);
        System.out.println("Programmers bonus is : "+p.bonus);
    }
}