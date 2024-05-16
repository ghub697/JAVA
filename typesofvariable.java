class Student
{
int rollno;
int m1;
int m2;
static String bname ="computer Science";

void getData(int x,int y, int z)
{
rollno = x;
m1 = y;
m2 = z;
}

void display()
{
float avg = (m1+m2)/2;
System.out.println("Rollno is : "+rollno);
System.out.println("M1 : "+ m1);
System.out.println("M2 : "+ m2);
System.out.println("Average is : "+ avg);
System.out.println("Branch : "+ bname);
}
}

class Typesofvariable
{
 public static void main(String x[])
  {
   Student s = new Student();
   s.getData(65,80,80);
   s.display();
}
}