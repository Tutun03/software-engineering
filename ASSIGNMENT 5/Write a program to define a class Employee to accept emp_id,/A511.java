import java.util.Scanner;



class EMPLOYEE {
    int employee_s;
    int emp_id;
    String employee_n;


}
class A511 extends EMPLOYEE{
    void gross_salary()
    {
         float  MADA;
        MADA = 15000;
        float DA=super.employee_s*0.03f;
        float gross_salary=MADA+DA;
        System.out.println("Name:- " + super.employee_n + " id:- " +emp_id + " basic salary:-  " + super.employee_s + " gross salary:-  " + gross_salary);
    }
    public static void main(String[] args) {
        A511 ob=new A511();
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        String l=sc.next();
        int k= sc.nextInt();
        ob.employee_s=p;
        ob.employee_n=l;
        ob.emp_id=k;
        ob.gross_salary();

    }



}

