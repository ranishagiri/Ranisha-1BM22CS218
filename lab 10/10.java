import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class SwingDemo{
    SwingDemo(){
        // create jframe container
        JFrame jfrm = new JFrame(&quot;Divider App&quot;);
        jfrm.setSize(275, 150);
        jfrm.setLayout(new FlowLayout());
        // to terminate on close
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
 
        // text label
        JLabel jlab = new JLabel(&quot;Enter the divider and divident:&quot;);
 
        // add text field for both numbers
        JTextField ajtf = new JTextField(8);
        JTextField bjtf = new JTextField(8);
 
        // calc button
        JButton button = new JButton(&quot;Calculate&quot;);
 
        // labels
        JLabel err = new JLabel();
        JLabel alab = new JLabel();
        JLabel blab = new JLabel();
        JLabel anslab = new JLabel();
 

        // add in order :)
        jfrm.add(err);  // to display error bois
        jfrm.add(jlab);
        jfrm.add(ajtf);
        jfrm.add(bjtf);
        jfrm.add(button);
        jfrm.add(alab);
        jfrm.add(blab);
        jfrm.add(anslab);
       
        ActionListener l = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.out.println(&quot;Action event from a text field&quot;);
            }
        };
        ajtf.addActionListener(l);
        bjtf.addActionListener(l);
 
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try{
                    int a = Integer.parseInt(ajtf.getText());
                    int b = Integer.parseInt(bjtf.getText());
                    int ans = a/b;
                   
                    alab.setText(&quot;\nA = &quot; + a);
                    blab.setText(&quot;\nB = &quot; + b);
                    anslab.setText(&quot;\nAns = &quot;+ ans);
                }
                catch(NumberFormatException e){
                    alab.setText(&quot;&quot;);
                    blab.setText(&quot;&quot;);
                    anslab.setText(&quot;&quot;);
                    err.setText(&quot;Enter Only Integers!&quot;);
                }
                catch(ArithmeticException e){
                    alab.setText(&quot;&quot;);

                    blab.setText(&quot;&quot;);
                    anslab.setText(&quot;&quot;);
                    err.setText(&quot;B should be NON zero!&quot;);
                }
            }
        });
 
        // display frame
        jfrm.setVisible(true);
    }
 
    public static void main(String args[]){
        // create frame on event dispatching thread
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new SwingDemo();
            }
        });
    }
}
