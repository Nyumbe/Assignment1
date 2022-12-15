public class Volunteer extends StaffMember{

    public Volunteer (String name, String address, String contact){
      super (name, address, contact);
   }
    public int vocation() {
        return 0;
    }

    public double dailypay() {
        //System.out.println("Volunteer will charge :$0.0");
        return 0.0;
    }
}
