package CongruencialMult;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexis
 */
public class CongruencialMultiplicativoF {

    public static boolean isImparP(int num) {
        if ((num % 2 == 0) & (num % 5 == 0)) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] arg) {
        int operacion, semilla, a_mult = 0, b_aditv, mod;

        do {
            operacion = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n" + "Elija una Opción: \n"
                    + "1.- Sistema Decimal\n" + "2.- Sistema Binario\n" + " 3.<<Salir>>"));
            switch (operacion) {
                case 1:    //operacion=Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n"));     
                    semilla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la semilla"));
                    while (semilla % 2 == 0 || semilla % 5 == 0 || isImparP(semilla) == false) {
                        JOptionPane.showMessageDialog(null, "El valor ingresado no es correcto");
                        semilla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la semilla"));
                    }
                    if (isImparP(semilla) == true) {
                        int t = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor \"t\" entero para obtener el Multiplicador a"));
                        if (semilla > 0) {
                            Object[] numeros = {3, 11, 13, 19, 21, 27, 29, 37, 53, 59, 61, 67, 69, 77, 83, 91};
                            //int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor de los siguientes: 3,11,13,19,21,27,29,37,53,59,61,67,69,77,83,91"));
                            Object p = JOptionPane.showInputDialog(null, "Seleccione el valor de \"p\" ", "Elegir", JOptionPane.QUESTION_MESSAGE, null, numeros, numeros[0]);
                            a_mult = (200 * t) - (int) p;
                            //JOptionPane.showMessageDialog(null, a_mult);
                        } else {
                            JOptionPane.showMessageDialog(null, "Ingrese un Número Impar no divisible entre 2 o 5");
                        }
                    }
                    mod = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Modulo (Nº Repeticiones)"));
                    //int periodo_d = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Modulo"));
                    int resMod, periodo_g, numero;
                    if (mod >= 5) {
                        resMod = mod - 2;
                        //periodo_g = (int)(5/4 * (Math.pow(mod, resMod)));
                        //System.out.println("" + periodo_g);
                        for (int i = 0; i < mod; i++) {
                            numero = (a_mult * semilla) % mod;
                            //JOptionPane.showMessageDialog(null, "| " + i + " |   " + semilla + "  ");
                            semilla = numero;
                            System.out.println("| " + i + " |   " + semilla + "  ");
                        }
                   }
                    break;
                    
                case 2:
                    semilla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la semilla"));
                    while ( isImparP(semilla) == false) {
                        JOptionPane.showMessageDialog(null, "El valor ingresado no es correcto");
                        semilla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la semilla"));
                    }
                    if (isImparP(semilla) == true) {
                        int t = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor \"t\" entero para obtener el Multiplicador \"a\" "));
                        if (semilla > 0) {
                           a_mult = (8 * t) - 3;
                            //JOptionPane.showMessageDialog(null, a_mult);
                        } else {
                            JOptionPane.showMessageDialog(null, "Ingrese un Número entero");
                        }
                    }
                    mod = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Modulo (Nº Repeticiones)"));
                    //int periodo_d = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Modulo"));
                    int resMod2, numeroB;
                    if (mod >= 5) {
                        resMod2 = mod/4;
                        for (int i = 1; i <= resMod2; i++) {
                            numeroB = (a_mult * semilla) % mod;
                            //JOptionPane.showMessageDialog(null, "| " + i + " |   " + semilla + "  ");
                            semilla = numeroB;
                            System.out.println("| " + i + " |   " + semilla + "  ");
                        }
                   }
                    
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Elija una de las dos Opciones");
            }
        } while (operacion <= 3 || operacion > 3);
    }
}
