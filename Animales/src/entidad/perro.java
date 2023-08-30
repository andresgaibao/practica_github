
package entidad;


public class perro {
    String nombre,raza,tipo_pelaje, genero,color;
    int peso,altura;

    public perro(String nombre, String raza, String tipo_pelaje, String genero, String color, int peso, int altura) {
        this.nombre = nombre;
        this.raza = raza;
        this.tipo_pelaje = tipo_pelaje;
        this.genero = genero;
        this.color = color;
        this.peso = peso;
        this.altura = altura;
    }

    public perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo_pelaje() {
        return tipo_pelaje;
    }

    public void setTipo_pelaje(String tipo_pelaje) {
        this.tipo_pelaje = tipo_pelaje;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
