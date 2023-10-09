import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static com.sun.tools.javac.util.Constants.format;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        JTextArea  myArea = new JTextArea(15,15);

        final  int STANDARD_WORK=40;
        String empId;
        String empName;
        double hoursWorked;
        double hourlyRate;
        double basicPay;
        double overTime = 0;
        double overTimeRate;
        double overTimePay = 0;
        double grossSalary;

        System.out.println("Enter  an Employee ID:");
        empId = keyboard.nextLine();

        System.out.println("Enter  an Employee name:");
        empName = keyboard.nextLine();

        System.out.println("Enter the no . of Hours Worked:");
        hoursWorked = keyboard.nextDouble();

        System.out.println("Enter the no . of Hours Rate:");
        hourlyRate = keyboard.nextDouble();

        if (hoursWorked<= STANDARD_WORK){
            basicPay= hoursWorked*hoursWorked;
            grossSalary=basicPay;
        }
        else {
            basicPay = STANDARD_WORK *hourlyRate;
            overTime = hoursWorked-STANDARD_WORK;
            overTimeRate = hourlyRate*1.5;
            overTimePay = overTimeRate*overTime;
            grossSalary=basicPay+overTimePay;

        }

     myArea.setEnabled(false);
        myArea.setFont(new Font("Tahoma",Font.BOLD,28));
     myArea.setText(
             String.format(String.format("/tABC COMPANY/N/T PAYSLIP/n/n=========" +
                     "/nempName:/t/t" + empId +
                     "/nEmpName:/t/t" + empName +
                     "/nHoursRate:/t/t" + hourlyRate +
                     "/nOverTime:/t/t" + overTime +
                     "OTRate:/t/t" + overTimePay +
                     "OTRate" + format(overTimePay)+
                     "OTPay"+format(overTimePay)+
                     "BaseicPay"+format(basicPay)+
                     "Gross Salary"+format(grossSalary))
             )
     );


     JOptionPane.showMessageDialog(null,myArea,"PaySlip",JOptionPane.PLAIN_MESSAGE);

    }
}