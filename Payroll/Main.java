import java.util.Scanner;

public class Main {

    static Payroll payroll = new Payroll();
    static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args){
        start();
    }
    public static void start(){
        System.out.print("""
                1.Add Employee.
                2.View Employee.
                3.Finish.
                Your choice:\s""");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> addEmployee();
            case 2 -> viewEmployee();
            case 3 -> System.exit(0);
            default -> {
            }
        }

        System.out.println();
        viewEmployee();
    }
   public  static  void addEmployee(){
        System.out.println();

        int[] ids = payroll.getEmployeeid();

        for (int i= 0; i<7; i++){
            System.out.print("Enter employee "+ (ids[i]) + " worked hours: ");
            int hours = scanner.nextInt();

            while (hours < 0){
                System.out.print("Error: hours cannot be a negative number: ");
                hours = scanner.nextInt();
            }
            payroll.setHours(i, hours);

            System.out.println("\nEnter pay rate $ ");
            double payrate = scanner.nextDouble();

            while (payrate < 6.00){
                System.out.print("Error: pay rate cannot be less than $6: ");
                payrate = scanner.nextDouble();
            }

            payroll.setPayRate(i, payrate);
        }
        System.out.println();

        payroll.calculateWages();
   }
public static void viewEmployee(){
        System.out.println();

        System.out.println("Employee Data\n");
        for (int i= 0; i < 7; i++){
            System.out.println("Employee ID " + payroll.getEmployeeId(i)
            + "\nHours: " + payroll.getHour(i)
            + "\nPay rate: $" + payroll.getPayRate(i)
            + "\nGross wage: $" + payroll.getWages(i)
            + "\n");
        }
}
}
