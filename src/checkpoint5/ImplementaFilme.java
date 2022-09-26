package checkpoint5;
import java.awt.Dimension;
import java.awt.Toolkit;
//RM93423
//RM 95962
import javax.swing.*;

public class ImplementaFilme {

	public static void main(String[] args) {
		GUIFilmes frame = new GUIFilmes();
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2 );
		frame.setVisible(true);

	}

}
