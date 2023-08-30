
package entidad;


public class pajaro {
    String especie,color,alimentacion,nombre_cientifico,nombre_xomun;
    int edad, peso,tamaño;

    public pajaro(String especie, String color, String alimentacion, String nombre_cientifico, String nombre_xomun, int edad, int peso, int tamaño) {
        this.especie = especie;
        this.color = color;
        this.alimentacion = alimentacion;
        this.nombre_cientifico = nombre_cientifico;
        this.nombre_xomun = nombre_xomun;
        this.edad = edad;
        this.peso = peso;
        this.tamaño = tamaño;
    }

    public pajaro() {
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getNombre_cientifico() {
        return nombre_cientifico;
    }

    public void setNombre_cientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }

    public String getNombre_xomun() {
        return nombre_xomun;
    }

    public void setNombre_xomun(String nombre_xomun) {
        this.nombre_xomun = nombre_xomun;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
