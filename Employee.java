public abstract class Employee extends StaffMember{
    protected double Rate;

    public Employee(String name, String address, String contact, double Rate) {
        super (name, address, contact);
        this.Rate = Rate;
    }

    public double dailypay() {
        return Rate;
    }



}
