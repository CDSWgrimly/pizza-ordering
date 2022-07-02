import java.util.Scanner;

public class Order {
    public static FoodItem addOrder(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Pick a category: \n 1.) Appetizers \n 2.) BYO Pizza \n 3.) Specialty Pizzas \n 4.) Drinks \nEnter a number for the category");
        int category = scan.nextInt();
        switch (category){
            case 1:
                System.out.println("APPETIZERS: \n 1.) Cheesy Breadsticks - $4.99 \n 2.) Garlic Knots - $5.99 \nEnter the appetizer number: ");
                int item = scan.nextInt();
                switch(item){
                    case 1:
                        System.out.println("Enter the quantity: ");
                        int quant = scan.nextInt();
                        return new Appetizer("Cheesy Breadsticks", 4.99, quant);
                    case 2:
                        System.out.println("Enter the quantity: ");
                        quant = scan.nextInt();
                        return new Appetizer("Garlic Knots", 5.99, quant);
                    default:
                        break;
                }
                
            case 2:
                
                System.out.println("Enter size: \n 1.) Small \n 2.) Medium \n 3.) Large");
                int size = scan.nextInt();
                String[] toppingsList = new String[3];
                System.out.println("Add toppings (Type '0' to end adding) \n 1.) Pepperoni \t5.) Olives \n 2.) Sausage \t6.) Canadian Bacon \n 3.) Hamburger \t 7.) Mushrooms \n 4.) Green Peppers \t8.) Red Peppers");
                for (int i = 0; i < 3; i++){
                    int addTop = scan.nextInt();
                    switch (addTop){
                        case 0:
                            i += 3;
                            break;
                        case 1:
                            toppingsList[i] = "Pepperoni";
                            break;
                        case 2:
                            toppingsList[i] = "Sausage";
                            break;
                        case 3:
                            toppingsList[i] = "Hamburger";
                            break;
                        case 4:
                            toppingsList[i] = "Green Peppers";
                            break;
                        case 5:
                            toppingsList[i] = "Olives";
                            break;
                        case 6:
                            toppingsList[i] = "Canadian Bacon";
                            break;
                        case 7:
                            toppingsList[i] = "Mushrooms";
                            break;
                        case 8:
                            toppingsList[i] = "Red Peppers";
                            break;
                        default:
                            i -= 1;
                            break;
                    }
                }
                System.out.println("Enter quantity:");
                int pizzaQuant = scan.nextInt();
                return new Pizza(pizzaQuant, size, toppingsList);
            case 3:
                System.out.println("Enter the size of the pizza: \n 1.) Small \n 2.) Medium \n 3.) Large");
                size = scan.nextInt();
                System.out.println("Enter number for the type of specialty pizza: \n 1.) Meat Lover's - $7.99 \n 2.) Supreme - $6.99 \n 3.) Taco Salad - $8.99 \n 4.) Connor's Favorite - $10.99");
                int name = scan.nextInt();
                System.out.println("Enter quantity");
                int quant = scan.nextInt();
                switch(name){
                    case 1:
                        return new Pizza("Meat Lover's", 7.99, size, quant);
                    case 2:
                        return new Pizza("Supreme", 6.99, size, quant);
                    case 3:
                        return new Pizza("Taco Salad", 8.99, size, quant);
                    case 4:
                        return new Pizza("Connor's Favorite", 10.99, size, quant);
                    default:
                        break;
                }
            case 4:
                System.out.println("Enter item (These are sold as 2 liter bottles - $2.14): \n 1.) Pepsi\t 2.) Mtn Dew \n 3.) Root Beer\t 4.) Dr. Pepper \n 5.) Coca-Cola\t 6.) Diet Coca-Cola \n 7.) Diet Pepsi\t 8.) Diet Mtn Dew");
                int choice = scan.nextInt();
                System.out.println("Enter quantity:");
                quant = scan.nextInt();
                switch (choice){
                    case 1:
                        return new Drink("Pepsi", quant);
                    case 2:
                        return new Drink("Mtn Dew", quant);
                    case 3:
                        return new Drink("Root Beer", quant);
                    case 4:
                        return new Drink("Dr. Pepper", quant);
                    case 5:
                        return new Drink("Coca-Cola", quant);
                    case 6:
                        return new Drink("Diet Coca-Cola", quant);
                    case 7:
                        return new Drink("Diet Pepsi", quant);
                    case 8:
                        return new Drink("Diet Mtn Dew", quant);
                    default:
                    break;
                }
            default:
                break;
      }
        return new FoodItem("", 0.0, 1);
    }
}
