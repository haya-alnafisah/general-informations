/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import static project.Project.button;



public class Project {
    
static JFrame frame = new JFrame("GUI APPLICATION");
static JLabel label2= new JLabel("General Information's");
static JLabel label3= new JLabel("Name♥");
static JTextField textField = new JTextField();
static JLabel label4= new JLabel("ID (•ᴥ•)");
static JTextField textField2 = new JTextField();
static JLabel label5= new JLabel ("program");
static JLabel label6 = new JLabel("Level");
static JLabel labelResult1 = new JLabel();
static JCheckBox checkbox2 = new JCheckBox("First",true);
static JCheckBox checkbox3 = new JCheckBox("Second");
static JLabel label = new JLabel();
//static JRadioButton radioButton_1 = new JRadioButton("SXE", true);
static JLabel label1 = new JLabel("sex");
static JRadioButton radioButton_2 = new JRadioButton("MALE",true);
static JRadioButton radioButton_3 = new JRadioButton("FEMALE");
static JLabel labelResult = new JLabel();
static JLabel labelResult2 = new JLabel();
static JLabel labelResult3 = new JLabel();
static JLabel labelResult4 = new JLabel();
static JButton button = new JButton("SAVE");
static JButton button2 = new JButton("CANCEL");

static Font newFont =new Font("Times New Roman", Font.BOLD , 16);



    public static void main(String[] args) {
        ButtonGroup group = new ButtonGroup();
//group.add(radioButton_1);
group.add(radioButton_2);
group.add(radioButton_3);

String[] items={"","diploma","bachelor"};
        JComboBox combobox=new JComboBox(items);

        
label2.setFont(newFont);
        label2.setForeground(Color.DARK_GRAY);  
        
label3.setFont(newFont);
        label3.setForeground(Color.blue); 
        
label4.setFont(newFont);
        label4.setForeground(Color.blue);
        
label5.setFont(newFont);
        label5.setForeground(Color.blue);
        
label6.setFont(newFont);
        label6.setForeground(Color.blue);

label1.setFont(newFont);
        label1.setForeground(Color.blue);        
   
        
label2.setBounds(200 , -80 , 300, 200);
label3.setBounds(40, 40, 100, 30);
textField.setBounds(100, 40, 200, 35);
label4.setBounds(40, 80, 100, 30);
textField2.setBounds(100, 80, 200, 35);
label5.setBounds(40, 120, 100, 30);
combobox.setBounds(100, 120, 200, 35);
label6.setBounds(100, 200, 200, 35);
labelResult1.setBounds(350, 200, 180, 35);
checkbox2.setBounds(150, 200, 80, 35);
checkbox3.setBounds(250, 200, 80, 35);
labelResult2.setBounds(350, 40, 180, 35);
labelResult3.setBounds(350, 80, 180, 35);
labelResult4.setBounds(350, 120, 180, 35);
label.setBounds(40, 10, 150, 30);
//radioButton_1.setBounds(40, 40, 100, 30);
label1.setBounds(100, 160, 200, 35);
radioButton_2.setBounds(150, 160, 80, 35);
radioButton_3.setBounds(250, 160, 100, 35);
button.setBounds(150, 300, 170, 35);
button2.setBounds(350, 300, 170, 35);
labelResult.setBounds(350, 160, 180, 35);


 

frame.add(label);
frame.add(label2);
frame.add(label3);
frame.add(textField);
frame.add(label4);
frame.add(textField2);
frame.add(combobox);
frame.add(label5);
frame.add(label6);
frame.add(labelResult1);
frame.add(checkbox2);
frame.add(checkbox3);
//frame.add(radioButton_1);
frame.add(label1);
frame.add(radioButton_2);
frame.add(radioButton_3);
frame.add(button);
frame.add(button2);
frame.add(labelResult);
frame.add(labelResult2);
frame.add(labelResult3);
frame.add(labelResult4);


frame.setSize(600, 500);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);
frame.setVisible(true);

ActionListener action_1= new ActionListener() {
@Override
public void actionPerformed(ActionEvent e)
{
if(radioButton_2.isSelected())
labelResult.setText("Your sex is: "+radioButton_2.getText());
    
else if(radioButton_3.isSelected())
labelResult.setText("Your sex is: "+radioButton_3.getText());
//else if(radioButton_3.isSelected())
//labelResult.setText("You language is: "+radioButton_3.getText());
}
};




    ActionListener action_2= new ActionListener() {
@Override
public void actionPerformed(ActionEvent e)
{
if(checkbox2.isSelected())
labelResult1.setText("Your level is: "+checkbox2.getText());
    
else if(checkbox3.isSelected())
labelResult1.setText("Your level is: "+checkbox3.getText());
//else if(radioButton_3.isSelected())
//labelResult.setText("You language is: "+radioButton_3.getText());
}
};
    
    
    ActionListener action_3= new ActionListener() {
@Override
public void actionPerformed(ActionEvent e)
{
   String input =textField.getText();
    
  
        labelResult2.setText("Your name is: "+textField.getText());
    
      //  JOptionPane.showMessageDialog(null, "This is an error message", "Error Message", JOptionPane.ERROR_MESSAGE); 
    
}

//labelResult.setText("Your sex is: "+radioButton_3.getText());
//labelResult2.setText("Your name is: "+textField.getText());
    



};
    
 ActionListener action_4= new ActionListener() {
@Override
public void actionPerformed(ActionEvent e)
{

labelResult3.setText("Your Id is: "+textField2.getText());
    


}
};
 
ActionListener action_5= new ActionListener() {
@Override
public void actionPerformed(ActionEvent e)
{

labelResult4.setText("Your program is: "+combobox.getSelectedItem());
    


}
};

ActionListener action_6= new ActionListener() {
@Override
public void actionPerformed(ActionEvent e)
{

JOptionPane.showConfirmDialog(null,
                            "You are going to delete you history.\nAre you sure?",
                            "Delete History", 
                            JOptionPane.YES_NO_CANCEL_OPTION, 
                            JOptionPane.WARNING_MESSAGE);

    


}
};

ActionListener action_7= new ActionListener() {
@Override
public void actionPerformed(ActionEvent e)
{
    
    
    if (textField.getText().equals("")) {
       JOptionPane.showMessageDialog(null, "You should write your name","Error Message",JOptionPane.ERROR_MESSAGE);
            
      }
    
    if (textField.getText().matches("[\\+-]?\\d+")) {
       JOptionPane.showMessageDialog(null, "You should write your name Correctly","Error Message",JOptionPane.ERROR_MESSAGE);
            
      }
    
    else if (textField2.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "You should write your ID ","Error Message",JOptionPane.ERROR_MESSAGE);  
        
      }
    
    else if(textField2.getText().matches("\\d+") ){
          
      }

    else {
  JOptionPane.showMessageDialog(null, "You should write your ID Correctly ","Error Message",JOptionPane.ERROR_MESSAGE); 
      }
    
    
    
}
};


button.addActionListener(action_1);   
button.addActionListener(action_2);
button.addActionListener(action_3);
button.addActionListener(action_4);
button.addActionListener(action_5);
button2.addActionListener(action_6);
button.addActionListener(action_7);
}
}


   
