import java.util.ArrayList;

/** Represents a simulation for the restaurant. */
public class Driver {

    /**
     * Main simulation method.
     * @param args No command line args.
     */
    public static void main(String[] args) {
        
        // make a restaurant
        Restaurant myRestaurant = new Restaurant(3);

        // add staff
        myRestaurant.addStaff(new Cook("john"));
        myRestaurant.addStaff(new Cook("rahul"));
        myRestaurant.addStaff(new Bartender("george"));
        myRestaurant.addStaff(new Bartender("tina"));

        // make the FoodMenu
        myRestaurant.foodMenu.addItem(new MenuItem("risoto", 500, 20));
        myRestaurant.foodMenu.addItem(new MenuItem("lasagne", 450, 25));
        myRestaurant.foodMenu.addItem(new MenuItem("chocolate mousse", 350, 10));

        // make kids menu
        myRestaurant.kidsFoodMenu.addItem(new MenuItem("fries", 200, 15));
        myRestaurant.kidsFoodMenu.addItem(new MenuItem("sandwich", 200, 5));
        myRestaurant.kidsFoodMenu.addItem(new MenuItem("strawberry pancakes", 200, 15));

        // make cocktail menu
        myRestaurant.cocktailMenu.addItem(new MenuItem("margarita", 350, 10));
        myRestaurant.cocktailMenu.addItem(new MenuItem("old cuban", 400, 8));

        // make mocktail menu
        myRestaurant.mocktailMenu.addItem(new MenuItem("moijito", 200, 5));
        myRestaurant.mocktailMenu.addItem(new MenuItem("pina colada", 250, 10));

        // make customers
        Integer numCustomers = 5;
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("peter"));
        customers.add(new Customer("aditya"));
        customers.add(new Customer("dhruv"));
        customers.add(new Customer("karan"));
        customers.add(new Customer("olive"));

        // set customer arrival time
        ArrayList<Integer> timeOfArrival = new ArrayList<Integer>();
        timeOfArrival.add(0);
        timeOfArrival.add(150);
        timeOfArrival.add(200);
        timeOfArrival.add(210);
        timeOfArrival.add(320);

        // set customer departure time
        ArrayList<Integer> timeOfDeparture = new ArrayList<Integer>();
        timeOfDeparture.add(280);
        timeOfDeparture.add(250);
        timeOfDeparture.add(300);
        timeOfDeparture.add(270);
        timeOfDeparture.add(350);

        // make Orders
        ArrayList<Order> orders = new ArrayList<Order>();
        orders.add(new Order(customers.get(0)));
        orders.add(new Order(customers.get(1)));
        orders.add(new Order(customers.get(2)));
        orders.add(new Order(customers.get(3)));
        orders.add(new Order(customers.get(4)));

        // add items to orders
        orders.get(0).addItem(myRestaurant.foodMenu.findItem("risoto"));
        orders.get(0).addItem(myRestaurant.kidsFoodMenu.findItem("strawberry pancakes"));
        orders.get(0).addItem(myRestaurant.foodMenu.findItem("risoto"));
        

        orders.get(1).addItem(myRestaurant.foodMenu.findItem("lasagne"));
        orders.get(1).addItem(myRestaurant.cocktailMenu.findItem("margarita"));
        orders.get(1).addItem(myRestaurant.cocktailMenu.findItem("margarita"));
        orders.get(1).addItem(myRestaurant.mocktailMenu.findItem("moijito"));

        orders.get(2).addItem(myRestaurant.cocktailMenu.findItem("old cuban"));
        orders.get(2).addItem(myRestaurant.cocktailMenu.findItem("margarita"));
        orders.get(2).addItem(myRestaurant.mocktailMenu.findItem("pina colada"));
        orders.get(2).addItem(myRestaurant.mocktailMenu.findItem("pina colada"));
        orders.get(2).addItem(myRestaurant.kidsFoodMenu.findItem("fries"));
        orders.get(2).addItem(myRestaurant.kidsFoodMenu.findItem("fries"));

        orders.get(3).addItem(myRestaurant.foodMenu.findItem("risoto"));
        orders.get(3).addItem(myRestaurant.foodMenu.findItem("chocolate mousse"));
        orders.get(3).addItem(myRestaurant.kidsFoodMenu.findItem("fries"));
        orders.get(3).addItem(myRestaurant.kidsFoodMenu.findItem("sandwich"));

        orders.get(4).addItem(myRestaurant.foodMenu.findItem("risoto"));
        orders.get(4).addItem(myRestaurant.foodMenu.findItem("chocolate mousse"));

        // run the simulation

        ArrayList<Boolean> departed = new ArrayList<Boolean>();
        for (int i=0; i<customers.size(); i++) {
            departed.add(false);
        }

        ArrayList<Boolean> arrived = new ArrayList<Boolean>();
        for (int i=0; i<customers.size(); i++) {
            arrived.add(false);
        }

        Integer counter = 0;
        Integer clock = 0;

        System.out.println("\nTIME \tACTION");
        while (clock < 1000) {
            if (counter < numCustomers && clock >= timeOfArrival.get(counter)) {
                if (myRestaurant.assignTable(orders.get(counter))) {
                    arrived.set(counter, true);
                    System.out.println("[" + clock + "]\t" + customers.get(counter) + " got a table and PLACED ORDER");
                    System.out.println("[" + clock + "]\t" + "food Queue: \t" + myRestaurant.foodQueue);
                    System.out.println("[" + clock + "]\t" + "beverage Queue: " + myRestaurant.beverageQueue);
                } else {
                    System.out.println("[" + clock + "]\t" + customers.get(counter) + " LEFT due to NO VACANT table");
                }
                counter++;
            }
                
            MenuItem temp = new MenuItem(null, null, null);
            while (temp != null) {
                temp = myRestaurant.startPreparingFood(clock);
                if (temp != null) System.out.println("[" + clock + "]\t" + "cook PREPARING " + temp);
            }
            
            temp = new MenuItem(null, null, null);
            while (temp != null) {
                temp = myRestaurant.startPreparingBeverage(clock);
                if (temp != null) System.out.println("[" + clock + "]\t" + "bartender PREPARING " + temp);
            }

            for (int i=0; i<numCustomers; i++) {
                if (clock >= timeOfDeparture.get(i) && arrived.get(i) && !departed.get(i)) {
                    departed.set(i, true);
                    System.out.println("[" + clock + "]\t" + orders.get(i).customer.getName() + 
                        " LEFT table and PAID " + myRestaurant.freeTable(orders.get(i)));
                }
            }
            clock += 1;
        }

        System.out.println("\nTier Status:");
        for (int i=0; i<customers.size(); i++) {
            System.out.println(customers.get(i).getName() + "\t" + customers.get(i).getTierStatus());
        }

    }
}
