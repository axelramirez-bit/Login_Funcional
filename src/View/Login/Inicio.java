package View.Login;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Inicio extends JFrame {

    // ==========================
    // COLORES WORKBRIDGE
    // ==========================
    private final Color AZUL_OSCURO
            = new Color(14, 76, 146);

    private final Color AZUL_CLARO
            = new Color(240, 244, 248);

    private final Color TEXTO_GRIS
            = new Color(110, 110, 110);

    private final Color BORDE
            = new Color(225, 225, 225);

    // ==========================
    // SCALING
    // ==========================
    private final Dimension SCREEN
            = Toolkit.getDefaultToolkit()
                    .getScreenSize();

    private final double SCALE_W
            = SCREEN.getWidth() / 1400.0;

    private final double SCALE_H
            = SCREEN.getHeight() / 900.0;

    private int sw(int x) {
        return (int) (x * SCALE_W);
    }

    private int sh(int y) {
        return (int) (y * SCALE_H);
    }

    // ==========================
    // COMPONENTES
    // ==========================
    private JButton btnIngresar;
    private JButton btnRegistrarse;
    private JButton btnBuscar;
    private JButton btnPublicar;

    public Inicio() {

        configurarVentana();

        iniciarComponentes();
    }

    private void configurarVentana() {

        setTitle("WorkBridge");

        setSize(
                sw(1400),
                sh(900)
        );

        setMinimumSize(
                new Dimension(
                        sw(1200),
                        sh(750)
                )
        );

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        setLocationRelativeTo(null);

        setExtendedState(
                JFrame.MAXIMIZED_BOTH
        );

        getContentPane().setBackground(
                AZUL_CLARO
        );

        setLayout(
                new BorderLayout()
        );
    }

    private ImageIcon cargarIcono(
            String ruta,
            int width,
            int height
    ) {

        try {

            ImageIcon icon
                    = new ImageIcon(
                            getClass()
                                    .getResource(ruta)
                    );

            Image img
                    = icon.getImage()
                            .getScaledInstance(
                                    width,
                                    height,
                                    Image.SCALE_SMOOTH
                            );

            return new ImageIcon(img);

        } catch (Exception e) {

            System.out.println(
                    "No se pudo cargar: "
                    + ruta
            );

            return null;
        }
    }

    private void iniciarComponentes() {

        // ==========================
        // PANEL PRINCIPAL
        // ==========================
        JPanel mainPanel = new JPanel(
                new BorderLayout()
        );

        mainPanel.setBackground(
                AZUL_CLARO
        );

        add(mainPanel);

        // ==========================
        // NAVBAR
        // ==========================
        JPanel navbar = new JPanel(
                new BorderLayout()
        );

        navbar.setBackground(
                Color.WHITE
        );

        navbar.setBorder(
                BorderFactory.createMatteBorder(
                        0, 0, 1, 0,
                        new Color(220, 220, 220)
                )
        );

        navbar.setPreferredSize(
                new Dimension(
                        getWidth(),
                        sh(70)
                )
        );

        // ==========================
        // IZQUIERDA NAVBAR
        // ==========================
        JPanel leftNav = new JPanel(
                new FlowLayout(
                        FlowLayout.LEFT,
                        sw(30),
                        sh(10)
                )
        );

        leftNav.setOpaque(false);

        JLabel lblLogo = new JLabel(
                cargarIcono(
                        "/Imagen/logo_Workbridge.png",
                        sw(130),
                        sh(50)
                )
        );

        leftNav.add(lblLogo);

        String[] menus = {
            "Inicio",
            "Empleados",
            "Empresas",
            "Talentos"
        };

        for (String item : menus) {

            JButton btn
                    = new JButton(item);

            btn.setBorderPainted(false);
            btn.setContentAreaFilled(false);
            btn.setFocusPainted(false);

            btn.setForeground(
                    TEXTO_GRIS
            );

            btn.setFont(
                    new Font(
                            "Segoe UI",
                            Font.PLAIN,
                            sw(14)
                    )
            );

            btn.setCursor(
                    new Cursor(
                            Cursor.HAND_CURSOR
                    )
            );

            leftNav.add(btn);
        }

        // ==========================
        // DERECHA NAVBAR
        // ==========================
        JPanel rightNav = new JPanel(
                new FlowLayout(
                        FlowLayout.RIGHT,
                        sw(15),
                        sh(10)
                )
        );

        rightNav.setOpaque(false);

        btnIngresar
                = new JButton("Ingresar");

        btnIngresar.setPreferredSize(
                new Dimension(
                        sw(120),
                        sh(38)
                )
        );

        btnIngresar.setBackground(
                Color.WHITE
        );

        btnIngresar.setForeground(
                AZUL_OSCURO
        );

        btnIngresar.setFocusPainted(false);

        btnIngresar.setBorder(
                BorderFactory.createLineBorder(
                        AZUL_OSCURO
                )
        );

        btnRegistrarse
                = new JButton("Registrarse");

        btnRegistrarse.setPreferredSize(
                new Dimension(
                        sw(130),
                        sh(38)
                )
        );

        btnRegistrarse.setBackground(
                AZUL_OSCURO
        );
        btnRegistrarse.setOpaque(true);
        btnRegistrarse.setContentAreaFilled(true);
        btnRegistrarse.setForeground(
                Color.WHITE
        );

        btnRegistrarse.setFocusPainted(false);
        btnRegistrarse.setBorderPainted(false);
        btnRegistrarse.setForeground(Color.WHITE);
        rightNav.add(btnIngresar);
        rightNav.add(btnRegistrarse);

        navbar.add(
                leftNav,
                BorderLayout.WEST
        );

        navbar.add(
                rightNav,
                BorderLayout.EAST
        );

        mainPanel.add(
                navbar,
                BorderLayout.NORTH
        );

        // ==========================
        // HERO SECTION
        // ==========================
        JPanel heroPanel = new JPanel(

        );
        heroPanel.setLayout(
                new GridBagLayout()
        );

        heroPanel.setOpaque(false);

        heroPanel.setBorder(
                new EmptyBorder(
                        sh(20),
                        sw(80),
                        sh(20),
                        sw(80)
                )
        );

        // ==========================
        // PANEL IZQUIERDO
        // ==========================
        JPanel leftHero = new JPanel();

        leftHero.setOpaque(false);

        leftHero.setLayout(
                new BoxLayout(
                        leftHero,
                        BoxLayout.Y_AXIS
                )
        );
        
        JLabel titulo = new JLabel(
                "<html>"
                + "<span style='font-size:52px;'>"
                + "<b>"
                + "<font color='#0E4C92'>Conectamos</font><br>"
                + "<font color='#A6C6D0'>talento.</font><br>"
                + "<font color='#0E4C92'>Generamos</font><br>"
                + "<font color='#8B7AD9'>Oportunidades.</font>"
                + "</b>"
                + "</span>"
                + "</html>"
        );

        JLabel descripcion
                = new JLabel(
                        "<html>"
                        + "La plataforma profesional de Guatemala donde "
                        + "empresas líderes y el mejor talento del país "
                        + "se encuentran, conectan y crecen juntos."
                        + "</html>"
                );

        descripcion.setForeground(
                TEXTO_GRIS
        );

        descripcion.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        sw(16)
                )
        );

        btnBuscar
                = new JButton(
                        "Buscar empleos"
                );

        btnBuscar.setPreferredSize(
                new Dimension(sw(220), sh(52))
        );

        btnBuscar.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        sw(15)
                )
        );

        btnBuscar.setBorder(
                BorderFactory.createLineBorder(
                        AZUL_OSCURO,
                        2
                )
        );

        btnBuscar.setBackground(
                Color.WHITE
        );

        btnBuscar.setForeground(
                AZUL_OSCURO
        );

        btnBuscar.setFocusPainted(false);

        btnBuscar.setBorder(
                BorderFactory.createLineBorder(
                        AZUL_OSCURO
                )
        );

        btnPublicar
                = new JButton(
                        "Publicar vacantes"
                );

        btnPublicar.setPreferredSize(
                new Dimension(sw(220), sh(52))
        );

        btnPublicar.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        sw(15)
                )
        );

        btnPublicar.setText(
                "Publicar vacantes"
        );

        btnPublicar.setBackground(
                AZUL_OSCURO
        );
        btnPublicar.setOpaque(true);
        btnPublicar.setContentAreaFilled(true);
        btnPublicar.setForeground(
                Color.WHITE
        );

        btnPublicar.setFocusPainted(false);

        JPanel panelBotones
                = new JPanel(
                        new FlowLayout(
                                FlowLayout.LEFT
                        )
                );

        panelBotones.setOpaque(false);

        panelBotones.add(btnBuscar);
        panelBotones.add(btnPublicar);

        leftHero.add(titulo);
        leftHero.add(
                Box.createVerticalStrut(
                        sh(25)
                )
        );
        
        leftHero.add(descripcion);
        leftHero.add(
                Box.createVerticalStrut(
                        sh(30)
                )
        );
        
        leftHero.add(panelBotones);
        leftHero.add(
                Box.createVerticalStrut(
                        sh(40)
                )
        );
        JPanel panelStats
        = new JPanel(
                new FlowLayout(
                        FlowLayout.LEFT,
                        sw(40),
                        0
                )
        );

