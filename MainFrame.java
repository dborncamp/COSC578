import javax.swing.*;
import java.awt.event.*;


public class MainFrame extends JFrame implements ActionListener
{

   public MainFrame()
       {
       super("Dialog Based Application");
       //settings for JFrame
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(100,100,400,330);
       getContentPane().setLayout(null);

       //JButton Settings
       click=new JButton("Click me");
       click.setBounds(150,130,100,40);
       click.addActionListener(this);

       //adding controls to JFrame
       getContentPane().add(click);
       show();
        }

       public void actionPerformed(ActionEvent ae){
          JButton ok=new JButton("ok");
          ok.setBounds(120,170,70,40);
          ok.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e)
                          { //add ur code here to manipulate text field values
                          inputbox.setVisible(false);
                          System.out.println(txtname.getText());
                          }
                      }
              );
          inputbox=new JDialog(MainFrame.this,true);

          inputbox.setTitle("Enter Inputs");
          inputbox.getContentPane().setLayout(null);
          inputbox.setBounds(150,150,300,250);

          lblname=new JLabel("Product Name");
          lblcode=new JLabel("Product Code");
          lblacc=new JLabel("Account Number");


          lblname.setBounds(20,20,120,40);
          lblcode.setBounds(20,70,120,40);
          lblacc.setBounds(20,110,120,40);


          inputbox.getContentPane().add(lblname);
          inputbox.getContentPane().add(lblcode);
          inputbox.getContentPane().add(lblacc);



          txtname=new JTextField("");
          txtcode=new JTextField("");
          txtacc=new JTextField("");


          txtname.setBounds(160,20,120,40);
          txtcode.setBounds(160,70,120,40);
          txtacc.setBounds(160,120,120,40);


          inputbox.getContentPane().add(txtname);
          inputbox.getContentPane().add(txtcode);
          inputbox.getContentPane().add(txtacc);
          inputbox.getContentPane().add(ok);

          inputbox.show();
          }

       public static void main(String[] args)
                {
                  new MainFrame();
                }

            public JButton click;
            public JDialog inputbox;
            public JLabel lblname;
            public JLabel lblcode;
            public JLabel lblacc;
            public JTextField txtname;
            public JTextField txtcode;
            public JTextField txtacc;
     } 