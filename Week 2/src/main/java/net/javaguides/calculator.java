package net.javaguides;

class calc {
    int sum;
    public int add(int a,int b){
        sum = a+b;
        return sum;
    }
    public void show(){
        System.out.println("Addition is: "+sum);
    }
}
public class calculator {
    public static void main(String[] args) {
        calc c = new calc();
        c.add(10,20);
        c.show();

    }
}
