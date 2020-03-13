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
    MS.setForeground(Color.red);
    tela.add(MS);
    MS.setFont(new Font("Arial", Font.BOLD,12));
    
    fn = new JLabel("Filename");
    fn.setBounds(25, 35, 120, 10);
    fn.setForeground(Color.black);
    fn.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(fn);
    
    funct = new JLabel("Function");
    funct.setBounds(25, 70, 120, 10);
    funct.setForeground(Color.black);
    funct.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(funct);
    
    vX = new JLabel("Variable X: ");
    vX.setBounds(25, 170, 120, 10);
    vX.setForeground(Color.BLACK);
    vX.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(vX);
    
    vY = new JLabel("Variable Y: ");
    vY.setBounds(25, 200, 120, 10);
    vY.setForeground(Color.BLACK);
    vY.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(vY);
    
    vZ = new JLabel("Variable Z: ");
    vZ.setBounds(25, 230, 120, 10);
    vZ.setForeground(Color.BLACK);
    vZ.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(vZ);
    
    start1 = new JLabel("Start");
    start1.setBounds(190, 170, 120, 10);
    start1.setForeground(Color.BLACK);
    start1.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(start1);
    
    start2 = new JLabel("Start");
    start2.setBounds(190, 200, 120, 10);
    start2.setForeground(Color.BLACK);
    start2.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(start2);
    
    start3 = new JLabel("Start");
    start3.setBounds(190, 230, 120, 10);
    start3.setForeground(Color.BLACK);
    start3.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(start3);
    
    end1 = new JLabel("End: ");
    end1.setBounds(325, 170, 120, 10);
    end1.setForeground(Color.BLACK);
    end1.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(end1);
    
    end2 = new JLabel("End: ");
    end2.setBounds(325, 200, 120, 10);
    end2.setForeground(Color.BLACK);
    end2.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(end2);
    
    end3 = new JLabel("End: ");
    end3.setBounds(325, 230, 120, 10);
    end3.setForeground(Color.BLACK);
    end3.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(end3);
    
    Xl = new JLabel("X Label: ");
    Xl.setBounds(25, 280, 120, 10);
    Xl.setForeground(Color.BLACK);
    Xl.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(Xl);
    
    Yl = new JLabel("Y Label: ");
    Yl.setBounds(25, 315, 120, 10);
    Yl.setForeground(Color.BLACK);
    Yl.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(Yl);
    
    Zl = new JLabel("Z Label: ");
    Zl.setBounds(25, 350, 120, 10);
    Zl.setForeground(Color.BLACK);
    Zl.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(Zl);
    
    title = new JLabel("Title: ");
    title.setBounds(25, 385, 120, 10);
    title.setForeground(Color.BLACK);
    title.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(title);
    
    out = new JLabel("Output: ");
    out.setBounds(25, 425, 120, 10);
    out.setForeground(Color.BLACK);
    out.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(out);
    
    term = new JLabel("Terminal: ");
    term.setBounds(25, 460, 120, 10);
    term.setForeground(Color.BLACK);
    term.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(term);
    
    X1 = new JLabel("X");
    X1.setBounds(450, 250, 120, 10);
    X1.setForeground(Color.BLACK);
    X1.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(X1);
    
    Y1 = new JLabel("Y");
    Y1.setBounds(490, 250, 120, 10);
    Y1.setForeground(Color.BLACK);
    Y1.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(Y1);
    
    x11 = new JLabel("x11");
    x11.setBounds(100, 425, 120, 10);
    x11.setForeground(Color.blue);
    x11.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(x11);
    
    stdout = new JLabel("stdout");
    stdout.setBounds(100, 460, 120, 10);
    stdout.setForeground(Color.blue);
    stdout.setFont(new Font("Arial", Font.BOLD, 12));
    tela.add(stdout);

    
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
    
   
    
    
    
    
    
   setSize(600, 600);
   setVisible(true);
   setLocationRelativeTo(null);
    
   
}   
    
    
    
    
    
    
    
    
public static void main(String[] args) {
   MatrixScreen app = new MatrixScreen();
   app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
    }
    
}
