/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Trabajador;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.DefaultCellEditor;

public class Postulaciones extends JFrame {

    // ==========================
    // COLORES WORKBRIDGE
    // ==========================
    private final Color AZUL_OSCURO
            = new Color(54, 73, 125);

    private final Color MORADO
            = new Color(171, 132, 187);

    private final Color CREMA
            = new Color(221, 216, 210);

    private final Color FONDO
            = new Color(240, 240, 240);

    // ==========================
    // COMPONENTES
    // ==========================
    private JPanel panelSidebar;
    private JPanel panelContenido;

    public Postulaciones() {

        configurarVentana();
        iniciarComponentes();
    }
private void configurarVentana() {

    setTitle("WorkBridge - Mis Postulaciones");

    setSize(1400, 800);

    setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
    );

    setLocationRelativeTo(null);

    setResizable(false);

    setLayout(new BorderLayout());

    getContentPane().setBackground(
            FONDO
    );
}


    private void iniciarComponentes() {

        // ==========================
        // PANEL PRINCIPAL
        // ==========================
        JPanel panelPrincipal
                = new JPanel(new BorderLayout());

        // ==========================
        // SIDEBAR IZQUIERDO
        // ==========================
        panelSidebar = new JPanel();

        panelSidebar.setBackground(
                AZUL_OSCURO
        );

        panelSidebar.setPreferredSize(
                new Dimension(270, 800)
        );

        panelSidebar.setLayout(
                new BoxLayout(
                        panelSidebar,
                        BoxLayout.Y_AXIS
                )
        );

        panelSidebar.setAlignmentX(
                Component.LEFT_ALIGNMENT
        );

        panelSidebar.setBorder(
                new EmptyBorder(
                        25,
                        5,
                        25,
                        10
                )
        );

        // ==========================
        // LOGO
        // ==========================
        JLabel lblLogo = new JLabel(
                "<html><center>"
                + "<h1 style='color:white'>Work<br>Bridge</h1>"
                + "<span style='color:white'>"
                + "CONECTAMOS TALENTO"
                + "</span>"
                + "</center></html>"
        );

        lblLogo.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        panelSidebar.add(lblLogo);

        panelSidebar.add(
                Box.createRigidArea(
                        new Dimension(0, 30)
                )
        );

        // ==========================
        // MENÚ
        // ==========================
        panelSidebar.add(crearMenu("🏠 Inicio"));
        panelSidebar.add(crearMenu("🏢 Mi empresa"));
        panelSidebar.add(crearMenu("📄 Mis Vacantes"));

        panelSidebar.add(
                crearMenuSeleccionado(
                        "📑 Postulaciones"
                )
        );

        panelSidebar.add(crearMenu("📅 Entrevistas"));
        panelSidebar.add(crearMenu("💬 Comunicaciones"));
        panelSidebar.add(crearMenu("🔔 Notificaciones"));

        panelSidebar.add(
                Box.createVerticalGlue()
        );

        panelSidebar.add(
                crearMenu("⚙ Configuración")
        );

        // ==========================
        // USUARIO ABAJO
        // ==========================
        JPanel panelUser
                = new JPanel(
                        new FlowLayout(
                                FlowLayout.LEFT
                        )
                );

        panelUser.setOpaque(false);

        JLabel lblUser
                = new JLabel(
                        "👤 TechCorp S.A."
                );

        lblUser.setForeground(
                Color.WHITE
        );

        lblUser.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        20
                )
        );

        panelUser.add(lblUser);

        panelSidebar.add(panelUser);

        // ==========================
        // PANEL CONTENIDO
        // ==========================
        panelContenido
                = new JPanel();

        panelContenido.setBackground(
                Color.WHITE
        );

        panelContenido.setLayout(
                new BorderLayout()
        );     
    panelPrincipal.add(
            panelSidebar,
            BorderLayout.WEST
    );

    panelPrincipal.add(
            panelContenido,
            BorderLayout.CENTER
    );

    crearHeader();
    crearTablaPostulaciones();

    add(panelPrincipal);
    }

    // ==========================
    // MENÚ NORMAL
    // ==========================
    // ==========================
    // MENÚ SELECCIONADO
    // ==========================
    private JButton crearMenuSeleccionado(
            String texto
    ) {

        JButton btn
                = crearMenu(texto);

        btn.setBackground(
                MORADO
        );

        return btn;
    }

    public static void main(
            String[] args
    ) {

        SwingUtilities.invokeLater(() -> {

            new Postulaciones()
                    .setVisible(true);
        });
    }

    private void crearHeader() {

        // ==========================
        // PANEL GENERAL SUPERIOR
        // ==========================
        JPanel panelTop
                = new JPanel();

        panelTop.setLayout(
                new BorderLayout()
        );

        panelTop.setBackground(
                Color.WHITE
        );

        panelTop.setBorder(
                new EmptyBorder(
                        20,
                        25,
                        20,
                        25
                )
        );

        // ==========================
        // PANEL IZQUIERDO
        // ==========================
        JPanel panelTitulo
                = new JPanel();

        panelTitulo.setOpaque(false);

        panelTitulo.setLayout(
                new BoxLayout(
                        panelTitulo,
                        BoxLayout.Y_AXIS
                )
        );

        JLabel lblTitulo
                = new JLabel(
                        "Mis Postulaciones"
                );

        lblTitulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        30
                )
        );

        lblTitulo.setForeground(
                AZUL_OSCURO
        );

        JLabel lblFecha
                = new JLabel(
                        "Domingo, 7 de junio de 2026"
                );

        lblFecha.setForeground(
                Color.GRAY
        );

        lblFecha.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        15
                )
        );

        panelTitulo.add(lblTitulo);
        panelTitulo.add(lblFecha);

        // ==========================
        // PANEL DERECHO
        // ==========================
        JPanel panelDerecha
                = new JPanel(
                        new FlowLayout(
                                FlowLayout.RIGHT,
                                15,
                                5
                        )
                );

        panelDerecha.setOpaque(false);

        // ==========================
        // BUSCADOR
        // ==========================
        JTextField txtBuscar
                = new JTextField(
                        "Buscar candidatos"
                );

        txtBuscar.setPreferredSize(
                new Dimension(
                        250,
                        38
                )
        );

        txtBuscar.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        14
                )
        );

        txtBuscar.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(
                                new Color(
                                        210,
                                        210,
                                        210
                                )
                        ),
                        BorderFactory.createEmptyBorder(
                                5,
                                12,
                                5,
                                12
                        )
                )
        );

        // ==========================
        // ICONOS
        // ==========================
        JButton btnNoti
                = new JButton("🔔");

        JButton btnPerfil
                = new JButton("👤");

        estilizarIcono(btnNoti);
        estilizarIcono(btnPerfil);

        panelDerecha.add(txtBuscar);
        panelDerecha.add(btnNoti);
        panelDerecha.add(btnPerfil);

        // ==========================
        // AGREGAR ARRIBA
        // ==========================
        panelTop.add(
                panelTitulo,
                BorderLayout.WEST
        );

        panelTop.add(
                panelDerecha,
                BorderLayout.EAST
        );

        // ==========================
        // CARDS
        // ==========================
        JPanel panelCards
                = new JPanel(
                        new GridLayout(
                                1,
                                5,
                                20,
                                0
                        )
                );

        panelCards.setBackground(
                Color.WHITE
        );

        panelCards.setBorder(
                new EmptyBorder(
                        10,
                        25,
                        15,
                        25
                )
        );

        panelCards.add(
                crearCard(
                        "5",
                        "Total postulaciones"
                )
        );

        panelCards.add(
                crearCard(
                        "2",
                        "En revisión"
                )
        );

        panelCards.add(
                crearCard(
                        "3",
                        "Entrevista"
                )
        );

        panelCards.add(
                crearCard(
                        "1",
                        "Aceptada"
                )
        );

        panelCards.add(
                crearCard(
                        "1",
                        "Rechazada"
                )
        );

        // ==========================
        // PANEL NORTE
        // ==========================
        JPanel panelNorte
                = new JPanel(
                        new BorderLayout()
                );

        panelNorte.setBackground(
                new Color(212, 205, 197)
        );

        panelNorte.add(
                panelTop,
                BorderLayout.NORTH
        );

        panelNorte.add(
                panelCards,
                BorderLayout.SOUTH
        );

        panelContenido.add(
                panelNorte,
                BorderLayout.NORTH
        );
    }

    private void estilizarIcono(
            JButton boton
    ) {

        boton.setFocusPainted(false);

        boton.setBorderPainted(false);

        boton.setContentAreaFilled(false);

        boton.setFont(
                new Font(
                        "Segoe UI Emoji",
                        Font.PLAIN,
                        22
                )
        );

        boton.setCursor(
                new Cursor(
                        Cursor.HAND_CURSOR
                )
        );
    }

    private JButton crearTab(
            String texto,
            boolean activo
    ) {

        JButton btn
                = new JButton(texto);

        btn.setFocusPainted(false);

        btn.setBorderPainted(false);

        btn.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        15
                )
        );

        btn.setPreferredSize(
                new Dimension(
                        140,
                        40
                )
        );

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

        return btn;
    }

    private void crearTablaPostulaciones() {

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
                        25,
                        25,
                        25
                )
        );

        // ==========================
        // TABS
        // ==========================
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

        // ==========================
        // TABLA
        // ==========================
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

        tabla.setRowHeight(42);

        tabla.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        14
                )
        );

        tabla.setShowVerticalLines(true);
        tabla.setShowHorizontalLines(true);

        tabla.setGridColor(
                new Color(
                        220,
                        220,
                        220
                )
        );

        tabla.setSelectionBackground(
                new Color(
                        235,
                        235,
                        255
                )
        );

        // ==========================
        // HEADER
        // ==========================
        tabla.getTableHeader().setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        14
                )
        );

        tabla.getTableHeader().setBackground(
                new Color(
                        210,
                        225,
                        240
                )
        );

        tabla.getTableHeader().setForeground(
                Color.BLACK
        );

        tabla.getTableHeader().setPreferredSize(
                new Dimension(
                        0,
                        40
                )
        );

        // ==========================
        // RENDER ESTADOS
        // ==========================
        tabla.getColumnModel()
                .getColumn(4)
                .setCellRenderer(
                        new EstadoRenderer()
                );

        // ==========================
        // BOTON TABLA
        // ==========================
        
        
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

        // ancho columnas
        tabla.getColumnModel()
                .getColumn(0)
                .setPreferredWidth(40);

        tabla.getColumnModel()
                .getColumn(5)
                .setPreferredWidth(140);

        JScrollPane scroll
                = new JScrollPane(tabla);

        scroll.setBorder(
                BorderFactory.createLineBorder(
                        new Color(
                                210,
                                210,
                                210
                        )
                )
        );

        panelCentro.add(
                panelTabs,
                BorderLayout.NORTH
        );

        panelCentro.add(
                scroll,
                BorderLayout.CENTER
        );

        panelContenido.add(
                panelCentro,
                BorderLayout.CENTER
        );
    }

    class EstadoRenderer
            extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(
                JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column
        ) {

            JLabel lbl
                    = (JLabel) super
                            .getTableCellRendererComponent(
                                    table,
                                    value,
                                    isSelected,
                                    hasFocus,
                                    row,
                                    column
                            );

            lbl.setHorizontalAlignment(
                    SwingConstants.CENTER
            );

            String estado
                    = value.toString();

            if (estado.equals("En revisión")) {

                lbl.setForeground(
                        new Color(
                                52,
                                120,
                                246
                        )
                );
            } else if (estado.equals("Entrevista")) {

                lbl.setForeground(
                        new Color(
                                145,
                                90,
                                220
                        )
                );
            } else if (estado.equals("Aceptada")) {

                lbl.setForeground(
                        new Color(
                                30,
                                170,
                                70
                        )
                );
            } else {

                lbl.setForeground(
                        new Color(
                                220,
                                50,
                                50
                        )
                );
            }

            return lbl;
        }
    }

    private JPanel crearCard(
            String numero,
            String texto
    ) {

        RoundedPanel panel
                = new RoundedPanel(25);

        panel.setLayout(
                new BoxLayout(
                        panel,
                        BoxLayout.Y_AXIS
                )
        );

        panel.setBackground(
        new Color(212, 205, 197)
        );

        panel.setBorder(
                new EmptyBorder(
                        18,
                        20,
                        18,
                        20
                )
        );

        panel.setPreferredSize(
                new Dimension(
                        170,
                        95
                )
        );

        JLabel lblNumero
                = new JLabel(numero);

        lblNumero.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        28
                )
        );

        lblNumero.setForeground(
                MORADO
        );

        JLabel lblTexto
                = new JLabel(texto);

        lblTexto.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        13
                )
        );

        lblTexto.setForeground(
                Color.DARK_GRAY
        );

        panel.add(lblNumero);
        panel.add(Box.createRigidArea(
                new Dimension(0, 6)
        ));
        panel.add(lblTexto);

        return panel;
    }

    private JButton crearMenu(
            String texto
    ) {

        JButton btn
                = new JButton(texto);

        btn.setMaximumSize(
                new Dimension(
                        250,
                        52
                )
        );

        btn.setPreferredSize(
                new Dimension(
                        230,
                        52
                )
        );

        btn.setBackground(
                AZUL_OSCURO
        );

        btn.setForeground(
                Color.WHITE
        );

        btn.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        20
                )
        );

        btn.setBorder(
                new EmptyBorder(
                        8,
                        8,
                        8,
                        8
                )
        );

        btn.setFocusPainted(false);

        btn.setBorderPainted(false);

        btn.setHorizontalAlignment(
                SwingConstants.LEFT
        );

        btn.setCursor(
                new Cursor(
                        Cursor.HAND_CURSOR
                )
        );

        // HOVER
        btn.addMouseListener(
                new java.awt.event.MouseAdapter() {

            @Override
            public void mouseEntered(
                    java.awt.event.MouseEvent evt
            ) {

                btn.setBackground(
                        new Color(
                                80,
                                95,
                                150
                        )
                );
            }

            @Override
            public void mouseExited(
                    java.awt.event.MouseEvent evt
            ) {

                btn.setBackground(
                        AZUL_OSCURO
                );
            }
        }
        );

        return btn;
    }

    class ButtonRenderer
            extends JButton
            implements TableCellRenderer {

        public ButtonRenderer() {

            setText("Ver detalles");

            setFocusPainted(false);

            setBorderPainted(false);

            setBackground(
                    new Color(
                            229,
                            220,
                            206
                    )
            );

            setFont(
                    new Font(
                            "Segoe UI",
                            Font.BOLD,
                            12
                    )
            );

            setCursor(
                    new Cursor(
                            Cursor.HAND_CURSOR
                    )
            );
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

                button.setFocusPainted(false);

                button.setBackground(
                        new Color(
                                229,
                                220,
                                206
                        )
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

    class RoundedPanel extends JPanel {

            private int radius;

            public RoundedPanel(
                    int radius
            ) {

                this.radius = radius;

                setOpaque(false);
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
