package memoria.ExemploMemoria.service;

import memoria.ExemploMemoria.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProdutoService {

    ArrayList<Produto> produtos = new ArrayList<>();

    private long contador = 1;
    public ArrayList<Produto> listar() {
        return this.produtos;
    }

    public Produto criar(Produto produto) {
        produto.setId(contador);
        contador++;
        this.produtos.add(produto);
        return produto;
    }

    public boolean remove(Long id) {
        // removeIf faz o for, verificando se o id é igual ao id do array
        //se for igual, ele remove e retorna True, se não retorna False
        return produtos.removeIf(p -> p.getId().equals(id));
    }

    public Produto atualiza(Long id, Produto novo) {
        novo.setId(id);
        for(int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getId().equals(id)) {
                produtos.set(i, novo);
                return novo;
            }
        }

        return null;
    }
}
