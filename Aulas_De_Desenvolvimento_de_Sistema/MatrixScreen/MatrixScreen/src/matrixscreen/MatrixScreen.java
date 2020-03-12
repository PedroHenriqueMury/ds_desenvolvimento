package matrixscreen;
import javax.swing.text.*;
import java.text.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class MatrixScreen extends JFrame {
    JLabel fn, funct, vX, vY, vZ, start1, start2, start3, end1, end2, end3, Xl, Yl, Zl, title, out, term, X1, Y1, x11, stdout, MS;
    JTextField tfn, tfunct, tvX, tvY, tvZ, ts1, ts2, ts3, tend1, tend2, tend3, tXl, tYl, tZl, ttitle, tX1, tX2, tX3, tX4, tY1, tY2, tY3, tY4;
    JButton plot, replot, quit;
public MatrixScreen(){
    super("X Gnuplot Front End");
    Container tela = getContentPane();
    setLayout(null);
    
    MS = new JLabel("Matrix Screen");
    MS.setBounds(200, 10, 120, 10);
    MS.setForeground
    tela.add(MS);
    
    fn = new JLabel("Filename");
    funct = new JLabel("Function");
    vX = new JLabel("Variable X: ");
    vY = new JLabel("Variable Y: ");
    vZ = new JLabel("Variable Z: ");
    start1 = new JLabel("Start");
    start2 = new JLabel("Start");
    start3 = new JLabel("Start");
    end1 = new JLabel("End: ");
    end2 = new JLabel("End: ");
    end3 = new JLabel("End: ");
    Xl = new JLabel("X Label:");
    Yl = new JLabel("Y Label");
    Zl = new JLabel("Z Label");
    title = new JLabel("Title: ");
    out = new JLabel("Output: ");
    term = new JLabel("Terminal: ");
    X1 = new JLabel("X");
    Y1 = new JLabel("Y");
    x11 = new JLabel("x11");
    stdout = new JLabel("stdout");
    
    
    
    tfn = new JTextField("none");
    tfunct = new JTextField();
    tvX = new JTextField();
    tvY = new JTextField();
    tvZ = new JTextField();
    ts1 = new JTextField();
    ts2 = new JTextField();
    ts3 = new JTextField();
    tend1 = new JTextField();
    tend2 = new JTextField();
    tend3 = new JTextField();
    tXl = new JTextField();
    tYl = new JTextField();
    tZl = new JTextField();
    ttitle = new JTextField();
    tX1 = new JTextField();
    tX2 = new JTextField();
    tX3 = new JTextField();
    tX4 = new JTextField();
    tY1 = new JTextField();
    tY2 = new JTextField();
    tY3 = new JTextField();
    tY4 = new JTextField();
    
   
    
    
    
    
    
   setSize(500, 500);
   setVisible(true);
   setLocationRelativeTo(null);
    
   
}   
    
    
    
    
    
    
    
    
public static void main(String[] args) {
   MatrixScreen app = new MatrixScreen();
   app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
    }
    
}
