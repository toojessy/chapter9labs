// Jessica Kamienski
// 10/22

public class CoffeeShop {
    // TODO 1: Change the class name to CoffeeShop

    public static void main(String[] args) {
        // TODO 2: Create three CoffeeOrder objects
        // Use a different constructor each time
        CoffeeOrder order1 = new CoffeeOrder();
        CoffeeOrder order2 = new CoffeeOrder("large");
        CoffeeOrder order3 = new CoffeeOrder("small", "black");

        // TODO 3: Call describeOrder() on each and print the result
        CoffeeOrder myOrder = new CoffeeOrder();
        System.out.println(order1.describeOrder()); //used ai to call describe order from the other tab
        System.out.println(order2.describeOrder());
        System.out.println(order3.describeOrder());

        // TODO 4: Print the total number of orders using
        // CoffeeOrder.getTotalOrders()
        System.out.println(CoffeeOrder.getTotalOrders());
    }
}
