package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    // Instancia única (Singleton)
    private static ConexionBD instancia;

    // Conexión
    private Connection connection;

    // Configuración BD
    private final String URL =
            "jdbc:mysql://localhost:3306/workbridge_db?serverTimezone=UTC";

    private final String USER =
            "root";

    private final String PASSWORD =
            "admin";

    // Constructor privado
    private ConexionBD() {

        try {

            Class.forName(
                    "com.mysql.cj.jdbc.Driver"
            );

            connection =
                    DriverManager.getConnection(
                            URL,
                            USER,
                            PASSWORD
                    );

            System.out.println(
                    "Conexión exitosa a MySQL"
            );

        } catch (
                ClassNotFoundException
                | SQLException e
        ) {

            System.out.println(
                    "Error conexión: "
                    + e.getMessage()
            );
        }
    }

    // Singleton
    public static ConexionBD getInstancia() {

        if (instancia == null) {

            instancia =
                    new ConexionBD();
        }

        return instancia;
    }

    // Obtener conexión
    public Connection getConnection() {

        try {

            // Reconectar si se cerró
            if (connection == null
                    || connection.isClosed()) {

                instancia =
                        new ConexionBD();
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return connection;
    }
}