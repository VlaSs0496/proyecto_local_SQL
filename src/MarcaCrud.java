
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MarcaCrud {

    Connection conexion;

    public void conectar() {
        try {
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/2021-2", "postgres", "asd");
            System.out.println("Conexion exitosa");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void insertarRef(Marca marca) {
        try {
            conectar();
            Statement stmt = conexion.createStatement();
            String sql = "INSERT INTO public.marca(marca, referencia, cantidad)\n"
                    + "	VALUES ('"+marca.getMarca()+"', "+marca.getReferencia()+", "+marca.getCantidad()+");";
            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void consultarRef() {

        try {
            conectar();
            Statement stmt = conexion.createStatement();
            String consultar = "SELECT marca, referencia, cantidad FROM public.Marca;";
            ResultSet resultado = stmt.executeQuery(consultar);

            while (resultado.next()) {
                Object fila[] = new Object[3];

                for (int i = 0; i < fila.length; i++) {
                    fila[i] = resultado.getObject(i + 1);
                    
                }
                
                
            }
            }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        }

    }
