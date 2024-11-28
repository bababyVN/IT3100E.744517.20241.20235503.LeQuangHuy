import javax.swing.JOptionPane;
public class SolveEquation {
    public static void main(String[] args){
        String type = JOptionPane.showInputDialog(null, "linear, linear system, quadratic. "
        ,"Please choose the type of problem! ",JOptionPane.INFORMATION_MESSAGE);
        String result = "";
        switch (type) {
            
            case "linear":
                String stra = JOptionPane.showInputDialog(null,"Please input a: ","ax+b=0",JOptionPane.INFORMATION_MESSAGE);
                String strb = JOptionPane.showInputDialog(null,"Please input b: ","ax+b=0",JOptionPane.INFORMATION_MESSAGE);
                double a = Double.parseDouble(stra);
                double b = Double.parseDouble(strb);
                if (a == 0) {
                    if (b == 0) {
                        result += " Infinity many solutions! ";
                    } else {
                        result += " No solution! ";
                    }
                } else {
                    result += " The unique solution of x is: " + -b/a;
                }
                break;
            
            
            case "linear system":
                String stra11 = JOptionPane.showInputDialog(null,"Please input a11: ","a11x1+a12x2=b1, a21x1+a22x2=b2",JOptionPane.INFORMATION_MESSAGE);
                String stra12 = JOptionPane.showInputDialog(null,"Please input a12: ","a11x1+a12x2=b1, a21x1+a22x2=b2",JOptionPane.INFORMATION_MESSAGE);
                String strb1 = JOptionPane.showInputDialog(null,"Please input b1: ","a11x1+a12x2=b1, a21x1+a22x2=b2",JOptionPane.INFORMATION_MESSAGE);
                String stra21 = JOptionPane.showInputDialog(null,"Please input a21: ","a11x1+a12x2=b1, a21x1+a22x2=b2",JOptionPane.INFORMATION_MESSAGE);
                String stra22 = JOptionPane.showInputDialog(null,"Please input a22: ","a11x1+a12x2=b1, a21x1+a22x2=b2",JOptionPane.INFORMATION_MESSAGE);
                String strb2 = JOptionPane.showInputDialog(null,"Please input b2: ","a11x1+a12x2=b1, a21x1+a22x2=b2",JOptionPane.INFORMATION_MESSAGE);
                
                double a1 = Double.parseDouble(stra11);
                double b1 = Double.parseDouble(stra12);
                double c1 = Double.parseDouble(strb1);
                double a2 = Double.parseDouble(stra21);
                double b2 = Double.parseDouble(stra22);
                double c2 = Double.parseDouble(strb2);
                
                if (a1/a2 != b1/b2 ) {
                    result += " System has unique solution x1, x2: " + ((b1*c2)-(b2*c1))/((a1*b2)-(a2*b1))+ ", " + ((a2*c1)-(a1*c2))/((a1*b2)-(a2*b1)) ;
                } else {
                    if (a1/a2 != c1/c2) {
                        result += " System has no solution! ";
                    } else {
                        result += " System has infinity many solutions! ";
                    }
                }
                break;

            
            case "quadratic":
                String strA = JOptionPane.showInputDialog(null,"Please input a: ","ax^2+bx+c=0",JOptionPane.INFORMATION_MESSAGE);
                String strB = JOptionPane.showInputDialog(null,"Please input b: ","ax^2+bx+c=0",JOptionPane.INFORMATION_MESSAGE);
                String strC = JOptionPane.showInputDialog(null,"Please input c: ","ax^2+bx+c=0",JOptionPane.INFORMATION_MESSAGE);
                double A = Double.parseDouble(strA);
                double B = Double.parseDouble(strB);
                double C = Double.parseDouble(strC);
                double Delta = B*B - 4*A*C;
                
                if (A==0) {
                    result += " The unique solution of x is: " + -C/B;
                    break;
                }
                if (Delta < 0 ) {
                    result += " There is no solution of x ";
                    break;
                }
                if (Delta == 0) {
                    result += " The equation has double root x12 is: " + -B/(2*A);
                    break;
                }
                if (Delta > 0) {
                    result += " The equation has two unique root x1, x2: " + -B/(2*A) + "+ or -" + "(square root of " + Delta + " over " + 2*A +" )";
                }
                break;
            
            default:
                result += " Please check the problem type again! ";
                break;
        }
        JOptionPane.showMessageDialog(null,result,"Thanks for using!", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
