import java.util.ArrayList;
import java.util.Scanner;

public class Options {
    
    private boolean stillOrdering = true;
    private ArrayList <FoodItem> arr = new ArrayList<FoodItem>();

    public Options (ArrayList<FoodItem> list){
        arr = list;
    }

    public void orderingOptions(){
        Scanner scan = new Scanner(System.in);
        boolean isCopy = false;
      System.out.println("\nWhat option would you like to do? \n 1.) Add an item to the order \n 2.) Delete an item from the order \n 3.) Check current order\n 4.) See the menu \n 5.) Finished ordering and ready to checkout");
      int option = scan.nextInt();
      switch (option){
        case 1:
          FoodItem itemToAdd = Order.addOrder();
          for (FoodItem i: arr){
            if (itemToAdd.toString().equals(i.toString())){
              i.setQuant(i.getQuant() + itemToAdd.getQuant());
              isCopy = true;
            }
          }
          if (!isCopy){
            arr.add(itemToAdd);
          }
          break;
        case 2:
        for (int i = 0; i < arr.size(); i++){
          System.out.println(" " + (i+1) + ".) " + arr.get(i));
        }
          System.out.println("Enter a number to remove the item ");
          int index = scan.nextInt() - 1;
          System.out.println("Enter quanity to remove");
          int quantToRemove = scan.nextInt();
          if(quantToRemove >= arr.get(index).getQuant()){
            arr.remove(index);
          }
          else{
            arr.get(index).setQuant(arr.get(index).getQuant() - quantToRemove);
          }
          break;
        case 3:
          if (arr.size() == 0){
            System.out.println("You currently have no items in your order");
          }
          else{
            for (int i = 0; i < arr.size(); i++){
              System.out.println(" " + (i+1) + ".) " + arr.get(i));
            }
          break;
          }
          case 4:
          System.out.println("\n\n-----------------------------------------------------------");
          System.out.println("|             * Menu *                                     |");
          System.out.println("|Appetizers                                                |");
          System.out.println("|----------                                                |");
          System.out.println("|Cheesy Breadsticks - $4.99                                |");
          System.out.println("|Garlic Knots - $5.99                                      |");
          System.out.println("|                                                          |");
          System.out.println("|BYO Pizza                                                 |");
          System.out.println("|---------                                                 |");
          System.out.println("|Step 1: Choose a size                                     |");
          System.out.println("|Small - $5.00                                             |");
          System.out.println("|Medium - $6.50                                            |");
          System.out.println("|Large - $7.50                                             |");
          System.out.println("|                                                          |");
          System.out.println("|Step 2: Choose toppings (50 cents each, max 3)            |");
          System.out.println("| - Pepperoni   - Olives                                   |");
          System.out.println("| - Sausage     - Canadian Bacon                           |");
          System.out.println("| - Hamburger   - Mushrooms                                |");
          System.out.println("| - Green Peppers   - Red Peppers                          |");
          System.out.println("|                                                          |");
          System.out.println("|Specialty Pizzas                                          |");
          System.out.println("|----------------                                          |");
          System.out.println("|Sizes                                                     |");
          System.out.println("|Small - Base Price                                        |");
          System.out.println("|Medium - + $1.00                                          |");
          System.out.println("|Large - + $1.50                                           |");
          System.out.println("|                                                          |");
          System.out.println("|Pizzas                                                    |");
          System.out.println("|Meat Lover's - $7.99                                      |");
          System.out.println("|Supreme - $6.99                                           |");
          System.out.println("|Taco Salad - $8.99                                        |");
          System.out.println("|Connor's Favorite - $10.99                                |");
          System.out.println("|                                                          |");
          System.out.println("|Drinks                                                    |");
          System.out.println("|------                                                    |");
          System.out.println("|All drinks come as 2 liter bottles - $2.14 each           |");
          System.out.println("| - Pepsi   - Mtn Dew                                      |");
          System.out.println("| - Root Beer   - Dr. Pepper                               |");
          System.out.println("| - Coca-Cola   - Diet Coca-Cola                           |");
          System.out.println("| - Diet Pepsi  - Diet Mtn Dew                             |");
          System.out.println("------------------------------------------------------------\n\n");
          break;
          case 5:
          stopOrdering();
          break;
        default:
          break;
      }
    }

    public boolean StillOrdering(){
        return stillOrdering;
    }

    public void stopOrdering(){
        if (stillOrdering){
            stillOrdering = false;
        }
        else{
            stillOrdering = true;
        }
    }
}