
package conversor_doble;


public class Convertir_money {
    private double importe;
    private int tipo1,tipo2;

    public Convertir_money(double importe, int tipo1, int tipo2) {
        this.importe = importe;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }

    public  double Conversion_dinero () {
        double resul;
        switch (getTipo1()) {
            case 1 -> { //SOLES
                switch (getTipo2()) {
                    case 1 -> resul=getImporte()/(1);       //Soles
                    case 2 -> resul=getImporte()/(3.81);    //Dolar
                    case 3 -> resul=getImporte()/(4.03);    //Euro
                    case 4 -> resul=getImporte()/(4.58);    //Libra esterlina
                    case 5 -> resul=getImporte()/(0.02);  //Yen japones
                    case 6 -> resul=getImporte()/(0.20);   //Peso mexicano
                    case 7 -> resul=getImporte()*(1.36); //Real Brasilero
                    default -> throw new AssertionError();
                }
            }
            case 2 -> { //DOLAR
                switch (getTipo2()) {
                    case 1 -> resul=getImporte()*(3.81);    //soles
                    case 2 -> resul=getImporte()*(1);       //dolar
                    case 3 -> resul=getImporte()*(0.94);    //Euro
                    case 4 -> resul=getImporte()*(0.83);    //Libra esterlina
                    case 5 -> resul=getImporte()*(136.20);  //Yen japones
                    case 6 -> resul=getImporte()*(18.39);   //Peso mexicano
                    case 7 -> resul=getImporte()*(5.21); //Brasil
                    default -> throw new AssertionError();
                }
            }
            case 3 -> { //EURO
                switch (getTipo2()) {
                    case 1 -> resul=getImporte()*(4.03);    //soles
                    case 2 -> resul=getImporte()*(1.05);       //dolar
                    case 3 -> resul=getImporte()*(1);    //Euro
                    case 4 -> resul=getImporte()*(0.88);    //Libra esterlina
                    case 5 -> resul=getImporte()*(144.29);  //Yen japones
                    case 6 -> resul=getImporte()*(19.48);   //Peso mexicano
                    case 7 -> resul=getImporte()*(5.51); //Real Brasilero
                    default -> throw new AssertionError();
                }
            }
            case 4 -> { //LIBRA ESTERLINA
                switch (getTipo2()) {
                    case 1 -> resul=getImporte()*(4.58);    //soles
                    case 2 -> resul=getImporte()*(1.20);       //dolar
                    case 3 -> resul=getImporte()*(1.13);    //Euro
                    case 4 -> resul=getImporte()*(1);    //Libra esterlina
                    case 5 -> resul=getImporte()*(163.80);  //Yen japones
                    case 6 -> resul=getImporte()*(22.12);   //Peso mexicano
                    case 7 -> resul=getImporte()*(6.26); //Real Brasilero
                    default -> throw new AssertionError();
                }
            }
            case 5 -> { //YEN
                switch (getTipo2()) {
                    case 1 -> resul=getImporte()*(0.02);    //soles
                    case 2 -> resul=getImporte()/(136.2);       //dolar
                    case 3 -> resul=getImporte()/(144.3);    //Euro
                    case 4 -> resul=getImporte()/(163.8);    //Libra esterlina
                    case 5 -> resul=getImporte()*(1);  //Yen japones
                    case 6 -> resul=getImporte()*(0.13);   //Peso mexicano
                    case 7 -> resul=getImporte()*(0.03); //Real Brasilero
                    default -> throw new AssertionError();
                }
            }
            case 6 -> { //PESO MEXICANO
                switch (getTipo2()) {
                    case 1 -> resul=getImporte()*(0.20);    //soles
                    case 2 -> resul=getImporte()*(0.05);       //dolar
                    case 3 -> resul=getImporte()/(19.48);    //Euro
                    case 4 -> resul=getImporte()*(0.04);    //Libra esterlina
                    case 5 -> resul=getImporte()*(7.40);  //Yen japones
                    case 6 -> resul=getImporte()*(1);   //Peso mexicano
                    case 7 -> resul=getImporte()*(0.28); //Real Brasilero
                    default -> throw new AssertionError();
                }
            }
            case 7 -> { //Real Brasilero
                switch (getTipo2()) {
                    case 1 -> resul=getImporte()*(0.73);    //soles
                    case 2 -> resul=getImporte()*(0.19);       //dolar
                    case 3 -> resul=getImporte()*(0.18);    //Euro
                    case 4 -> resul=getImporte()*(0.15);    //Libra esterlina
                    case 5 -> resul=getImporte()*(26.1);  //Yen japones
                    case 6 -> resul=getImporte()*(3.53);   //Peso mexicano
                    case 7 -> resul=getImporte()*(1); //Real Brasilero
                    default -> throw new AssertionError();
                }
            }

            default -> throw new AssertionError();
        }
        return resul;
    }
    
    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getTipo1() {
        return tipo1;
    }

    public void setTipo1(int tipo1) {
        this.tipo1 = tipo1;
    }

    public int getTipo2() {
        return tipo2;
    }

    public void setTipo2(int tipo2) {
        this.tipo2 = tipo2;
    }
    
    
    
}
