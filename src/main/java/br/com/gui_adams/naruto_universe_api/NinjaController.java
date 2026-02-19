package br.com.gui_adams.naruto_universe_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/helloword")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa api";
    }

}
