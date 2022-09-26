package checkpoint5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class GUIFilmes extends JPanel {

	private JButton btSalvar, btCancelar;
    private JTextField tfCodigo, tfTitulo;
    private JLabel lbProdutora, lbGenero;
    private JRadioButton rbWarner, rbFox, rbDisney, rbUniversal;
    private JScrollPane spLista;
    private ImageIcon imagem1;
    private JLabel lbImagem;
    
    private JList<String> liFilmes;
    
    public GUIFilmes() {
        inicializarComponentes();
        definirEventos();
 
    }
    
    public void inicializarComponentes() {
    	setLayout(null);
    	setBounds(0, 0, 1000, 1200);
        
        String[] liFilmesLista = {"Fantasia", "Infantil", "Medieval", "Nordico", "Terror" };
        
        liFilmes = new JList<String>(liFilmesLista);
        
        imagem1 = new ImageIcon();
        lbProdutora = new JLabel("Produtora");
        tfCodigo = new JTextField("Código");
        tfTitulo = new JTextField("Título");
        rbWarner = new JRadioButton("Warner");
        rbFox = new JRadioButton("Fox");
        rbDisney = new JRadioButton("Disney");
        rbUniversal = new JRadioButton("Universal");
        spLista = new JScrollPane(liFilmes);
        btSalvar= new JButton("Salvar");
        btCancelar = new JButton("Cancelar");
        lbGenero = new JLabel("Genero");
        lbImagem = new JLabel(imagem1);
        
        add(lbGenero);
        add(lbProdutora);
        add(btSalvar);
        add(btCancelar);
        add(tfCodigo);
        add(tfTitulo);
        add(spLista);
        add(lbImagem);
        
        add(rbWarner);
        add(rbDisney);
        add(rbUniversal);
        add(rbFox);
        rbWarner.setBackground(getBackground());
        rbDisney.setBackground(getBackground());
        rbUniversal.setBackground(getBackground());
        rbFox.setBackground(getBackground());
     
        
        
        lbImagem.setBounds(450, 50, 550, 550);
        spLista.setBounds(250, 50, 200, 100);
        tfCodigo.setBounds(35, 10, 100, 25);
        tfTitulo.setBounds(35, 50, 200, 25);
        lbGenero.setBounds(250, 25, 50, 25);
        
        lbProdutora.setBounds(35, 90, 100, 35);
        rbWarner.setBounds(35, 130, 100, 35);
        rbFox.setBounds(35, 170, 100, 35);
        rbDisney.setBounds(35, 210, 100, 35);
        rbUniversal.setBounds(35, 250, 100, 35 );
        
        btSalvar.setBounds(170, 310, 90, 25);
        btCancelar.setBounds(500, 310, 90, 25);
       
        
        
        
    }
    public void definirEventos() {
    	liFilmes.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                imagem1 = new ImageIcon(
                        getClass().getResource("Genero/"
                                + liFilmes.getSelectedValue() + ".png"));
                lbImagem.setIcon(imagem1);
            }
        });
    	
    	
    	
    	
    	
    	btCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
    	btSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String dados = "Filme selected";
				dados += "Codigo" + tfCodigo.getText() + "\n";
				dados += "Titulo" + tfCodigo.getText() + "\n";
				if(rbFox.isSelected()) {
					dados += "Produtora Fox";
				
				} else if(rbWarner.isSelected()) {
					dados+="Produtora Warner";
					
				} else if(rbUniversal.isSelected()) {
					dados+="Produtora Universal";
				} else {
					dados+= "Produtora Disney";
				}
				JOptionPane.showMessageDialog(null, dados);
				
				
			}
		});
    	
    	
    	
    }
    
}