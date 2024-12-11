import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxProject {
    public static void main(String[] args) {
        JFrame frame=new JFrame("CheckBox");

        JCheckBox che1=new JCheckBox("Yes");
        JCheckBox che2=new JCheckBox("No");
        che1.setBounds(150,100,250,50);
        che2.setBounds(150,150,250,50);

        JButton btn =new JButton("Control");
        btn.setBounds(150,200,100,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(che1.isSelected()){
                    System.out.println(che1.getText() + " is selected!");
                }
                if (che2.isSelected()) {
                    System.out.println(che2.getText() + " is selected!");
                }
                if(!che1.isSelected() && !che2.isSelected()){
                    System.out.println("None was selected!");
                }
            }
        });
        frame.add(che1);
        frame.add(che2);
        frame.add(btn);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
