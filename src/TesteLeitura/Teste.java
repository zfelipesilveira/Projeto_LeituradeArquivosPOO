package TesteLeitura;

import Codigo.CategoriaAutomovel;
import Codigo.ListaCategoria;
import Codigo.MarcaAutomovel;

public class Teste {
    public static void main(String args[]){
        CategoriaAutomovel c1 = new CategoriaAutomovel("sedan");
        CategoriaAutomovel c2 = new CategoriaAutomovel("suv");
        ListaCategoria l1 = new ListaCategoria(100);
        l1.insere(c1);
        l1.insere(c2);
        System.out.println(l1.pesquisaCategoria("sedan").getNome());
    }
}
