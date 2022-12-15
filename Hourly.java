public class Hourly extends Employee{
    private int hours;

    public Hourly(String name, String address, String contact, double Rate, int hours) {
        super(name, address, contact, Rate);
        this.hours = hours;
    }

    public double dailypay() {
        double payment = Rate * hours;  
        return payment; 
    }

    public String toString() { 
        String result = super.toString(); 
        result += "Hours worked: " + hours + "\n"; 
        return result; 
 }



}
