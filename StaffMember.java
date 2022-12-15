public abstract class StaffMember {
    private String name;
    private String address;
    private String contact;

    public StaffMember(String name, String address, String contact) {
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    //public abstract int vocation();

    public abstract double dailypay();
    
    public String toString(){
      String result = "Name: " + name + "\n";

      result += "Address: " + address + "\n";
      result += "Phone: " + contact + "\n";

      return result;
    }
}
