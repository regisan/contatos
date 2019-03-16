package regisan.contatos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import regisan.contatos.domain.Contato;
import regisan.contatos.domain.ContatoRepository;

@Service
public class ContatoService {

    @Autowired
    ContatoRepository contatoRepository;

    public Contato findByEmail(String email) {
        Contato contato = contatoRepository.findByEmail(email);
        if (contato == null)
            contato = new Contato();

        return contato;
    }
}