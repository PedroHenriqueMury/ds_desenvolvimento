import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calculadora extends JFrame{
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton soma, subi, divi, multii;
public calculadora(){
    super("Exemplo de contas");
    Container tela = getContentPane();
    setLayout(null);
        rotulo1 = new  JLabel("1º Número: ");
        rotulo2 = new JLabel("2º Número: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        soma = new JButton("Soma");
        subi = new JButton("Subtração");
        divi = new JButton("Divisão");
        multii = new JButton("Multiplicação");
        exibir = new JLabel("");
        
        
        
   rotulo1.setBounds(50, 20, 100, 20);
   rotulo2.setBounds(50, 60, 100, 20);
   texto1.setBounds(120, 20, 200, 20);
   texto2.setBounds(120, 60, 200, 20);
   exibir.setBounds(50, 120, 200, 20);
   soma.setBounds(50, 100, 80, 20);
   subi.setBounds(150, 100, 100, 20);
   multii.setBounds(270, 100, 110, 20);
   divi.setBounds(390, 100, 80, 20);
   
   soma.addActionListener(
           new ActionListener(){
               public void actionPerformed(ActionEvent e){
                   int numero1, numero2, soma;
                   soma = 0;
                   numero1 = Integer.parseInt(texto1.getText());
                   numero2 = Integer.parseInt(texto2.getText());
                   soma = numero1 + numero2;
                   exibir.setVisible(true);
                   exibir.setText("A soma é: " +soma);
               }
           }
                   );   
                   
    subi.addActionListener(
           new ActionListener(){
               public void actionPerformed(ActionEvent e){
                   int numero1, numero2, sub;
                   sub = 0;
                   numero1 = Integer.parseInt(texto1.getText());
                   numero2 = Integer.parseInt(texto2.getText());
                   sub = numero1 - numero2;
                   exibir.setVisible(true);
                   exibir.setText("A subtração é: " +sub );
               }
           }
                   );   
                   
    divi.addActionListener(
           new ActionListener(){
               public void actionPerformed(ActionEvent e){
                   int numero1, numero2, div;
                   div = 0;
                   numero1 = Integer.parseInt(texto1.getText());
                   numero2 = Integer.parseInt(texto2.getText());
                   div = numero1 / numero2;
                   exibir.setVisible(true);
                   exibir.setText("A soma é: " +div);       
               }
           }
);  
                   
                   
    multii.addActionListener(
           new ActionListener(){
               public void actionPerformed(ActionEvent e){
                   int numero1, numero2, multi;
                   multi = 0;
                   numero1 = Integer.parseInt(texto1.getText());
                   numero2 = Integer.parseInt(texto2.getText());
                   multi = numero1 * numero2;
                   exibir.setVisible(true);
                   exibir.setText("A soma é: " +multi);               
                   
               }
           }
   );
   exibir.setVisible(false);
   
   tela.add(rotulo1);
   tela.add(rotulo2);
   tela.add(texto1);
   tela.add(texto2);
   tela.add(exibir);
   tela.add(soma);
   tela.add(subi);
   tela.add(divi);
   tela.add(multii);
   
   setSize(500, 450);
   setVisible(true);
   
}
    public static void main(String args[]){
    calculadora app = new calculadora();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
         