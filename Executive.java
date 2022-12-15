public class Executive extends Employee{
    private double bonus;

    public Executive(String name, String address, String contact, double Rate, double bonus) {
        super(name, address, contact, Rate);
        this.bonus = bonus; 
    }
    
    public double dailypay() {
        double payment = super.dailypay() + bonus; 
        return payment; 
    }

}
