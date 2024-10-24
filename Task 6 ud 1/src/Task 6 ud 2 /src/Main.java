public class Main {

    public static void main(String[] args) {
        Flows flows = new Flows();
     //   System.out.println("flows.methodA(\"Hello, world\");");
     //   flows.methodA("Hello, world");
        flows.methodA("start");
        System.out.println("flows.methodA(\"start\");");
        flows.methodB("Hello, world");
        System.out.println("flows.methodB(\"Hello, world\");");
        flows.methodC("Hello, world");
        System.out.println("flows.methodC(\"Hello, world\");");
        flows.methodD(25);
        System.out.println("flows.methodD(25);");

    }
       
}