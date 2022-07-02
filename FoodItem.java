
public class FoodItem{
    private double price;
    private String name;
    private int quant;

    public FoodItem(String n, double p, int q){
        name = n;
        price = p;
        quant = q;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuant(){
        return quant;
    }

    public void setPrice (double p){
        price = p;
    }

    public void setQuant (int q){
        if(q > 0){
            quant = q;
        }
        else{
            quant = 1;
        }
    }

    public String toString(){
        return name + " - $" + price + " x" + quant;
    }
}