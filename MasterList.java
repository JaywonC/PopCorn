import java.util.*;

public class MasterList {
    private ArrayList <PopcornOrder> orders;
    public MasterList(){
         orders = new ArrayList<PopcornOrder>();
    }
    public void addOrders(PopcornOrder e){
        orders.add(e);
    }
    public int getTotalOrders(){
        int num = 0;
        for (int i = 0; i< orders.size(); i++){
            PopcornOrder yes = orders.get(i);
            num = num + yes.getNumOrdered();
        }
        return num;
    }
    public int removeVariety(String s) {
        int count = 0;
        for (int i = orders.size() - 1; i >= 0; i--) {
            PopcornOrder yes = orders.get(i);
            if (yes.getVariety().equals(s)) {
                count = count + yes.getNumOrdered();
                orders.remove(i);
            }
        }
        return count;
    }
    public String toString(){
        if (orders.size()>1){
            String s = "";
            for (int i = 0;i < orders.size()-1; i++){
                PopcornOrder yes = orders.get(i);
                s = s + " This order has " + yes.getVariety() + " and there are " + yes.getNumOrdered() + " in this order";
            }
            return s; 
        }
        return "there are no orders in this order";
    }
    
}
