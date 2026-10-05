public class function2 {
    void get_choc(int money) {
        System.out.println(money);
        System.out.println("Chocolate purchased!");
    }

    void get_soap(int money) {
        System.out.println(money);
        System.out.println("Soap purchased!");
    }

    void get_milk(int money) {
        System.out.println(money);
        System.out.println("Milk purchased!");
    }

    public static void main(String[] args) {
        function2 obj1 = new function2();
        obj1.get_soap(20);
        obj1.get_choc(5);
        obj1.get_milk(10);
    }
}