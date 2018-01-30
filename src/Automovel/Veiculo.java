package Automovel;
import static java.lang.System.out;

class Veiculo {
    String nome;
    String cor;
    String pneu;
    String placa;
    String marca;
    int marcha;
    int porta;
    int ano;
    
    String getNome() {
        this.nome = nome;
        return nome;
    }
    void setNome(String n) {
        this.nome = n;
    }
    String getCor() {
        this.cor = cor;
        return cor;
    }
    void setCor(String c) {
        this.cor = c;
    }
    String getPneu() {
        this.pneu = pneu;
        return pneu;
    }
    void setPneu(String p) {
        this.pneu = p;
    }
    String getPlaca() {
        this.placa = placa;
        return placa;
    }
    void setPlaca(String pl) {
        this.placa = pl;
    }
    String getMarca() {
        this.marca = marca;
        return marca;
    }
    void setMarca(String m) {
        this.marca = m;
    }
    int getPorta() {
        this.porta = porta;
        return porta;
    }
    void setPorta(int po) {
        this.porta = po;
    }
    int getAno() {
        this.ano = ano;
        return ano;
    }
    void setAno(int a) {
        this.ano = a;
    }
    
    int getMarcha() {
        this.marcha = marcha;
        return marcha;
    }
    void setMarcha(int ma) {
        this.marcha = ma;
        switch (ma) {
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
    void Caracter() {
        out.println("Nome do veiculo: " + this.getNome());
        out.println("Cor do veiculo: " + this.getCor());
        out.println("Marca do pneu: " + this.getPneu());
        out.println("Número da placa do veiculo: " + this.getPlaca());
        out.println("Marca do veiculo: " + this.getMarca());
        out.println("Número de portas do veiculo: " + this.getPorta());
        out.println("Ano de fabricação do veiculo" + this.getAno());
        out.println("Em qual marcha o veiculo se encontra ? " + this.getMarcha());
        
    }
 }
