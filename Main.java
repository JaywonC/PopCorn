
public class Main {
    public static void main (String args[]){
        MasterList popcorn2023 = new MasterList();
        popcorn2023.addOrders(new PopcornOrder("Jalapeno Cheese", 1));
        popcorn2023.addOrders(new PopcornOrder("Butter Microwave", 3));
        popcorn2023.addOrders(new PopcornOrder("Butter Microwave", 2));
        popcorn2023.addOrders(new PopcornOrder("Caramel With Sea Salt", 2));
        popcorn2023.addOrders(new PopcornOrder("Caramel With Sea Salt", 5));
        popcorn2023.addOrders(new PopcornOrder("Kettle Corn", 4));
        System.out.println(popcorn2023);
        System.out.println(popcorn2023.getTotalOrders());
        System.out.println(popcorn2023.removeVariety("Butter Microwave"));
        System.out.println(popcorn2023.removeVariety("Kettle Corn"));
        MasterList popcorn2024 = new MasterList();
        System.out.println(popcorn2024);
    }
}
