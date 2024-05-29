public class Eevee {
    private String tipo;
    private Double peso;
    private int altura;
    private int hp;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String Ataque() {
        return "Atk";
    }

    public String Defesa() {
        return "Def";
    }

    public String Especial() {
        return "Esp";
    }
}
