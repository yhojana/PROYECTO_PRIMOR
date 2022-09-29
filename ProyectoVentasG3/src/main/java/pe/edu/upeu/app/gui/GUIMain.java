
package pe.edu.upeu.app.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author LABORATORIO_2
 */
public class GUIMain{
    JFrame frame=new JFrame();
    JMenuBar menuBar;
    JMenu menu1;
    JMenuItem jmI1;    
    JTabbedPane jtpane;
    JPanel jp;            
    public GUIMain(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(new Dimension(screenSize.width, (screenSize.height)-36));        
        menuBar=new JMenuBar();    
        menu1=new JMenu("Archivo");        
        jmI1=new JMenuItem("Abrir");
        menuBar.add(menu1);
        menu1.add(jmI1);        
        menu1=new JMenu("Ver");
        menuBar.add(menu1);        
        jtpane=new JTabbedPane();
        jp=new JPanel();
        jtpane.add("Prueba", jp);
        jp=new JPanel();
        jtpane.add("Preuba 2", jp);
        Login l=new Login();        
        jtpane.add("Login", l);
        frame.add(menuBar);
        frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, jtpane);
        frame.setVisible(true);
    }
        
}
