public class store {

    int get_soap(int money)
    {
        int soap_price = 10;
        int reminder = money - soap_price;
        return reminder;
    }

    public static void main(String[] args) {
        
        store obj1 = new store();
        int reminder = obj1.get_soap(100);
        System.out.println(reminder);
    }
    
}
