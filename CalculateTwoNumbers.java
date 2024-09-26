import javax.swing.JOptionPane;
public class CalculateTwoNumbers {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "You've just asked: ";
        double result = 0;

        strNum1 = JOptionPane.showInputDialog(null,
        "Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,
        "Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
        
        String operator = JOptionPane.showInputDialog(null, "Please input the operator: "
        ,"sum, difference, product or quotient. ",JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        switch (operator) {
            case "sum":
                result = num1 + num2;        
                break;
            case "difference":
                result = num1 - num2;
                break;
            case "product":
                result = num1 * num2;
                break;
            case "quotient":
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(null, "The divisor can not be zero! ", "Error", 0);
                    System.exit(0);
                }
                result = num1 / num2;
                break;     
            default:
                JOptionPane.showMessageDialog(null, "Can not identify operator! ", "Error", 0);
                System.exit(0);
                break;
        }
        strNotification += strNum1 + " " + operator + " " + strNum2 + " !";
        JOptionPane.showMessageDialog(null, strNotification, "Thanks for entered your question! ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "The result of the calculation is "+ result + " ! ", "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}