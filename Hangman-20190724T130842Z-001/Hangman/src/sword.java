public class sword{
    int variable = 10;                // instance variable
    public static void main(String[] args){
        sword obj = new sword();
        obj.method1();
        obj.method2();
    }

    void method1(){
        System.out.println(variable);
    }

    void method2(){
        int variable = 25;             // local variable
        System.out.println(this.variable);
    }
}