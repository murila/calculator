/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author MURILA MUSILIVI LEAH
 */
public class Calculate extends JFrame implements ActionListener{
    

       JFrame frame = new JFrame(); 
        JPanel panel = new JPanel();
        JTextArea textarea = new JTextArea(2,10);
        
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JButton button6 = new JButton();
        JButton button7 = new JButton();
        JButton button8 = new JButton();
        JButton button9 = new JButton();
        JButton button0 = new JButton();
        JButton buttonadd = new JButton();
        JButton buttonsub = new JButton();
        JButton buttonmul = new JButton();
        JButton buttondiv = new JButton();
        JButton buttonclear = new JButton();
        JButton buttondot = new JButton();
        JButton buttonequal = new JButton();
        JButton buttonreset = new JButton();
        
        
    double number1, number2, result;
    int addc=0, mulc=0, divc=0, subc= 0;
    
    
    
    public  Calculate()
    {
//        JFrame myframe = new JFrame();
        
       
         frame.setSize(340,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
        frame.setTitle("My Calculator");
        
        panel.setBackground(Color.LIGHT_GRAY);
            javax.swing.border.Border border = BorderFactory.createLineBorder(Color.RED,4);
        panel.setBorder(border);
        panel.add(textarea);
        textarea.setBackground(Color.BLACK);
        javax.swing.border.Border tborder = BorderFactory.createLineBorder(Color.WHITE,3);
        textarea.setBorder(tborder);
        Font font = new Font("arial",Font.BOLD,33);
        textarea.setFont(font);
        textarea.setForeground(Color.WHITE);
        textarea.setPreferredSize(new Dimension(2,10));
        textarea.setLineWrap(true);
        
        button1.setPreferredSize(new Dimension(100,43));
        button1.setText("1");
//        button1.setIcon(new ImageIcon("C:\\Users\\MURILA LEAH\\Desktop\\buttons\\1.png"));
        
        button2.setPreferredSize(new Dimension(100,43));
        button2.setText("2");
//        button2.setIcon(new ImageIcon("C:\\Users\\MURILA LEAH\\Desktop\\buttons\\2.png"));
        
        button3.setPreferredSize(new Dimension(100,43));
        button3.setText("3");
//        button3.setIcon(new ImageIcon("C:\\Users\\MURILA LEAH\\Desktop\\buttons\\3.png"));
        
        button4.setPreferredSize(new Dimension(100,43));
        button4.setText("4");
 //       button4.setIcon(new ImageIcon("C:\\Users\\MURILA LEAH\\Desktop\\buttons\\4.png"));
        
        button5.setPreferredSize(new Dimension(100,43));
        button5.setText("5");
//        button5.setIcon(new ImageIcon("C:\\Users\\MURILA LEAH\\Desktop\\buttons\\5.png"));
        
        button6.setPreferredSize(new Dimension(100,43));
        button6.setText("6");
 //       button6.setIcon(new ImageIcon("C:\\Users\\MURILA LEAH\\Desktop\\buttons\\6.png"));
        
        button7.setPreferredSize(new Dimension(100,43));
        button7.setText("7");
 //       button7.setIcon(new ImageIcon("C:\\Users\\MURILA LEAH\\Desktop\\buttons\\7.png"));
        
        button8.setPreferredSize(new Dimension(100,43));
        button8.setText("8");
 //       button8.setIcon(new ImageIcon("C:\\Users\\MURILA LEAH\\Desktop\\buttons\\8.png"));
        
        button9.setPreferredSize(new Dimension(100,43));
        button9.setText("9");
   //     button9.setIcon(new ImageIcon("C:\\Users\\MURILA LEAH\\Desktop\\buttons\\9.png"));
        
        button0.setPreferredSize(new Dimension(100,43));
        button0.setText("0");
   //     button0.setIcon(new ImageIcon("C:\\Users\\MURILA LEAH\\Desktop\\buttons\\0.png"));
        
        buttonadd.setPreferredSize(new Dimension(100,43));
        buttonadd.setText("+");
  //      buttonadd.setIcon(new ImageIcon("C:\\Users\\MURILA LEAH\\Desktop\\buttons\\add.png"));
        
        buttonsub.setPreferredSize(new Dimension(100,43));
        buttonsub.setText("-");
  //      buttonsub.setIcon(new ImageIcon("C:\\Users\\MURILA LEAH\\Desktop\\buttons\\sub.png"));
        
        buttonmul.setPreferredSize(new Dimension(100,43));
        buttonmul.setText("X");
 //       buttonmul.setIcon(new ImageIcon("C:\\Users\\MURILA LEAH\\Desktop\\buttons\\mul.png"));
        
        buttondiv.setPreferredSize(new Dimension(100,43));
        buttondiv.setText("/");
 //       buttondiv.setIcon(new ImageIcon("C:\\Users\\MURILA LEAH\\Desktop\\buttons\\div.png"));
        
        buttondot.setPreferredSize(new Dimension(100,43));
        buttondot.setText(".");
 //       buttondot.setIcon(new ImageIcon("C:\\Users\\MURILA LEAH\\Desktop\\buttons\\dot.png"));
        
        buttonclear.setPreferredSize(new Dimension(100,43));
        buttonclear.setText("Clear");
 //       buttonclear.setIcon(new ImageIcon("C:\\Users\\MURILA LEAH\\Desktop\\buttons\\clear.png"));
        
        buttonequal.setPreferredSize(new Dimension(100,43));
        buttonequal.setText("=");
 //       buttonequal.setIcon(new ImageIcon("C:\\Users\\MURILA LEAH\\Desktop\\buttons\\equal.png"));
        buttonreset.setPreferredSize(new Dimension(100,43));
        buttonreset.setText("Reset");
        
        
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
        panel.add(buttonadd);
        panel.add(buttonsub);
        panel.add(buttonmul);
        panel.add(buttondiv);
        panel.add(buttondot);
        panel.add(buttonequal);
        panel.add(buttonclear);
        panel.add(buttonreset);
                
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
         button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
         button9.addActionListener(this);
        button0.addActionListener(this);
        buttonadd.addActionListener(this);
        buttonsub.addActionListener(this);
         buttonmul.addActionListener(this);
        buttondiv.addActionListener(this);
        buttondot.addActionListener(this);
        buttonclear.addActionListener(this);
         buttonequal.addActionListener(this);
         buttonreset.addActionListener(this);
        
    }

  @Override 
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source == button1){
            textarea.append("1");
        }
        if (source == button2){
            textarea.append("2");
        }
         if (source == button3){
            textarea.append("3");
        }
        if (source == button4){
            textarea.append("4");
        }
         if (source == button5){
            textarea.append("5");
        }
        if (source == button6){
            textarea.append("6");
        }
         if (source == button7){
            textarea.append("7");
        }
        if (source == button8){
            textarea.append("8");
        }
         if (source == button9){
            textarea.append("9");
        }
        if (source == button0){
            textarea.append("0");
        }
        if (source == buttonclear){
            textarea.setText("");
        }
//         if (source == buttonadd){
//            textarea.append("+");
//        }
//        if (source == buttonsub){
//            textarea.append("-");
//        }
//         if (source == buttonmul){
//            textarea.append("X");
//        }
//        if (source == buttondiv){
//            textarea.append("/");
//        }
        if (source == buttonadd){
            number1 = number_reader();
            textarea.setText("");
            addc = 1;
            divc =0;
            mulc = 0;
            subc = 0;
            
        }
        if (source == buttonsub){
            number1 = number_reader();
            textarea.setText("");
            addc = 0;
            divc =0;
            mulc = 0;
            subc = 1;
            
        }
        if (source == buttonmul){
            number1 = number_reader();
            textarea.setText("");
            addc = 0;
            divc =0;
            mulc = 1;
            subc = 0;
            
        }
        if (source == buttondiv){
            number1 = number_reader();
            textarea.setText("");
            addc = 0;
            divc =1;
            mulc = 0;
            subc = 0;
            
        }
        if (source == buttonreset){
        textarea.setText("");
        result=0;
        number1=0;
        number2=0;
        
        }
//        if (source == buttondot){
//            int firstnum = 0;
//            int secondnum =0;
//    
//            textarea.setText(firstnum+"."+secondnum);
//        
//        }
          
        if (source == buttonequal){
            number2 = number_reader();
            if(addc>0){
                
                result =  number1+ number2;
                textarea.setText(Double.toString(result));
            }
            if(subc>0){
                
                result =  number1- number2;
                textarea.setText(Double.toString(result));
            }
            if(mulc>0){
                
                result =  number1* number2;
                textarea.setText(Double.toString(result));
            }
            if(divc>0){
                
                result =  number1/ number2;
                textarea.setText(Double.toString(result));
            }
           
        }
    }public double number_reader(){
            double num1;
            String s;
            s=textarea.getText();
            num1= Double.valueOf(s);
            return num1;
        }
        //throw new UnsupportedOpe rationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
     
    public static void main(String[]args){
        EventQueue.invokeLater(new  Runnable() {

            @Override
            public void run() {
                Calculate myframe = new Calculate();
              myframe.setVisible(true);   
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        

}
}


