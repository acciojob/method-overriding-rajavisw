package com.driver;

public class Main {

    public static void main(String[] args){
        B b=new B();
        String ans=b.meth();
        String ans1=b.meth();
    }
    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
}
