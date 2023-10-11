import java.util.List;

public class Main {
    public static void main(String[] args) {

        HotVendingMashine HVM = new HotVendingMashine();
        HVM.initProductName(List.of(new HotDrinks("Coffee", 300, 60, 100), (new HotDrinks("Latte", 250, 90, 70))));
        System.out.println(HVM.getProductName());
    }
}