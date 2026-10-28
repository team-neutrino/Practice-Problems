package IntermediateProblems.A_Classes;

public class CarAnswer {
    private String m_model;
    private int m_year;
    private double m_price;

    public CarAnswer(String p_model, int p_year, double p_price) {
        m_model = p_model;
        m_year = p_year;
        m_price = p_price;
    }

    public String getModel() {
        return m_model;
    }

    public int getYear() {
        return m_year;
    }

    public double getPrice() {
        return m_price;
    }

    public void discountedPrice(double discount) {
        Math.round(m_price -= m_price * discount);
    }

    public static void main(String[] args) {
        CarAnswer m_Car = new CarAnswer("Toyota", 2010, 2050.99);
        System.out.println("Model: " + m_Car.getModel());
        System.out.println("Year: " + m_Car.getYear());
        System.out.println("Price: " + m_Car.getPrice());

        m_Car.discountedPrice(0.1);
        System.out.println("Price: " + m_Car.getPrice());
    }
}
