public class Car {
    private Long id;
    private String nomerAvto;

    public Car() {
    }

    public Car(Long id, String nomerAvto) {
        this.id = id;
        this.nomerAvto = nomerAvto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomerAvto() {
        return nomerAvto;
    }

    public void setNomerAvto(String nomerAvto) {
        this.nomerAvto = nomerAvto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", nomerAvto='" + nomerAvto + '\'' +
                '}';
    }
}
