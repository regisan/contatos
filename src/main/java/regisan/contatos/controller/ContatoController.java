package regisan.contatos.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import regisan.contatos.domain.Contato;
import regisan.contatos.domain.ContatoRepository;

@Controller
public class ContatoController {

    @Autowired
    ContatoRepository contatoRepository;

    @PostMapping("/addcontato")
    public String addContato(@Valid Contato contato, BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "add-contato";
        }

        contatoRepository.save(contato);
        model.addAttribute("contatos", contatoRepository.findAll());
        return "home";    
    }

    @GetMapping("/addnew")
    public String addNew(Model model) {
        model.addAttribute("contato", new Contato());
        return "add-contato";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}