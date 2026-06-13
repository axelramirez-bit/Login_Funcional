package View.Empresa;

import java.awt.*;
import javax.swing.*;

public class DashboardEmpresa extends JFrame {

    public DashboardEmpresa() {

        setTitle("Dashboard Reclutador");

        setSize(1200, 700);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JLabel titulo
                = new JLabel(
                        "Bienvenido Reclutador"
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