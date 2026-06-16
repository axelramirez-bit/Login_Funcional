package View.Trabajador;

import java.awt.*;
import javax.swing.*;

public class Vacantes extends JPanel {

    public Vacantes() {

        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        JLabel titulo = new JLabel("Vacantes");

        titulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        30
                )
        );

        add(titulo, BorderLayout.NORTH);

        JPanel contenido = new JPanel();
        contenido.setBackground(Color.WHITE);

        add(contenido, BorderLayout.CENTER);
    }
}