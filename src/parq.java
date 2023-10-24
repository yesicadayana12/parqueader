import javax.swing.*;

public class parq {
    public static void main(String[] args) {

        int placas;
        double valor, dato = 1;
        double resta, mult;
        int carro = 10, moto = 10;
        int item;
        int dat = 1;

        JOptionPane.showMessageDialog(null, "======================================= \n" +
                "bienvenido al parqueadero V \n" +
                "el costo por hora\n" +
                "carro: 2000\n" + "moto: 1000\n" +
                "=================================================");

        item = Integer.parseInt(JOptionPane.showInputDialog(null, "1-desea ingresar  carro  \n" +
                "2-desea ingresar moto \n" + "3-salir \n"));

        switch ((int) item) {
            case 1:
                int[] carros = new int[3];
            {
                for (int i = 0; i < 3; i++) ;
                JOptionPane.showMessageDialog(null, "Porfavor ingresa la placa de los carros ");

                int[] placa = new int[3];
                for (int i = 0; i < 3; i++) ;
                Double.parseDouble(JOptionPane.showInputDialog(null, "Porfavor ingrese la hora de entrada"));

                Double[] hora_entrada = new Double[3];
                for (int i = 0; i < 3; i++) ;
                Double.parseDouble(JOptionPane.showInputDialog(null, "Porfavor ingrese la hora de salida"));
                Double[] hora_salida = new Double[3];
                for (int i = 0; i < 3; i++) ;
            }
            break;

            case 2:





/*
        resta = hora_salidad - hora_entrada;
        if (valor == dato) {
            mult = Math.ceil(resta) * valor * 2000;
        } else {
            mult = Math.ceil(resta) * valor * 1000;
        }

        JOptionPane.showMessageDialog(null, "su placa es:" + placas + "\n" +
                "la hora en que ingreso es:" + hora_entrada + "\n" +
                "la hora en que salio es :" + hora_salidad + "\n" +
                "tiene que pagar :" + mult);


        switch ((int) valor) {
            case 1:
                mult = Math.ceil(resta) * 2000;
                JOptionPane.showMessageDialog(null, "valor a pagar por su carro es:" + mult);
            case 2:
                mult = Math.ceil(resta) * 1000;

                JOptionPane.showMessageDialog(null, "valor a pagar por su moto es:" + mult);

                defauld:
                 JOptionPane.showMessageDialog(null, "el valor no existe");

   }   }
 */