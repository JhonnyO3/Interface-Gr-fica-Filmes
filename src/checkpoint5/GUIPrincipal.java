package checkpoint5;
// RM93423
// RM 95962
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class GUIPrincipal extends JFrame {
	
	private Container contentPane;
	private JMenuBar mnBarra;
	private JMenu mnArquivo, mnCadastros;
	private JMenuItem miSair, miMenuFilmes;
	
	
	public GUIPrincipal() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		setTitle("Menu Principal Filmes");
		setBounds(0, 0, 800, 600);
		contentPane = getContentPane();
		mnBarra = new JMenuBar();
		mnArquivo = new JMenu("Arquivo ");
		mnCadastros = new JMenu("Cadastros");
		mnArquivo.setMnemonic('A');
		mnArquivo.setMnemonic('C');
		miSair = new JMenuItem("Sair", new ImageIcon(getClass().getResource("exit_icon.png")));
		miMenuFilmes = new JMenuItem("Menu Filmes");
		
		setJMenuBar(mnBarra);
		mnBarra.add(mnArquivo);
		mnBarra.add(mnCadastros);
		mnArquivo.add(miSair);
		mnCadastros.add(miMenuFilmes);
		
		
	}
	public void definirEventos() {
		miSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		miMenuFilmes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GUIFilmes gf = new GUIFilmes();
				contentPane.removeAll();
				setBounds(0, 0, 1000, 1000);
				contentPane.add(gf);
				contentPane.validate();
				
			}
		});
		
	}
	
	

}