panelStats.setOpaque(false);

panelStats.setBorder(
        new EmptyBorder(
                sh(15),
                sw(100),
                sh(25),
                0
        )
);

panelStats.add(
        crearStat(
                "+8,400",
                "Profesionales activos"
        )
);

panelStats.add(
        crearStat(
                "+1,200",
                "Empresas registradas"
        )
);

panelStats.add(
        crearStat(
                "+3,500",
                "Vacantes publicadas"
        )
);


        // ==========================
// PANEL DERECHO
// ==========================
        RoundedPanel cardPerfil
                = new RoundedPanel(
                        sw(25)
                );

        cardPerfil.setBackground(
                Color.WHITE
        );

        cardPerfil.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(
                                new Color(210, 210, 210)
                        ),
                        new EmptyBorder(
                                sh(25),
                                sw(25),
                                sh(25),
                                sw(25)
                        )
                )
        );

        cardPerfil.setLayout(
                new BoxLayout(
                        cardPerfil,
                        BoxLayout.Y_AXIS
                )
        );
        cardPerfil.setPreferredSize(
                new Dimension(
                        sw(550),
                        sh(280)
                )
        );
// ==========================
// HEADER PERFIL
// ==========================
        JPanel headerPerfil
                = new JPanel(
                        new FlowLayout(
                                FlowLayout.LEFT
                        )
                );

        headerPerfil.setOpaque(false);

        RoundedPanel avatar
                = new RoundedPanel(
                        sw(60)
                );

        avatar.setPreferredSize(
                new Dimension(
                        sw(70),
                        sh(70)
                )
        );

        avatar.setMaximumSize(
                new Dimension(
                        sw(70),
                        sh(70)
                )
        );

        avatar.setBackground(
                AZUL_OSCURO
        );

        avatar.setLayout(
                new GridBagLayout()
        );

        JLabel lblCJ
                = new JLabel(
                        cargarIcono(
                                "/Imagen/icon_usuario.png",
                                sw(32),
                                sh(32)
                        )
                );
        lblCJ.setForeground(
                Color.WHITE
        );

        lblCJ.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        sw(28)
                )
        );

        avatar.add(lblCJ);

        JPanel infoPerfil
                = new JPanel();

        infoPerfil.setOpaque(false);

        infoPerfil.setLayout(
                new BoxLayout(
                        infoPerfil,
                        BoxLayout.Y_AXIS
                )
        );

        JLabel lblNombre
                = new JLabel(
                        "Camilo Jaimes Ocaziónez."
                );

        lblNombre.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        sw(18)
                )
        );

        JLabel lblCargo
                = new JLabel(
                        "Chief Communications - 5 años de experiencia"
                );

        lblCargo.setForeground(
                TEXTO_GRIS
        );

        JLabel lblUbicacion
                = new JLabel(
                        "Guatemala, Ciudad de Guatemala"
                );

        lblUbicacion.setForeground(
                new Color(
                        77,
                        122,
                        255
                )
        );

        infoPerfil.add(lblNombre);
        infoPerfil.add(lblCargo);
        infoPerfil.add(lblUbicacion);

        headerPerfil.add(avatar);
        headerPerfil.add(infoPerfil);
        GridBagConstraints gbc
                = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.weightx = 0.48;
        gbc.fill = GridBagConstraints.HORIZONTAL;;

        heroPanel.add(leftHero, gbc);

        gbc.gridx = 1;
        gbc.weightx = 0.52;

        heroPanel.add(cardPerfil, gbc);
