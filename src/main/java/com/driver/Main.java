package com.driver;

public class Main {

    B b=new B();
    String ans=b.meth();
    String ans1=b.meth();
    public class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public class B extends A{
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
}
