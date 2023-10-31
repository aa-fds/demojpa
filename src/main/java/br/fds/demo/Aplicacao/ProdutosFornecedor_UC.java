
package br.fds.demo.Aplicacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.fds.demo.Dominio.ServicoEstoque;
import br.fds.demo.Dominio.Entidades.Fornecedor;


@Component
public class ProdutosFornecedor_UC {
    @Autowired
    private ServicoEstoque servicoEstoque;


    public List<Fornecedor> run() {
      return servicoEstoque.getFornecedores();
    }

}
