class Bank
 {
  int ano;
  float bal;
  String cname;

Bank()
{
 ano=1234;
 bal=1100;
 cname ="RAMA";
}

Bank(int x, float y, String z)
{
ano = x;
bal = y;
cname = z;
}

void display()
{
System.out.println("Account no : "+ano);
System.out.println("Account holder name : "+ cname);
System.out.println("Balance : "+ bal);
}
}

class Typesofconstructor
{
public static void main(String X[])
{
 System.out.println("Default Constructor");
 Bank b = new Bank();
 b.display();

 System.out.println("Parameterised Constructor");
 Bank b1 = new Bank(254,52000,"Rehan");
 b1.display();
}
}