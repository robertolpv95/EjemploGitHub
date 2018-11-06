package almmulti;

public class Multimedia {

    private String titulo;
    private String autor;
    private Formato formato;
    private int duracion;

    public Multimedia(String titulo, String autor, Formato formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public Formato getFormato() {
        return this.formato;
    }

    public int getDuracion() {
        return this.duracion;
    }

    @Override
    public String toString() {
        String info = "Titulo: " + this.titulo + " ";
        info += ("\r\nAutor: " + this.autor);
        info += ("\r\nFormato: " + this.formato.toString());
        info += ("\r\nDuracion: " + this.duracion);

        return info;
    }

    public boolean equals(Multimedia m) {
        boolean tituloIgual = this.titulo.equals(m.titulo);
        boolean autorIgual = this.autor.equals(m.autor);

        return (tituloIgual && autorIgual);
    }
    
    Pelicula p1 = new Pelicula("Star Wars","George Lucas", Formato.AVI,1234, null, null);
}
