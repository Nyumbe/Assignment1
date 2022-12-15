public abstract class Shape {
    private double val1;
    private double val2;
    private double val3;

    public Shape (double val1)  {
        this.val1 = val1;
    }
    
    public Shape (double val1, double val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public Shape (double val1, double val2, double val3){
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    public void setval1(double val1)  {
        this.val1 = val1;
    }

    public double getval1()   {
        return val1;
    }

    public void setval2(double val2) {
        this.val2 = val2;
    }

    public double getval2()   {
        return val2;
    }

    public void setval3(double val3) {
        this.val3 = val3;
    }

    public double getval3() {
        return val3;
    }

    public abstract double getArea();

    public String toString(){
        return String.format("%s\n", getClass().getName());
    }
}
