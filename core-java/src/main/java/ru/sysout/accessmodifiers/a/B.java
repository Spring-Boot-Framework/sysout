package ru.sysout.accessmodifiers.a;

public class B {
    void testAccess() {
        A a = new A();
        //a.privateVar = 10; // illegal
       // a.privateMethod(); // illegal
    }
}
