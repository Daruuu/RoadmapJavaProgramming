package topic4_collections.exersCollection_01.guiswing;

import javax.swing.*;
import java.awt.*;

public class Exer04 {

    public static void main(String[] args) {

        JFrame finestra = new JFrame();

        JButton boto1 = new JButton("Botó 1 - NORTH");
        JButton boto2 = new JButton("Botó 2 - SOUTH");
        JButton boto3 = new JButton("Botó 3 - EAST");
        JButton boto4 = new JButton("Botó 4 - WEST");
        JButton boto5 = new JButton("Botó 5 - CENTER");

        //Ficar els components a la finestra
        BorderLayout layout = new BorderLayout();
        finestra.getContentPane().setLayout(layout);
        finestra.getContentPane().add(boto1, BorderLayout.NORTH);
        finestra.getContentPane().add(boto2, BorderLayout.SOUTH);
        finestra.getContentPane().add(boto3, BorderLayout.EAST);
        //finestra.getContentPane().add(boto4, BorderLayout.WEST);
        finestra.getContentPane().add(boto5, BorderLayout.CENTER);

        String tipusDeLayout = finestra.getContentPane().getLayout().getClass().getSimpleName();
        finestra.setTitle("Distribució amb " + tipusDeLayout);

        //DibuixarLayouts.dibuixaComponents((JPanel) finestra.getContentPane());
        finestra.setSize(500, 260);
        finestra.setVisible(true);

        //Per finalitzar l'aplicació en tancar la finestra
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
