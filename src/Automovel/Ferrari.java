package Automovel;
import static java.lang.System.out;

class Ferrari extends Veiculo {

    public String getNome() {
        return nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }
    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPneu() {
        return pneu;
    }
    @Override
    public void setPneu(String pneu) {
        this.pneu = pneu;
    }

    public String getPlaca() {
        return placa;
    }
    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }
    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPorta() {
        return porta;
    }
    @Override
    public void setPorta(int porta) {
        this.porta = porta;
    }

    public int getAno() {
        return ano;
    }
    @Override
    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMarcha() {
        return marcha;
    }
    
    public void setMarcha(int marcha) {
        this.marcha = marcha;
        switch (marcha) {
            case 1:
                out.println("Passando pra primeira marcha");
                break;
            case 2:
                out.println("Passando para segunda marcha");
                break;
            case 3:
                out.println("Passando para terceira marcha");
                break;
            case 4:
                out.println("Passando para quarta marcha");
                break;
            case 5:
                out.println("Passando para quinta marcha");
                break;
            default:
                out.println("Veiculo não reconhece marcha");
        }
    }
    
    @Override
    void Caracter() {
        super.Caracter();
    }
}
