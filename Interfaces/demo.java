package Interfaces;

interface A {
    public String functionA();
}


class B implements A{

    @Override
    public String functionA() {
        return "Sagol";
        
    }
    public void functionB(){
        System.out.println("ItCanAlsoBeB");
    }
}


public class demo{
    public static void main(String[] args) {
       
    }
}
