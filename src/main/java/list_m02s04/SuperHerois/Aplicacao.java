package list_m02s04.SuperHerois;

import list_m02s04.SuperHerois.cli.Display;
import list_m02s04.SuperHerois.exception.OpcaoInvalidaException;
import list_m02s04.SuperHerois.model.Heroi;
import list_m02s04.SuperHerois.model.Menu;
import list_m02s04.SuperHerois.model.Personagem;
import list_m02s04.SuperHerois.model.Vilao;
import list_m02s04.SuperHerois.repository.PersonagemRepository;

import java.util.List;

public class Aplicacao {

    private Display display = new Display();
    private PersonagemRepository personagemRepository = new PersonagemRepository();
    public void executar() {

        Menu menu = null;

        do {
            display.exibirMenu();
            int cod = display.obterMenu();
            try {
                menu = Menu.converter(cod);
                processar(menu);
            } catch (OpcaoInvalidaException e) {
                display.exibirMensagem(e.getMessage());
            }
        }
        while(menu != Menu.SAIR);
    }

    private void processar(Menu menu) {
        if (menu == Menu.SAIR) {
            return;
        } if (menu == Menu.CADASTRAR_HEROI) {
            Heroi heroi = display.obterDadosHeroi();
            personagemRepository.inserir(heroi);
        } else if (menu == Menu.CADASTRAR_VILAO) {
            Vilao vilao = display.obterDadosVilao();
            personagemRepository.inserir(vilao);
        } else if (menu == Menu.LISTAR) {
            List<Personagem> personagens = personagemRepository.listar();
            display.listar(personagens);

        }
    }
}
