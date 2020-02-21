package exemplolabel_42.newpackage;
import java.awt.event.*;
import javax.swing.*;//Esta importando a biblioteca javax onde está puxando o swing e com ".*" puxamos tudo que precisamos.
import java.awt.*;//Esta importanto a biblioteca java onde dela puxamos o "awt" e com ".*" puxamos tudo que precisamo.
public class ExemploLabel_42 extends JFrame{//Estamos deixando a classe pública para outras classes e está herdando de JFrame.
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7, rotulo8, rotulo9, rotulos, rotulod, rotulotel;//Setamos rótulos para podermos usar.
    JTextField texto1, texto3, texto4, texto5, texto6, texto8;//Setamos caixas para podermos usar na janela.
    JFormattedTextField texto2, texto7, textotel, textod;
    JButton botao, botao1, botao2;
    ImageIcon icone;
    JPasswordField caixa;
    MaskFormatter masccep, masctel, masccpf, mascdata;
public ExemploLabel_42(){//Estamos deixando o projeto público e vísivel.
    super("Exemplo de Label");//Legenda que ficara no cabeçalho da janela.
    Container tela = getContentPane();//Estamos setando um perímetro para que possamos editar.
    setLayout(null);//Setando um parâmetro.
        
        caixa = new JPasswordField(10);
    
        icone = new ImageIcon("up.png");
    
        botao = new JButton("Procurar");
        botao1 = new JButton("Abrir", icone);
    
        rotulo1 = new JLabel ("Nome:");//Setando uma palavrar para representar o rotulo.
        rotulo2 = new JLabel ("CPF:");
        rotulo3 = new JLabel ("RG:");
        rotulo4 = new JLabel ("Endereço:");
        rotulo5 = new JLabel ("Cidade:");
        rotulo6 = new JLabel ("Estado:");
        rotulo7 = new JLabel ("CEP:");
        rotulo8 = new JLabel ("Cadastro de Cliente");
        rotulos = new JLabel ("Senha");
        rotulotel = new JLabel ("Telefone");
        rotulod = new JLabel ("Data");
        
        texto1 = new JTextField();
        texto3 = new JTextField();
        texto4 = new JTextField();
        texto5 = new JTextField();
        texto6 = new JTextField();
        
        
        caixa.setBounds(50, 320, 80, 20);
        
        botao.setBounds(20, 440, 100, 20);
        botao1.setBounds(150, 440, 100, 20);
        
        rotulo1.setBounds(50, 20, 80, 20);//Setando o X, Y e a altura e largura de cada palavra.  
        rotulo2.setBounds(50, 60, 80, 20);
        rotulo3.setBounds(50, 100, 80, 20);
        rotulo4.setBounds(50, 140, 80, 20);
        rotulo5.setBounds(50, 180, 80, 20);
        rotulo6.setBounds(50, 220, 80, 20);
        rotulo7.setBounds(50, 260, 80, 20);
        rotulo8.setBounds(135, 10, 120, 10);
        rotulos.setBounds(50, 300, 80, 20);
        rotulotel.setBounds(50, 350, 100, 20);
        rotulod.setBounds(50, 380, 100, 20);
        
        texto1.setBounds(50, 40, 150, 20);
        texto2.setBounds(50, 80, 150, 20);
        texto3.setBounds(50, 120, 150, 20);
        texto4.setBounds(50, 160, 150, 20);
        texto5.setBounds(50, 200, 150, 20);
        texto6.setBounds(50, 240, 150, 20);
        texto7.setBounds(50, 280, 150, 20);
        
    try{
        
    }    
        
        
        
        
        
        
        
        
        
        
        
        
        rotulo1.setForeground(Color.black);//Setando uma cor para cada palavra, também em modelo RGB.
        rotulo2.setForeground(Color.black);
        rotulo3.setForeground(Color.black);
        rotulo4.setForeground(Color.black);
        rotulo5.setForeground(Color.black);
        rotulo6.setForeground(Color.black);
        rotulo7.setForeground(Color.black);
        rotulo8.setForeground(Color.red);
        
        rotulo1.setFont(new Font("Arial", Font.BOLD,12));//Setando a fonte, o estilo e o tamanho de cada palavra.     
        rotulo2.setFont(new Font("Arial", Font.BOLD,12)); 
        rotulo3.setFont(new Font("Arial", Font.BOLD,12)); 
        rotulo4.setFont(new Font("Arial", Font.BOLD,12)); 
        rotulo5.setFont(new Font("Arial", Font.BOLD,12)); 
        rotulo6.setFont(new Font("Arial", Font.BOLD,12)); 
        rotulo7.setFont(new Font("Arial", Font.BOLD,12));  
        rotulo8.setFont(new Font("Arial", Font.BOLD, 12));
        
        tela.add(caixa);
        
        tela.add(botao);
        tela.add(botao1);
        
        tela.add(rotulo1);//Adiciona o rotulo a tela de exibição.
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        tela.add(rotulo8);
        tela.add(rotulos);
        
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        
        
        
        
        setSize(500, 500);//Tamnho da Tela
        setVisible(true);//Deixando a tela vísivel para o cliente.
        setLocationRelativeTo(null);//Deixar a janela no meio da tela do computador.
    }
    public static void main(String args[]){//Onde executamos tudo.
        ExemploLabel_42 app = new ExemploLabel_42();//Criando a classe "app" e alocando o Construtor no objeto. 
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Colocando a função de mínimizar, maximizar e fechar a janela.
    }
}

