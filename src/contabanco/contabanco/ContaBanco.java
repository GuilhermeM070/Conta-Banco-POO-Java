package contabanco;
public class ContaBanco {
    public static void main(String[] args) {

        Conta jubileu = new Conta();
        jubileu.setNumBanco(2424);
        jubileu.setDono("Jubileu");
        jubileu.abrirConta("CC");
        
        Conta creusa = new Conta();
        creusa.setNumBanco(3825);
        creusa.setDono("Creusa");
        creusa.abrirConta("CP");


        jubileu.depositar(200);
        creusa.depositar(200);
        creusa.sacar(10);
        jubileu.fecharConta();
        jubileu.sacar(250);
        jubileu.fecharConta();

        jubileu.estadoAtual();
        creusa.estadoAtual();
    }    
        
        
        
        
    
    
}
