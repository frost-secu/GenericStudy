import java.util.Scanner;
import java.util.Stack;

public class GenericTest {
    static Scanner input_sc = new Scanner(System.in);
    static Stack<String> stackS1 = new Stack<>();
    static Stack<String> stackS2 = new Stack<>();
    public static void stackManual(){
        System.out.println("-- Choose case --");
        System.out.println("-- 1 : push to Stack 1 --");
        System.out.println("-- 2 : Move value --");
        System.out.println("-- 3 : Peek Stacks --");
        System.out.println("-- 4 : Empty Check --");
    }
    public static void pushStack(){
        System.out.print("Push String --> "); stackS1.push(input_sc.next());
    }
    public static void moveValue(){
        peekStacks();
        System.out.println("   ㄴ 1 : Push Stack 1 --> Stack 2");
        System.out.println("   ㄴ 2 : Push Stack 2 --> Stack 1");
        if (isEmpty() == 0){
            System.out.println("Two stacks are empty.");
        }
        else{
            System.out.print("Input case --> ");    int caseUse = input_sc.nextInt();
            if (caseUse == 1){
                if (isEmpty() == 1){
                    System.out.println("S1 is empty. Error");
                }
                else System.out.println("Last S1 --> Push S2");  stackS2.push(stackS1.pop());
            }
            if (caseUse == 2) {
                if (isEmpty() == 2){
                    System.out.println("S2 is empty. Error");
                }
                else System.out.println("Last S2 --> Push S1");  stackS1.push(stackS2.pop());
            }
        }
    }
    public static int isEmpty(){
        if (stackS1.isEmpty() && stackS2.isEmpty()){
            System.out.println("Two stacks are empty");
            return 0;
        }
        else if (stackS1.isEmpty()) {
            System.out.println("Stack 1 is empty");
            return 1;
        }
        else if (stackS2.isEmpty()) {
            System.out.println("Stack 2 is empty");
            return 2;
        }
        else {
            System.out.println("Not empty");
            return 3;
        }
    }
    public static void peekStacks(){
        System.out.println("---------->>>>>>");
        System.out.println("NOW Stack");
        System.out.println("----------");
        System.out.println("Stack 1 : "+stackS1);
        System.out.println("---------------------------------");
        System.out.println("Stack 2 : "+stackS2);
        System.out.println("---------------------------------");
    }
    public static void stackGeneric(){
        stackManual();
        int caseUse;
        while (true){
            System.out.print("Input case --> ");  caseUse = input_sc.nextInt();
            switch (caseUse) {
                case 1:
                    pushStack(); break;
                case 2:
                    moveValue(); break;
                case 3:
                    peekStacks(); break;
                case 4:
                    isEmpty(); stackManual();   break;
                case 0:
                    System.out.println("Program end");  System.exit(0); break;
                default:
                    System.out.println("Invalided code"); break;
            }
        }
    }
    public static void main(String[] args) {
        stackGeneric();
    }
}
