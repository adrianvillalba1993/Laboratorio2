package TFI02;

class Estudiante extends Persona {

    public Estudiante(String nombre ,String apellido,int legajo){
        super(nombre,apellido,legajo);
    }

    @Override
    public void modificarDatos() {
       super.setNombre("jose");
       super.setApellido("gauna");
       super.setLegajo(67654);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
