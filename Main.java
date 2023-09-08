public class Main {

    //ArrayList de objetos SeleccionFutbol. Independientemente de la clase hija a la que pertenece el objeto 
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(string[] args) {

        SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "28489");
        SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        SeleccionFutbol raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        //CONCENTRACION 
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo metodo)");
        for (SeleccionFutbol integrante : integrantes ) {
            System.out.print(integrantes.getNombre()+""+Integrante.getApellidos()+" -> ");
            integrante.concentrarse();
        }

        //VIAJE 
        System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo metodo)");
        for (SeleccionFutbol integrante : integrantes) {
            system.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
            integrante.viajar();
        }

        //ENTRENAMIENTO 
        System.out.println("\nEntrenamiento: Todos los integrantes tienen su funcion en un entrenamiento (Especializacion)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " integrante.getApellidos() + " -> ");
            integrante.entrenamiento();
        }
        
        //MASAJE
        System.out.println("\nMasaje: solo el masajista tiene el metodo para dar un masaje");
        System.out.print(raulMartinez.getNombre()+" "raulMartinez.getApellidos()+" -> ");
        raulMartinez.darMasaje();

        //PARTIDO DE FUTBOL 
        System.out.println("\nPartido de Futbol: Todos los integrantes tienen su funcion en una partido (Especializacion)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrantes.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.partidoFutbol();
        }
    }
}
