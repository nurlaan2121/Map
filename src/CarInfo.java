public class CarInfo {
    private Integer godvypuska;
    private String model;
    private double price;
    private String color;

    public CarInfo() {
    }

    public CarInfo(Integer godvypuska, String model, double price, String color) {
        this.godvypuska = godvypuska;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public Integer getGodvypuska() {
        return godvypuska;
    }

    public void setGodvypuska(Integer godvypuska) {
        this.godvypuska = godvypuska;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "godvypuska=" + godvypuska +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
