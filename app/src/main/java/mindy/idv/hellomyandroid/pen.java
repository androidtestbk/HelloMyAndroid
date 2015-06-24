package mindy.idv.hellomyandroid;

/**
 * Created by 201 on 2015/6/24.
 */
public class pen {
    private String name;
    private int price;

    public pen() {
        price = 0;
    }

    public pen(String name, int price) {
        this.name = name;
        this.price = 0;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
