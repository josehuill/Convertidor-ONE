
package conversor_doble;

/**
 *
 * @author Jox
 */
public class Convertir_longi {
    private int list1,list2;
    private double medida;

    public Convertir_longi(int list1, int list2, double medida) {
        this.list1 = list1;
        this.list2 = list2;
        this.medida = medida;
    }

    
    public double conversion_medida() {
        
        double resul;
        switch (getList1()) {
            case 1 -> {
                //metros
                switch (getList2()) {
                    case 1 -> resul=getMedida()*1;
                    case 2 -> resul=getMedida()*(100);
                    case 3 -> resul=getMedida()*(1000);
                    default -> throw new AssertionError();
                }
            }
            case 2 -> {
                //Centimetros
                switch (getList2()) {
                    case 1 -> resul=getMedida()*(0.01);
                    case 2 -> resul=getMedida()*(1);
                    case 3 -> resul=getMedida()*(0.00001);
                    default -> throw new AssertionError();
                }
            }
            case 3 -> {
                //Kilometros
                switch (getList2()) {
                    case 1 -> resul=getMedida()*1000;
                    case 2 -> resul=getMedida()*(100000);
                    case 3 -> resul=getMedida()*(1);
                    default -> throw new AssertionError();
                }
            }

            default -> throw new AssertionError();
        }
        
        return resul;
    }
    
    public int getList1() {
        return list1;
    }

    public void setList1(int list1) {
        this.list1 = list1;
    }

    public int getList2() {
        return list2;
    }

    public void setList2(int list2) {
        this.list2 = list2;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }
        
    
}
