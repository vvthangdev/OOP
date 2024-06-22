package hi;

import javax.swing.*;

public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Hay nhap gi do");
        JOptionPane.showMessageDialog(null,"Xin chao " + result + "!");
        System.exit(0);
    }
}