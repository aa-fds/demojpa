package br.fds.demo.Dominio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fds.demo.Entidades.Fornecedor;
import br.fds.demo.Entidades.Produto;

@Service
public class ServicoEstoque {
    private IRepProdutos produtosRep;
    private IRepFornecedores fornecedoresRep;

    @Autowired
    public ServicoEstoque(IRepProdutos produtosRep, 
                          IRepFornecedores fornecedoresRep){
        this.produtosRep = produtosRep;
        this.fornecedoresRep = fornecedoresRep;
    }

    public List<Produto> produtosDisponiveis(){
        System.out.println("\n\n no service");
        return produtosRep.all();
    }

   public List<Fornecedor> getFornecedores(){
        return fornecedoresRep.all();
    }

    public Fornecedor getFornecedor(String nome){
        return fornecedoresRep.getFornecedor(nome);
     }


}