// ==========================
// TAGS
// ==========================
        JPanel panelTags
                = new JPanel(
                        new FlowLayout(
                                FlowLayout.LEFT,
                                10,
                                10
                        )
                );

        panelTags.setOpaque(false);

        String[] tags = {
            "Chief Communications",
            "Marketing Officer",
            "MODEL UI",
            "Full Stack Developer"
        };

        Color[] colores = {
            new Color(198, 231, 183),
            new Color(180, 216, 228),
            new Color(231, 190, 216),
            new Color(255, 198, 198)
        };

        for (int i = 0; i < tags.length; i++) {

            JLabel tag
                    = new JLabel(
                            tags[i]
                    );

            tag.setOpaque(true);

            tag.setBackground(
                    colores[i]
            );
            tag.setFont(
                    new Font(
                            "Segoe UI",
                            Font.BOLD,
                            sw(11)
                    )
            );
            tag.setBorder(
                    new EmptyBorder(
                            7,
                            14,
                            7,
                            14
                    )
            );

            panelTags.add(tag);
        }

// ==========================
// ACTIVIDAD RECIENTE
// ==========================
        JLabel lblActividad
                = new JLabel(
                        "Comportamientos recientes"
                );

        lblActividad.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        sw(18)
                )
        );

        RoundedPanel actividad1
                = new RoundedPanel(
                        sw(12)
                );

        actividad1.setBackground(
                new Color(
                        251,
                        245,
                        215
                )
        );

        actividad1.setPreferredSize(
                new Dimension(
                        sw(380),
                        sh(45)
                )
        );

        actividad1.setMaximumSize(
                new Dimension(
                        sw(380),
                        sh(45)
                )
        );

        actividad1.setLayout(
                new FlowLayout(
                        FlowLayout.LEFT
                )
        );

        actividad1.add(
                new JLabel(
                        "UI/UX developer - Junior lv3"
                )
        );

        RoundedPanel actividad2
                = new RoundedPanel(
                        sw(12)
                );

        actividad2.setBackground(
                new Color(
                        251,
                        245,
                        215
                )
        );

        actividad2.setPreferredSize(
                new Dimension(
                        sw(380),
                        sh(45)
                )
        );

        actividad2.setMaximumSize(
                new Dimension(
                        sw(380),
                        sh(45)
                )
        );

        actividad2.setLayout(
                new FlowLayout(
                        FlowLayout.LEFT
                )
        );

        actividad2.add(
                new JLabel(
                        "Innovating - Corporation SA"
                )
        );

        cardPerfil.add(headerPerfil);
        cardPerfil.add(
                Box.createVerticalStrut(
                        sh(15)
                )
        );
        cardPerfil.add(panelTags);
        cardPerfil.add(
                Box.createVerticalStrut(sh(8))
        );
        cardPerfil.add(lblActividad);
        cardPerfil.add(
                Box.createVerticalStrut(
                        sh(10)
                )
        );
        cardPerfil.add(actividad1);
        cardPerfil.add(
                Box.createVerticalStrut(
                        sh(10)
                )
        );
        cardPerfil.add(actividad2);
    


