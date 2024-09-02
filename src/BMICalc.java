import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalc {
    public static void main(String[] args){
        //calculate the user BMI
        //create jFrame object for frame design
        JFrame frame = new JFrame("BMI Calculator");

        //lable to display text message to user
        JLabel heightLable = new JLabel("Enter Your Height (M):");
        JLabel weightLable = new JLabel("Enter Your Weight (Kg): ");
        JTextField heightField = new JTextField();
        JTextField weightField = new JTextField();
        JButton BMIButton = new JButton("Calulate BMI");
        JLabel resultLable = new JLabel();

        //to set the size and position of UI component in frame
        heightLable.setBounds(30,30,150,40);
        heightField.setBounds(180,30,50,40);
        weightLable.setBounds(30,70,150,40);
        weightField.setBounds(180,70,50,40);
        BMIButton.setBounds(80,120,120,40);
        resultLable.setBounds(30,170,230,40);



        //to attach the UI component to frame
        frame.add(heightLable);
        frame.add(heightField);
        frame.add(weightField);
        frame.add(weightLable);
        frame.add(BMIButton);
        frame.add(resultLable);



        //to set layout null
        frame.setLayout(null);
        //to add the size in frame
        frame.setSize(300,250);
        // to visible the frame
        frame.setVisible(true);

        //to click on the calculate BMI calculator
        BMIButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                float height = Float.parseFloat(heightField.getText());
                float weight = Float.parseFloat(weightField.getText());

                float result = weight / (height * height);
                //18.5
                if (result < 18.5) {
                    resultLable.setText("Is Under weight");
                    resultLable.setBackground(Color.BLUE);
                    resultLable.setForeground(Color.BLUE);
                }
                else if (result > 18.5 && result < 24.9) {
                    resultLable.setText("Is Normal");
                    resultLable.setBackground(Color.GREEN);
                    resultLable.setForeground(Color.GREEN);
                }
                else if (result > 24.9 && result < 29.9) {
                    resultLable.setText("Over weight");
                    resultLable.setBackground(Color.RED);
                    resultLable.setForeground(Color.RED);
                }
                else {
                    resultLable.setText("Obesity");
                    resultLable.setBackground(Color.MAGENTA);
                    resultLable.setForeground(Color.MAGENTA);
                }


            }
        });
    }


}