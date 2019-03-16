package regisan.contatos.domain;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContatoRepository extends MongoRepository<Contato, String> {

    public Contato findByFirstName(String firstName);
    public List<Contato> findByLastName(String lastName);
    public Contato findByEmail(String email);

}