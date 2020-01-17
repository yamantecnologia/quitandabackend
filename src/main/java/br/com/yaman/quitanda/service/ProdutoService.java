package br.com.yaman.quitanda.service;

import java.util.List;

import br.com.yaman.quitanda.dao.entity.Produto;
import org.springframework.stereotype.Service;

/**
 * 
 * @author marcus.martins
 *
 */
@Service
public interface ProdutoService extends GenericCrudService<Produto> {
	
}
