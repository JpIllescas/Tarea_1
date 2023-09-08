public class Masajista extends SeleccionFutbol {

    private String Titulacion;
    private int aniosExperiencia;
    
    // constructor, getter y setter 

    @Override 
    public void  entrenamiento () {
        System.out.println("Da asistencia en el entrenamiento (CLase Masajista)");
    }

    public void darMasaje() {
        System.out.println("Da un Masaje");
    }
}