// ==========================
// AGREGAR HERO
// ==========================
        mainPanel.add(
                heroPanel,
                BorderLayout.CENTER
        );
leftHero.add(panelStats);
leftHero.add(panelBotones);

leftHero.add(
    Box.createVerticalStrut(
        sh(40)
    )
);

leftHero.add(panelStats);
  
        agregarHover(
                btnIngresar,
                Color.WHITE,
                new Color(235, 235, 235)
        );

        agregarHover(
                btnRegistrarse,
                AZUL_OSCURO,
                new Color(25, 90, 165)
        );

        agregarHover(
                btnBuscar,
                Color.WHITE,
                new Color(235, 235, 235)
        );

        agregarHover(
                btnPublicar,
                AZUL_OSCURO,
                new Color(25, 90, 165)
        );
    }

    private JPanel crearStat(
            String numero,
            String texto
    ) {

        JPanel panel
                = new JPanel();

        panel.setOpaque(false);

        panel.setLayout(
                new BoxLayout(
                        panel,
                        BoxLayout.Y_AXIS
                )
        );

        JLabel lblNumero
                = new JLabel(numero);

        lblNumero.setForeground(
                AZUL_OSCURO
        );

        lblNumero.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        sw(32)
                )
        );

        JLabel lblTexto
                = new JLabel(texto);

        lblTexto.setForeground(
                TEXTO_GRIS
        );

        panel.add(lblNumero);
        panel.add(lblTexto);

        return panel;

    }

// ==========================
// PANEL REDONDEADO
// ==========================
    class RoundedPanel extends JPanel {

        private final int radius;

        public RoundedPanel(int radius) {

            this.radius = radius;

            setOpaque(false);
        }

@Override
protected void paintComponent(Graphics g) {

    Graphics2D g2 = (Graphics2D) g.create();

    g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
    );

    g2.setColor(
            new Color(0,0,0,20)
    );

    g2.fillRoundRect(
            4,
            4,
            getWidth()-4,
            getHeight()-4,
            radius,
            radius
    );

    g2.setColor(
            getBackground()
    );

    g2.fillRoundRect(
            0,
            0,
            getWidth()-4,
            getHeight()-4,
            radius,
            radius
    );

    g2.dispose();
}
    }
    private void agregarHover(
            JButton boton,
            Color normal,
            Color hover
    ) {

        boton.setBackground(normal);

        boton.addMouseListener(
                new java.awt.event.MouseAdapter() {

            @Override
            public void mouseEntered(
                    java.awt.event.MouseEvent evt
            ) {

                boton.setBackground(
                        hover
                );
            }

            @Override
            public void mouseExited(
                    java.awt.event.MouseEvent evt
            ) {

                boton.setBackground(
                        normal
                );
            }
        });
    }
  
    // ==========================
// MAIN
// ==========================

    public static void main(
            String[] args
    ) {

        SwingUtilities.invokeLater(() -> {

            try {

                UIManager.setLookAndFeel(
                        UIManager
                                .getSystemLookAndFeelClassName()
                );

            } catch (Exception e) {
            }

            new Inicio()
                    .setVisible(true);
        });
    }
}
