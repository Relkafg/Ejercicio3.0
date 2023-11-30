package Ejercicio3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class VistaEmpleados extends JFrame {
    private MyList<Empleado> listaEmpleados;
    private JTextArea textoEmpleados;
    private JTextField campoNumero, campoNombre, campoFechaAlta, camposueldo, camposueldoMaximo;

    public VistaEmpleados() {
        listaEmpleados = new MyList<>();

        // Crear componentes
        textoEmpleados = new JTextArea(10, 20);
        JScrollPane scrollPane = new JScrollPane(textoEmpleados);
        JButton btnCrear = new JButton("Crear Empleado");
        JButton btnModificar = new JButton("Modificar Empleado");
        JButton btnBorrar = new JButton("Borrar Empleado");
        JButton btnAvanzar = new JButton("Avanzar");
        JButton btnRetroceder = new JButton("Retroceder");
        JButton btnFiltrar = new JButton("Filtrar por Fecha de Alta");

        campoNumero = new JTextField(10);
        campoNombre = new JTextField(10);
        campoFechaAlta = new JTextField(10);
        camposueldo = new JTextField(10);
        camposueldoMaximo = new JTextField(10);

        // Configurar diseño de la ventana
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        panelBotones.add(btnCrear);
        panelBotones.add(btnModificar);
        panelBotones.add(btnBorrar);
        panelBotones.add(btnAvanzar);
        panelBotones.add(btnRetroceder);
        panelBotones.add(btnFiltrar);

        JPanel panelCampos = new JPanel();
        panelCampos.setLayout(new GridLayout(5, 2));
        panelCampos.add(new JLabel("Número:"));
        panelCampos.add(campoNumero);
        panelCampos.add(new JLabel("Nombre:"));
        panelCampos.add(campoNombre);
        panelCampos.add(new JLabel("Fecha de Alta:"));
        panelCampos.add(campoFechaAlta);
        panelCampos.add(new JLabel("Atributo Libre 1:"));
        panelCampos.add(camposueldo);
        panelCampos.add(new JLabel("Atributo Libre 2:"));
        panelCampos.add(camposueldoMaximo);

        add(panelCampos, BorderLayout.SOUTH);
        add(panelBotones, BorderLayout.SOUTH);

        // Configurar acciones de los botones
        btnCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearEmpleado();
                actualizarTextoEmpleados();
            }
        });

        /*btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modificarEmpleado();
                actualizarTextoEmpleados();
            }
        });*/

        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                borrarEmpleado();
                actualizarTextoEmpleados();
            }
        });

        btnAvanzar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                avanzarEmpleado();
                actualizarTextoEmpleados();
            }
        });

        btnRetroceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retrocederEmpleado();
                actualizarTextoEmpleados();
            }
        });

        btnFiltrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filtrarPorFecha();
                actualizarTextoEmpleados();
            }
        });

        // Configurar ventana principal
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Gestión de Empleados");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void crearEmpleado() {
        // Obtener datos del formulario
        int num = Integer.parseInt(campoNumero.getText());
        String nombre = campoNombre.getText();
        Date fechaAlta = new Date(); // Aquí deberías convertir el String a Date según tu lógica
        Double sueldo = (double) Integer.parseInt(camposueldo.getText());
        Double sueldoMaximo = (double) Integer.parseInt(camposueldoMaximo.getText());
        // Crear empleado y agregarlo a la lista
        Empleado nuevoEmpleado = new Empleado(num, nombre, sueldo, sueldoMaximo);
        listaEmpleados.add(nuevoEmpleado);
    }

    private void modificarEmpleado() {
        // Obtener datos del formulario
        int numero = Integer.parseInt(campoNumero.getText());
        String nombre = campoNombre.getText();
        Date fechaAlta = new Date(); // Aquí deberías convertir el String a Date según tu lógica
        Double sueldo = (double) Integer.parseInt(camposueldo.getText());
        Double sueldoMaximo = (double) Integer.parseInt(camposueldoMaximo.getText());

        // Modificar empleado en la lista
        Empleado empleadoModificado = new Empleado(numero, nombre, sueldo, sueldoMaximo);
        // Aquí deberías obtener el índice del empleado que quieres modificar
        // y llamar al método modificar de la listaEmpleados
    }

    private void borrarEmpleado() {
        // Obtener datos del formulario
        int numero = Integer.parseInt(campoNumero.getText());

        // Borrar empleado de la lista
        // Aquí deberías obtener el índice del empleado que quieres borrar
        // y llamar al método borrar de la listaEmpleados
    }

    private void avanzarEmpleado() {
        // Avanzar en la lista de empleados
        // Aquí deberías llamar al método recorrerAdelante de la listaEmpleados
    }

    private void retrocederEmpleado() {
        // Retroceder en la lista de empleados
        // Aquí deberías llamar al método recorrerAtras de la listaEmpleados
    }

    private void filtrarPorFecha() {
        // Filtrar empleados por fecha de alta
        // Aquí deberías implementar la lógica de filtrado según la fecha de alta
    }

    private void actualizarTextoEmpleados() {
        // Actualizar el JTextArea con la información de los empleados en la lista
        // Puedes obtener la lista de empleados llamando a listaEmpleados.showMyList()
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VistaEmpleados();
            }
        });
    }
}
