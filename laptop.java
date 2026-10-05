public class laptop {

    String name = "";
    String proc = "";
    int ram = 0;
    int price = 0;

    public static void main(String[] args) {
        
        laptop lap1 = new laptop();

        lap1.name = "hp";
        lap1.proc = "i7";
        lap1.ram = 6;
        lap1.price = 40000;

        laptop lap2 = new laptop();
        
        lap2.name = "mac";
        lap2.proc = "i7";
        lap2.ram = 7;
        lap2.price = 50000;

        System.out.println(lap2.price);
        lap2.price = 60000;
        System.out.println(lap2.price);
    }
    
}
