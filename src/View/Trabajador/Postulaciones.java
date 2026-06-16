
package View.Trabajador;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.DefaultCellEditor;

public class Postulaciones extends JPanel {

    // ==========================================
    // COLORES WORKBRIDGE
    // ==========================================
    private final Color AZUL_OSCURO
            = new Color(54, 73, 125);

    private final Color MORADO
            = new Color(171, 132, 187);

    private final Color CREMA
            = new Color(212, 205, 197);

    private final Color FONDO
            = new Color(245, 245, 245);

  
    // ==========================================
    // CONSTRUCTOR
    // ==========================================
public Postulaciones() {

    setLayout(
            new BorderLayout()
    );

    setBackground(
            Color.WHITE
    );

    crearTablaPostulaciones();
}

    private void crearTablaPostulaciones() {

        // ==========================================
        // PANEL CENTRAL
        // ==========================================
        JPanel panelCentro
                = new JPanel(
                        new BorderLayout()
                );

        panelCentro.setBackground(
                Color.WHITE
        );

        panelCentro.setBorder(
                new EmptyBorder(
                        10,
                        28,
                        25,
                        28
                )
        );

        // ==========================================
        // PANEL TABS
        // ==========================================
        JPanel panelTabs
                = new JPanel(
                        new FlowLayout(
                                FlowLayout.LEFT,
                                0,
                                0
                        )
                );

        panelTabs.setBackground(
                Color.WHITE
        );

        panelTabs.add(
                crearTab(
                        "Todas",
                        true
                )
        );

        panelTabs.add(
                crearTab(
                        "En revisión",
                        false
                )
        );

        panelTabs.add(
                crearTab(
                        "Entrevista",
                        false
                )
        );

        panelTabs.add(
                crearTab(
                        "Aceptada",
                        false
                )
        );

        panelTabs.add(
                crearTab(
                        "Rechazada",
                        false
                )
        );

        // ==========================================
        // DATOS TABLA
        // ==========================================
        String[] columnas = {
            "#",
            "Vacante",
            "Empresa",
            "Fecha de postulación",
            "Estado",
            "Acciones"
        };

        Object[][] datos = {
            {
                1,
                "Desarrollador Java Backend",
                "TechCore Solutions",
                "12 may. 2025",
                "En revisión",
                "Ver detalles"
            },
            {
                2,
                "Analista de Datos",
                "Data Insights",
                "08 may. 2025",
                "Entrevista",
                "Ver detalles"
            },
            {
                3,
                "Diseñador UI/UX",
                "Creative Web",
                "02 may. 2025",
                "Rechazada",
                "Ver detalles"
            },
            {
                4,
                "Ingeniero DevOps",
                "CloudNet",
                "28 abr. 2025",
                "Aceptada",
                "Ver detalles"
            },
            {
                5,
                "Desarrollador Full Stack",
                "Innovatech",
                "20 abr. 2025",
                "En revisión",
                "Ver detalles"
            }
        };

        JTable tabla
                = new JTable(
                        datos,
                        columnas
                );
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabla.setShowGrid(true);
tabla.setGridColor(AZUL_OSCURO);
tabla.setIntercellSpacing(new Dimension(0, 0));
        // ==========================================
        // ESTILO TABLA
        // ==========================================
class EstadoRenderer extends BaseRenderer {

    @Override
    public Component getTableCellRendererComponent(
            JTable table,
            Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column
    ) {

        JLabel lbl = (JLabel) super.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column
        );

        lbl.setHorizontalAlignment(SwingConstants.CENTER);

        lbl.setOpaque(true);
        lbl.setBackground(Color.WHITE); // 👈 CLAVE: evita “manchas”

        String estado = value.toString();

        if (estado.equals("En revisión")) {
            lbl.setForeground(new Color(52, 120, 246));
        } else if (estado.equals("Entrevista")) {
            lbl.setForeground(new Color(145, 90, 220));
        } else if (estado.equals("Aceptada")) {
            lbl.setForeground(new Color(25, 165, 70));
        } else {
            lbl.setForeground(new Color(220, 50, 50));
        }

        return lbl;
    }
}
// ==========================================
// LINEAS DE TABLA
// ==========================================
        tabla.setGridColor(
                new Color(
                        195,
                        195,
                        195
                )
        );

