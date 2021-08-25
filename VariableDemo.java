class VariableDemo{
    int b = 10; //instance variable
    static int c = 15; //static variable
    public static void main(String[] args){
        int a = 5; //local variable
        VariableDemo obj = new VariableDemo();
        System.out.println("Local Variable:"+a);
        System.out.println("Instance Variable:"+obj.b);
        System.out.println("Static Variable:"+obj.c);
    }
}