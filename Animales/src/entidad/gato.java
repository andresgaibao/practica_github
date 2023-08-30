
package entidad;


public class gato {
    String raza,color,color_ojos;
    int peso,altura;

    public gato(String raza, String color, String color_ojos, int peso, int altura) {
        this.raza = raza;
        this.color = color;
        this.color_ojos = color_ojos;
        this.peso = peso;
        this.altura = altura;
    }

    public gato() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor_ojos() {
        return color_ojos;
    }

    public void setColor_ojos(String color_ojos) {
        this.color_ojos = color_ojos;
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
