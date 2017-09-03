package br.com.centraldaassinatura.loja.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.centraldaassinatura.loja.dao.AssinaturaDao;
import br.com.centraldaassinatura.loja.model.Assinatura;

//CDI
@Named
@RequestScoped
public class AdminAssinaturaBean {

	@Inject
	private AssinaturaDao assinaturaDao;
	private Assinatura assinatura = new Assinatura();

	//CDI diz q tem q abrir e fechar a transação
	//@Transactional faz o papel de .begin() e .commit()
	@Transactional
	public void salvar() {
		System.out.println("Assinatura salva: " + assinatura);
		assinaturaDao.salvar(assinatura);
	}

	public Assinatura getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(Assinatura assinatura) {
		this.assinatura = assinatura;
	}
}
