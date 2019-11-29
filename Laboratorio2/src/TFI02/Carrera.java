package TFI02;

import java.util.*;
class Carrera implements Informacion{

    private String nombre;
    private Set<Materia> materias = new HashSet<Materia>();
    private Iterator<Materia> iterador = materias.iterator();


 public Carrera(String nombre, Set<Materia> materias){
        this.materias = materias;
        this.nombre = nombre;
 }
   public void agregarMateria(Materia materia){
      materias.add(materia);
       iterador = materias.iterator();
   }

   public void eliminarMateria(String nombre){
     while(iterador.hasNext()){
         String nom = iterador.next().getNombre();
         if(nom.equals(nombre)){
             iterador.remove();
         }
     }
       System.out.println(nombre+" fue borrado");
   }

    public Set<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Set<Materia> materias) {
        this.materias = materias;
    }

    public void encontrarMateria(String nombre){
       boolean prueba = false;
       while(iterador.hasNext()){
           String nom = iterador.next().getNombre();
           if(nom.equals(nombre)){
               prueba = true;
               System.out.println("materia "+nombre+ " encontrada");
           }else{
               System.out.println("materia "+nombre+ " no encontrado");
           }
       }

       if(prueba){
           String opcion = "";
           System.out.println("desea eliminarla?");
           System.out.println("S/N");
           try {
               Scanner teclado = new Scanner(System.in);
               opcion = teclado.next();
           }catch(Exception e){
               System.exit(0);
           }
           if(opcion.equalsIgnoreCase("s")){
               eliminarMateria(nombre);
           }else{
               //sigue y sale del metodo
           }
       }

   }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String listarContenido() {
        String contenido="";
        for(Materia materia : materias){
            contenido = materia.toString() + " ";
        }
        return contenido;
    }

    @Override
    public int verCantidad() {
        return materias.size();
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", materias=" + materias +
                ", iterador=" + iterador +
                '}';
    }
}
