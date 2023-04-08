package topic4_collections.guiswing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Exer02 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Titulo 02");

        //Crear diferentes componentes de Swing
        JLabel label = new JLabel("Etiqueta que muestra texto");
        JButton button = new JButton("Boton");

        JComboBox listaDesplegable = new JComboBox();
        listaDesplegable.addItem("Opcion 1");
        listaDesplegable.addItem("Opcion 2");
        listaDesplegable.addItem("Opcion 3");

        JList list = new JList();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Opcion 01");
        arrayList.add("Opcion 02");
        list.setListData(arrayList.toArray());

        JRadioButton radioButton1 = new JRadioButton("Opcion 001");

        JTextField textField = new JTextField();

        // agregar componentes a la ventana
        frame.getContentPane().setLayout(new GridLayout(6, 1));
        frame.getContentPane().add(label);
        frame.getContentPane().add(button);
        frame.getContentPane().add(listaDesplegable);
        frame.getContentPane().add(list);
        frame.getContentPane().add(radioButton1);
        frame.getContentPane().add(textField);

        // agregar margen al contenido de la ventana

        ((JPanel) frame.getContentPane()).setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        frame.setSize(500, 280);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
