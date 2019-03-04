import javax.swing.JOptionPane;
public class Main
{
    public static void main(String[] args){
        String message =String.format("%s",name);
        String name = JOptionPane.showInputDialog("enter your name");
        String message =String.format("%s",name);
        String message2 =JOptionPane.showInputDialog("thank you",message);
    }
}
