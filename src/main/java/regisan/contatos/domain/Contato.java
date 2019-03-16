package regisan.contatos.domain;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;


public class Contato {

    @Id
    public String id;

    @NotBlank(message = "Primeiro nome é obrigatório!")
    public String firstName;

    @NotBlank(message = "Último nome é obrigatório!")
    public String lastName;

    @NotBlank(message = "E-mail é obrigatório!")
    public String email;
    

    public Contato() {}

    public Contato(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s', email='%s']",
                id, firstName, lastName, email);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}