        tabla.setShowHorizontalLines(
                true
        );

        tabla.setRowSelectionAllowed(true);
tabla.setCellSelectionEnabled(false);
tabla.setFocusable(false);
// GROSOR ENTRE CELDAS
        tabla.setIntercellSpacing(new Dimension(0, 0));

// COLOR FONDO DE TABLA
        tabla.setBackground(
                Color.WHITE
        );

// MARGEN INTERNO
        tabla.setRowHeight(
        60
);

tabla.setRowMargin(
        8
);

        tabla.setShowHorizontalLines(
                true
        );

        tabla.setShowVerticalLines(
                true
        );



        tabla.setFillsViewportHeight(
                true
        );

        // ==========================================
        // HEADER TABLA
        // ==========================================

                tabla.getTableHeader()
                .setReorderingAllowed(
                        false
                );
        tabla.getTableHeader()
                .setPreferredSize(
                        new Dimension(
                                0,
                                52
                        )
                );
tabla.getTableHeader().setDefaultRenderer(
        new DefaultTableCellRenderer() {

    @Override
    public Component getTableCellRendererComponent(
            JTable table,
            Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column
    ) {

        JLabel lbl =
                (JLabel) super.getTableCellRendererComponent(
                        table,
                        value,
                        isSelected,
                        hasFocus,
                        row,
                        column
                );

        lbl.setOpaque(true);

lbl.setBackground(
        new Color(
                179,
                201,
                214
        )
);

        lbl.setForeground(
        AZUL_OSCURO
);

        lbl.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        14
                )
        );

        lbl.setHorizontalAlignment(
                SwingConstants.LEFT
        );

        // LÍNEAS VISIBLES
        lbl.setBorder(BorderFactory.createMatteBorder(
        0, 0, 2, 2,
        AZUL_OSCURO
));

        return lbl;
    }
});
        // ==========================================
        // RENDER ESTADOS
        // ==========================================
        tabla.getColumnModel()
                .getColumn(4)
                .setCellRenderer(
                        new EstadoRenderer()
                );

        // ==========================================
        // BOTÓN MODERNO
        // ==========================================
        tabla.getColumnModel()
                .getColumn(5)
                .setCellRenderer(
                        new ButtonRenderer()
                );

        tabla.getColumnModel()
                .getColumn(5)
                .setCellEditor(
                        new ButtonEditor(
                                new JCheckBox()
                        )
                );

        // ==========================================
        // ANCHOS
        // ==========================================
        tabla.getColumnModel()
                .getColumn(0)
                .setPreferredWidth(
                        40
                );

        tabla.getColumnModel()
                .getColumn(1)
                .setPreferredWidth(
                        260
                );

        tabla.getColumnModel()
                .getColumn(5)
                .setPreferredWidth(
                        150
                );

        // ==========================================
        // SCROLL
        // ==========================================
        JScrollPane scroll
                = new JScrollPane(
                        tabla
                );
scroll.setBorder(
    BorderFactory.createLineBorder(
            new Color(210, 210, 210),
            1
    )
);

        scroll.getViewport()
                .setBackground(
                        Color.WHITE
                );

        // ==========================================
        // PANEL TABLA
        // ==========================================
        JPanel panelTabla
                = new RoundedPanel(
                        30
                );

        panelTabla.setLayout(
                new BorderLayout()
        );

        panelTabla.setBackground(
                Color.WHITE
        );

        panelTabla.setBorder(
                new EmptyBorder(
                        20,
                        20,
                        20,
                        20
                )
        );

        panelTabla.add(
                scroll,
                BorderLayout.CENTER
        );

        // ==========================================
        // AGREGAR
        // ==========================================
        JPanel panelSuperior
                = new JPanel(
                        new BorderLayout()
                );

        panelSuperior.setBackground(
                Color.WHITE
        );

        panelSuperior.add(
                panelTabs,
                BorderLayout.WEST
        );

        panelCentro.add(
                panelSuperior,
                BorderLayout.NORTH
        );

        panelCentro.add(
                panelTabla,
                BorderLayout.CENTER
        );
