
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {

    vista gui;
    MarcaCrud crud;
    Marca marca;

    public Controlador(vista gui, Marca marca) {
        this.gui = gui;
        this.marca = marca;
        this.gui.btnIn.addActionListener(this);
        this.gui.btnBus.addActionListener(this);
        crud = new MarcaCrud();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getSource() == gui.btnIn) {
            System.out.println("Insertar");
            String marcaM = gui.jMarca.getText();
            int referencia = -1;
            int cantidad = -1;

            try {
                referencia = Integer.parseInt(gui.jReferencia.getText());
                cantidad = Integer.parseInt(gui.jCantidad.getText());
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(gui, "Error de numeracion");
            }
            if (cantidad > 0) {
                marca = new Marca(marcaM, referencia, cantidad);
                crud.insertarRef(marca);

            }

        }else if (e.getSource() == gui.btnBus) {
            System.out.println("Buscar");
            crud.consultarRef();

        }
    }
}
