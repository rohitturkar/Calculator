import java.util.Scanner;
class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This is calculator programm ");
        while (true) {
            System.out.println("Enter the operands");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter the first number");
                int n1 = in.nextInt();
                System.out.println("Entre the second number");
                int n2 = in.nextInt();
                if(op=='+'){
                System.out.println(n1+"+"+n2+"="+(n1+n2));
                }
                if(op=='-'){
                    System.out.println(n1+"-"+n2+"="+(n1-n2));
                }
                if(op=='*'){
                    System.out.println(n1+"*"+n2+"="+(n1*n2));
                }
                if(op=='/'){
                    System.out.println(n1+"/"+n2+"="+(n1/n2));
                }
                if(op=='%'){
                    System.out.println(n1+"%"+n2+"="+(n1%n2));
                }

            }
        }
    }
}