package View.Trabajador;

import java.awt.*;
import javax.swing.*;

public class DashboardTrabajador extends JFrame {

    public DashboardTrabajador() {

        setTitle("Dashboard Trabajador");

        setSize(1200, 700);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JLabel titulo
                = new JLabel(
                        "Bienvenido Trabajador"
                );

        titulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        30
                )
        );

        titulo.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        add(
                titulo,
                BorderLayout.CENTER
        );
    }
}