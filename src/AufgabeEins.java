import javax.swing.JOptionPane;
public class AufgabeEins
{
    public static void main(String[] args)
    {

        String name = JOptionPane.showInputDialog("geben sie bitte ihren Namen ein");

        int alter = Integer.parseInt(JOptionPane.showInputDialog("geben sie bitte ihren Alter ein"));
        JOptionPane.showMessageDialog(null,name +" ist alt genug: " + (alter>18));

    }
}
