package br.com.centraldaassinatura.loja.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.centraldaassinatura.loja.model.Assinatura;

public class AssinaturaDao {

	@PersistenceContext
	private EntityManager em;
	
	public void salvar(Assinatura assinatura){
		em.persist(assinatura);
	}
}
