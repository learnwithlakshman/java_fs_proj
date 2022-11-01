package cj.day8;

public class StringExampleFour {

    public static void main(String[] args) {

        String empno = "1001";
        String ename = "Krish";
        float salary = 45000;
        String job = "SE";

        StringBuilder sb = new StringBuilder();
        //str = empno + "-" + ename + "-" + job + "-" + salary;
        sb.append(empno)
                .append("-")
                .append(ename)
                .append("-")
                .append(job)
                .append("-")
                .append(salary);
        System.out.println(sb.toString());

        String name = "MANOJ";
        StringBuilder sb1 = new StringBuilder(name);
        sb1.reverse();
        System.out.println(sb1.toString());


    }
}
