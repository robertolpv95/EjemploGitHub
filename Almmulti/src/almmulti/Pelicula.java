
package almmulti;

public class Pelicula extends Multimedia {
    private String actor;
    private String actriz;
    
    public Pelicula(String titulo, String autor, Formato formato, int duracion,String actor,String actriz) {
        super(titulo, autor, formato, duracion);
        
        if(actor==null&&actriz == null){
           throw new IllegalArgumentException("Actor y Actriz no puede ser nulas junt@s");

    }
        if(actor!=null){
            this.actor = actor;
    }
        if(actriz != null){
            this.actriz = actriz;
        }
    }
}