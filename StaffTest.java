public class StaffTest {
    public static void main(String[] args) {
        StaffMember team[]=new StaffMember[4];
        team[0]=new Volunteer("Winnie Kade", "Juba", "0778065663");
        team[1]=new Hourly("Isaac Mogga", "Jinja", "0708750512", 10.55, 8);
        team[2]=new Executive("Wilson Nyumbe", "Mukono", "0774333466",  2423.07, 500.0);
        team[3]=new Hourly("Sarah Guwo", "New Delhi", "0704161364", 14.34, 5);

        //for(StaffMember member: team){
            //member.doWork();
        //}
        //for(StaffMember member: team)
        //{
            //member.dailypay();
       //} 
       for (StaffMember s : team) {
        if (s instanceof Volunteer) {
            Volunteer volunteer = (Volunteer) s;
            System.out.printf("%sSalary: %.2f\n\n", volunteer.toString(), volunteer.dailypay());   
        }
        else if (s instanceof Employee) {
            Employee employee = (Employee) s;
            System.out.printf("%sSalary: %.2f\n\n", employee.toString(), employee.dailypay());   
        }   
        }
    }
}
