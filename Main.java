import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<FoodItem> orderList= new ArrayList<FoodItem>();
    Options options = new Options(orderList);

    boolean stillOrdering = true;
    String name = "";
    String street1 = "";
    String street2 = "";
    String city = "";
    String state = "";
    String zipCode = "";
    String phoneNumber = "";

    System.out.println("Please enter name for the order: ");
    name = scan.nextLine();
    System.out.println("Will this be for \'delivery\' or for \'pickup\'?");
    String deliveryMethod = scan.nextLine().toLowerCase();

    if (deliveryMethod.equals("delivery")){
      System.out.println("What is the delivery address 1?");
      street1 = scan.nextLine();
      System.out.println("What is address 2? ");
      street2 = scan.nextLine();
      System.out.println("City?");
      city = scan.nextLine();
      System.out.println("State?");
      state = scan.nextLine();
      System.out.println("Zip Code?");
      zipCode = scan.nextLine();
    }

    System.out.println("What is the phone number for the order?");
    phoneNumber = scan.nextLine();

    while (stillOrdering){
      double total = 0.0;

      while (options.StillOrdering()){
        options.orderingOptions();  
      }
      System.out.println("\n\nPlease confirm your order");
      for (int i = 0; i < orderList.size(); i++){
        System.out.println(" " + (i+1) + ".) " + orderList.get(i));
      }
      System.out.println("Order Details:");
      if (deliveryMethod.equals("delivery")){
        System.out.println("\nName: " + name);
        System.out.println("Address 1: " + street1);
        System.out.println("Address 2: " + street2);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip Code: " + zipCode);
      }
      else{
        System.out.println("\nName: " + name);
      }
      System.out.println("Phone Number: " + phoneNumber);
      for (int i = 0; i < orderList.size(); i++){
        total += orderList.get(i).getPrice() * orderList.get(i).getQuant();
      }
      System.out.println("\n Total Amount: $" + total);

      System.out.println("\nEnter 'y' for yes or 'n' for no");
      String confirmation = scan.nextLine();
      if(confirmation.equals("y")){
        stillOrdering = false;
      }
      else{
        options.stopOrdering();
      }
    }
    if (deliveryMethod.equals("delivery")){
      System.out.println("Your order will be ready in 45 minutes. Please pay the driver");
    }
    else{
      System.out.println("Your order will be ready in 15 minutes. Please pay at the counter");
    }
  }
}