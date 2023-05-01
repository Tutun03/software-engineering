public class E8 {
    int a=5;

    public static void main(String[] args) {
        E8 on=new E8();
        on.a=7; //if final int a=5 then value can not be updated

        System.out.println(on);
    }
}
