package TesteLeitura;

import Codigo.*;

public class App {
    public static void main (String args[]){
        ListaCategoria lcat = new ListaCategoria(100);
        FilaPedidos fp = new FilaPedidos();
        ListaAutomoveis la = new ListaAutomoveis(100);
        ListaClientes lcli = new ListaClientes(100);
        ListaModelo lmod = new ListaModelo(100);
        ListaMarca lmar = new ListaMarca(100);

        LeituraArquivoTextoTeste leitura = new LeituraArquivoTextoTeste();
        leitura.leRegistrosTexto2(lcat,lmar,lmod,la,lcli,fp);
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        lcat.mostra();
        lmar.mostra();
        lmod.mostra();
        la.mostra();
        String umPedido = fp.getPedidos().peek().toString();
        System.out.println(umPedido);

    }
}
