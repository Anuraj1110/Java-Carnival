class Parent{
    int x = 10;
    {
        x = 20;
    }

    Parent(int a ){
        x = a;
    }
}

public class keySuper1 {
    public static void main(String[] args){
        Parent p = new Parent(12);
        System.out.println(p.x);
    }
}
