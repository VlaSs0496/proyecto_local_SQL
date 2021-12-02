
public class mvcL {

    public static void main(String[] args) {

        vista gui = new vista();
        Marca marca = new Marca();
        gui.setVisible(true);
        Controlador controlador = new Controlador(gui, marca);

    }

}
