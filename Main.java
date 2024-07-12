import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]){
        JFrame f=new JFrame();
        f.setTitle("Snake Game");
        f.setBounds(10,10,905,700);
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        f.setBackground(Color.BLACK );

        Gameplay gameplay =new Gameplay() ;
        f.add(gameplay);
        }
    }
