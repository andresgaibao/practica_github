package entidad;

/**
 *
 * @author esnei
 */
public class Caballo {
    String raza, pelaje, color, nombre, genero;
    int edad;
    float altura, peso;

    public Caballo(String raza, String pelaje, String color, String nombre, String genero, int edad, float altura, float peso) {
        this.raza = raza;
        this.pelaje = pelaje;
        this.color = color;
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public Caballo() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}