add(
        panelCentro,
        BorderLayout.CENTER
);
    }

// ==========================================
// TABS MODERNAS
// ==========================================
    private JButton crearTab(
            String texto,
            boolean activo
    ) {

        JButton btn
                = new JButton(texto);

        btn.setFocusPainted(false);
        btn.setBorderPainted(false);

        btn.setCursor(
                new Cursor(
                        Cursor.HAND_CURSOR
                )
        );

        btn.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        14
                )
        );

        btn.setPreferredSize(
                new Dimension(
                        155,
                        44
                )
        );
        btn.setBorder(
                new EmptyBorder(
                        0,
                        18,
                        0,
                        18
                )
        );
        // Estado inicial
        if (activo) {

            btn.setBackground(
                    MORADO
            );

            btn.setForeground(
                    Color.WHITE
            );

        } else {

            btn.setBackground(
                    AZUL_OSCURO
            );

            btn.setForeground(
                    Color.WHITE
            );
        }

        // Evento CLICK
        btn.addActionListener(e -> {

            Container parent
                    = btn.getParent();

            for (Component c
                    : parent.getComponents()) {

                if (c instanceof JButton boton) {

                    boton.setBackground(
                            AZUL_OSCURO
                    );

                    boton.setForeground(
                            Color.WHITE
                    );
                }
            }

            btn.setBackground(
                    MORADO
            );

            btn.setForeground(
                    Color.WHITE
            );
        });

        return btn;
    }
// ==========================================
// CARDS CON ICONOS
// ==========================================


// ==========================================
// COLORES ESTADOS
// ==========================================
class BaseRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(
            JTable table,
            Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column
    ) {

        JLabel c = (JLabel) super.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column
        );

        c.setOpaque(true);

        c.setBackground(Color.WHITE);

        // BORDE SOLO UNA VEZ (NO DOBLE 2px por celda)
        c.setBorder(null);
        return c;
    }
}
// ==========================================
// BOTÓN TABLA
// ==========================================
class ButtonRenderer extends JButton implements TableCellRenderer {

    public ButtonRenderer() {
        setText("Ver detalles");
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(true);

        setBackground(CREMA);
        setForeground(AZUL_OSCURO);
        setFont(new Font("Segoe UI", Font.BOLD, 12));
    }

    @Override
    public Component getTableCellRendererComponent(
            JTable table,
            Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column
    ) {
        return this;
    }
}
// ==========================================
// BUTTON EDITOR
// ==========================================
    class ButtonEditor
            extends DefaultCellEditor {

        private JButton button;

        public ButtonEditor(
                JCheckBox checkBox
        ) {

            super(checkBox);

            button = new JButton(
                    "Ver detalles"
            );

            button.setBackground(
                    CREMA
            );

            button.setForeground(
                    AZUL_OSCURO
            );

            button.addActionListener(e -> {

                JOptionPane.showMessageDialog(
                        null,
                        "Abrir detalles de postulación"
                );

                fireEditingStopped();
            });
        }

        @Override
        public Component getTableCellEditorComponent(
                JTable table,
                Object value,
                boolean isSelected,
                int row,
                int column
        ) {

            return button;
        }

        @Override
        public Object getCellEditorValue() {

            return "Ver detalles";
        }
    }

// ==========================================
// PANEL REDONDEADO
// ==========================================
    class RoundedPanel
            extends JPanel {

        private int radius;

        public RoundedPanel(
                int radius
        ) {

            this.radius = radius;

            setOpaque(
                    false
            );
        }

        @Override
        protected void paintComponent(
                Graphics g
        ) {

            Graphics2D g2
                    = (Graphics2D) g.create();

            g2.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON
            );

            g2.setColor(
                    getBackground()
            );

            g2.fillRoundRect(
                    0,
                    0,
                    getWidth(),
                    getHeight(),
                    radius,
                    radius
            );

            g2.dispose();

            super.paintComponent(g);
        }
    }

}
