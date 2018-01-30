package Automovel;
import static java.lang.System.out;

public class ProjetoVeiculo {
    public static void main(String[] args) {
        
        Veiculo v1 = new Veiculo();
        Mustang m = new Mustang();
        Ferrari f = new Ferrari();
        
        v1.setMarcha(6);
        out.print("\n");
         
        out.println("CARACTERISTICAS AUTOMOBILISTICAS");
        m.setNome("FORD MUSTANG GT PREMIUM");
        m.setAno(2018);
        m.setCor("Preto");
        m.setMarca("Ford");
        m.setPlaca("564LLG");
        m.setPneu("Firestone");
        m.setPorta(2);
        m.setMarcha(4);
        m.Caracter();
        out.println("\n");
        
        out.println("CARACTERISTICAS AUTOMOBILISTICAS");
        f.setNome("FERRARI 812 SUPERFAST");
        f.setAno(2017);
        f.setCor("Vermelho");
        f.setMarca("Ferrari");
        f.setPlaca("200ASE");
        f.setPneu("Firelli");
        f.setPorta(2);
        f.setMarcha(6);
        f.Caracter();
        out.println("\n");
        
    }
}
