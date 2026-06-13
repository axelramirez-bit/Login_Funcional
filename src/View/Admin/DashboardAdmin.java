package View.Admin;

import java.awt.*;
import javax.swing.*;

public class DashboardAdmin extends JFrame {

    public DashboardAdmin() {

        setTitle("Dashboard Admin");

        setSize(1200, 700);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JLabel titulo
                = new JLabel(
                        "Bienvenido Administrador"
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