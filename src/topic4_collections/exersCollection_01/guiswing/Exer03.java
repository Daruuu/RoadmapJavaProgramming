package topic4_collections.exersCollection_01.guiswing;

import javax.swing.*;
import java.awt.*;

public class Exer03 {
    public static void main(String[] args) {

        JFrame finestra = new JFrame();

        JLabel etiqueta = new JLabel("Etiqueta que mostra un text");
        JButton boto1 = new JButton("Acceptar");
        JButton boto2 = new JButton("Cancel·lar");

        //Ficar els components a la finestra
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 10, 10);
        finestra.getContentPane().setLayout(layout);
        finestra.getContentPane().add(etiqueta);
        finestra.getContentPane().add(boto1);
        finestra.getContentPane().add(boto2);

        String tipusDeLayout = finestra.getContentPane().getLayout().getClass().getSimpleName();
        finestra.setTitle("Distribució amb " + tipusDeLayout);

        //DibuixarLayouts.dibuixaComponents((JPanel) finestra.getContentPane());
        finestra.setSize(500, 260);
        finestra.setVisible(true);

        //Per finalitzar l'aplicació en tancar la finestra
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}