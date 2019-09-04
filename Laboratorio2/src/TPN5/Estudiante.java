package TPN5;

/**
 * Created by adrian on 29/08/2019.
 */
public class Estudiante {
   private String nombre;
   private int id;
   private double nota;
   private static int contador=1;

   //punto 3.a)
   public Estudiante(String nombre,double nota){
       this.nombre = nombre;
       this.nota = nota;
       this.id = contador;
       contador++;
   }

   public Estudiante(){
      this.nombre = "vacio";
      this.nota = 0;
      this.id = 0;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public double getNota() {
      return nota;
   }

   public void setNota(double nota) {
      this.nota = nota;
   }

   public String getNombre() {
      return nombre;
   }

   @Override
   public String toString(){
      return "nombre: "+nombre+", id: "+id+", nota: "+nota+"\n";
   }
}
