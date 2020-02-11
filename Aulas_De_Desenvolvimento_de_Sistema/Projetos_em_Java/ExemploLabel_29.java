import javax.swing.*;//Esta importando a biblioteca javax onde está puxando o swing e com ".*" puxamos tudo que precisamos.
import java.awt.*;//Esta importanto a biblioteca java onde dela puxamos o "awt" e com ".*" puxamos tudo que precisamo.
public class ExemploLabel_29 extends JFrame{//Estamos deixando a classe pública para outras classes e está herdando de JFrame.
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7, rotulo8;//Setamos rótulos para podermos usar.
    JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8;//Setamos caixas para podermos usar na janela.
public ExemploLabel_29(){//Estamos deixando o projeto público e vísivel.
    super("Exemplo de Label");//Legenda que ficara no cabeçalho da janela.
    Container tela = getContentPane();//Estamos setando um perímetro para que possamos editar.
    setLayout(null);//Setando um parâmetro.
        rotulo1 = new JLabel ("Nome");//Setando uma palavrar para representar o rotulo.
        rotulo2 = new JLabel ("Idade");
        rotulo3 = new JLabel ("Telefone");
        rotulo4 = new JLabel ("Celular");
        rotulo5 = new JLabel ("CPF");
        rotulo6 = new JLabel ("Endereco");
        rotulo7 = new JLabel ("CEP");
        rotulo8 = new JLabel ("Estado");
        
        texto1 = new JTextField();
        texto2 = new JTextField();
        texto3 = new JTextField();
        texto4 = new JTextField();
        texto5 = new JTextField();
        texto6 = new JTextField();
        texto7 = new JTextField();
        texto8 = new JTextField();
        
        
        rotulo1.setBounds(50, 20, 80, 20);//Setando o X, Y e a altura e largura de cada palavra.  
        rotulo2.setBounds(50, 60, 80, 20);
        rotulo3.setBounds(50, 100, 80, 20);
        rotulo4.setBounds(50, 140, 80, 20);
        rotulo5.setBounds(50, 180, 80, 20);
        rotulo6.setBounds(50, 220, 80, 20);
        rotulo7.setBounds(50, 260, 80, 20);
        rotulo8.setBounds(50, 300, 80, 20);
        
        texto1.setBounds(150, 20, 150, 20);
        texto2.setBounds(150, 60, 50, 20);
        texto3.setBounds(150, 100, 150, 20);
        texto4.setBounds(150, 140, 150, 20);
        texto5.setBounds(150, 180, 150, 20);
        texto6.setBounds(150, 220, 150, 20);
        texto7.setBounds(150, 260, 150, 20);
        texto8.setBounds(150, 300, 150, 20);
        
        rotulo1.setForeground(Color.red);//Setando uma cor para cada palavra, também em modelo RGB.
        rotulo2.setForeground(Color.blue);
        rotulo3.setForeground(new Color(190,152,142));
        rotulo4.setForeground(new Color(201,200,100));
        rotulo5.setForeground(Color.pink);
        rotulo6.setForeground(Color.yellow);
        rotulo7.setForeground(new Color(72,61,139));
        rotulo8.setForeground(new Color(218,165,32));
        
        rotulo1.setFont(new Font("Arial", Font.BOLD,14));//Setando a fonte, o estilo e o tamanho de cada palavra.     
        rotulo2.setFont(new Font("Comic Sans MS", Font.BOLD,16)); 
        rotulo3.setFont(new Font("Courier New", Font.BOLD,16)); 
        rotulo4.setFont(new Font("Times New Roman", Font.BOLD,20)); 
        rotulo5.setFont(new Font("Blenda", Font.BOLD,14)); 
        rotulo6.setFont(new Font("Bolina", Font.BOLD,16)); 
        rotulo7.setFont(new Font("Cookie", Font.BOLD,18)); 
        rotulo8.setFont(new Font("Dancing Script", Font.BOLD,20)); 
        
        tela.add(rotulo1);//Adiciona o rotulo a tela de exibição.
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        tela.add(rotulo8);
        
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        tela.add(texto8);
        
        
        
        setSize(600, 450);//Tamnho da Tela
        setVisible(true);//Deixando a tela vísivel para o cliente.
        setLocationRelativeTo(null);//Deixar a janela no meio da tela do computador.
    }
    public static void main(String args[]){//Onde executamos tudo.
        ExemploLabel_29 app = new ExemploLabel_29();//Criando a classe "app" e alocando o Construtor no objeto. 
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Colocando a função de mínimizar, maximizar e fechar a janela.
    }
}
