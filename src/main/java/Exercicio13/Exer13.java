package Exercicio13;

import javax.swing.JOptionPane;

public class Exer13 {

        public static void main(String[] args) {
            String numero1=JOptionPane.showInputDialog ("Digite o primeiro número:");
            String numero2=JOptionPane.showInputDialog("Digite o segundo número");
            String operador=JOptionPane.showInputDialog("Digite o operador");
            String MostreResultado = null;

            {
                if ( operador.equals  ("+") )


                    MostreResultado = String.valueOf(Float.parseFloat(numero1) + Float.parseFloat(numero2));
                else

                if ( operador.equals  ("-") )

                    MostreResultado =String.valueOf(Float.parseFloat(numero1) - Float.parseFloat(numero2));

                else

                if ( operador.equals  ("/") )


                    MostreResultado =String.valueOf(Float.parseFloat(numero1) / Float.parseFloat(numero2));

                else

                if ( operador.equals  ("*") )


                    MostreResultado =String.valueOf(Float.parseFloat(numero1) * Float.parseFloat(numero2));
                JOptionPane.showMessageDialog(null,"O Resultado é:"+ MostreResultado);
                System.exit( 0 );

            }
        }
    }

