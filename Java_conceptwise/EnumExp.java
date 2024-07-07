

enum Laptop{
    Mac(2000),Surface(1600),Inspiron(1100),Notebook(800);
    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumExp {
    public static void main(String[] args) {
        Laptop[] t=Laptop.values();
        System.out.println(t[2]);
        for(Laptop x: t){
            System.out.println(x+" "+x.getPrice());
        }
    }
    
}
