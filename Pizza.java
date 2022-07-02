public class Pizza extends FoodItem {
    private String size;
    private String[] toppingsList = new String[3];

    //Used for Build Your Own pizzas
    public Pizza(int q, int s, String[] toppings){

        super ("BYO Pizza", 5.0, q);
        switch(s){
            case 2:
                this.setPrice(5.0 + 1.5);
                size = "Medium";
                break;
            case 3:
                this.setPrice(5.0 + 2.5);
                size = "Large";
                break;
            default:
                size = "Small";
                break;
        }
        for (int i = 0; i < toppings.length; i++){
            if (toppings[i] != null){
                this.setPrice(getPrice() + .5);
            }
        }
        toppingsList = toppings;
    }

    //Used for Specialty pizzas
    public Pizza (String n, double p, int s, int q){
        super(n, p, q);
        switch (s){
            case 2:
            size = "Medium";
            this.setPrice(this.getPrice() + 1.50);
            break;
            case 3:
            size = "Large";
            this.setPrice(this.getPrice() + 2.50);
            break;
            default:
            size = "Small";
            break;
        }
    }

    public String toString(){
        String str = "";
        str += getName() + " (" + size + ") - $" + getPrice() + " x" + getQuant();
         for (int i = 0; i < toppingsList.length; i++){
            if(toppingsList[i] != null){
                str += "\n\t+ " + toppingsList[i];
            }
         } 
        return str;
    }
}
