package list_m02s04.SuperHerois.model;

public class Vilao extends Personagem {

    private Integer tempoDePrisao;

    public Vilao(String nome, String superpoder, Integer tempoDePrisao) {
        this.setNome(nome);
        this.setSuperpoder(superpoder);
        this.tempoDePrisao = tempoDePrisao;
    }

    @Override
    public String toString() {
        return String.format("Vilao: %s | %s | %s", getNome(), getSuperpoder(), getTempoDePrisao());
    }

    public Integer getTempoDePrisao() {
        return tempoDePrisao;
    }

    public void setTempoDePrisao(Integer tempoDePrisao) {
        this.tempoDePrisao = tempoDePrisao;
    }
}
