public class MyClass {
    /**
     * InnerMyClass
     */
    public static class InnerMyClass {
    
        private int a =10;
        int b =20;
    }

    /**
     * InnerMyClass_1
     */
    public class InnerMyClass_1 {
        
        
    }
    public static void main(String []args){
        System.out.println("hello world Java");

        InnerMyClass i = new InnerMyClass();
        
        System.out.println(i.a);
        

        
    }
}