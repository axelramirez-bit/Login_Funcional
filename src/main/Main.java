
package main;


import View.Trabajador.DashboardTrabajador;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            new DashboardTrabajador()
                    .setVisible(true);
        });
      
    }

}
