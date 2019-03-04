import javax.swing.JOptionPane;
public class Main
{
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("hello to all");
        String message =String.format("welcome ,%s,friends",name);
        String name2 = JOptionPane.showInputDialog("enter your name");
        String message2 =String.format("%s",name);
        String message3 =JOptionPane.showInputDialog("thank you",message);
    }
}
