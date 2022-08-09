package com.basics;

class showroom{
void show(){
System.out.println("show method of showroom class");
}
}

public class overriding extends showroom{
   void show(){
System.out.println("show method overriding  of class");
}
public static void main(String[] args){
System.out.println("main mehod of starts here");
overriding d1 = new overriding ();
d1.show();

}
}
