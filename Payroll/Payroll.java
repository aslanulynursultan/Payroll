public class Payroll {
    private final int[] employeeid = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};

    private final int[] hours = new int[employeeid.length];

    private final double[] payRate = new double[employeeid.length];

    private final double[] wages = new double[7];

    public void calculateWages() {

        for (int i = 0; i < employeeid.length; i++) {

            wages[i] = hours[i] * payRate[i];

        }

    }
    // employeeid

    public int [] getEmployeeid(){
        return employeeid;
    }
    public int getEmployeeId(int index) {
        return employeeid[index];
    }
    public void setEmployeeid(int index,int id){
        this.employeeid[index] = id;
    }

    // hours

    public int[] getHours() {
        return hours;
    }
    public int getHour(int index) {
        return hours[index];
    }
    public void setHours(int index, int hour){
        this.hours[index] = hour;
    }

    // payRate
    public double[] getPayRate() {
        return payRate;
    }
    public double getPayRate(int index) {
        return payRate[index];
    }
    public void setPayRate(int index, double payRate) {
        this.payRate[index] = payRate;
    }

    // wages
    public double[] getWages() {
        return wages;
    }
    public double getWages(int index){
        return wages[index];
    }
    public double getWage(int id){
        for (int i = 0; i < 7; i++){
            if (id == employeeid[i]){
                return wages[i];
            }
        }
        return -1;
    }
}
