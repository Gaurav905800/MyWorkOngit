import javax.swing.*;
public class NewInput {
    public static void main(String[] args){
        String name ;
        String newName;

        name = JOptionPane.showInputDialog("Enter the name");
        newName = JOptionPane.showInputDialog("Enter the newName");
        JOptionPane.showMessageDialog(null, name+" "+ newName);
    }
}
