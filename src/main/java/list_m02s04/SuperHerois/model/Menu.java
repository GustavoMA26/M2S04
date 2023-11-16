package list_m02s04.SuperHerois.model;

import list_m02s04.SuperHerois.exception.OpcaoInvalidaException;

public enum Menu {

    CADASTRAR_HEROI,
    CADASTRAR_VILAO,
    LISTAR,
    SAIR;

    public static Menu converter(int codigo) throws OpcaoInvalidaException {
    if (codigo == 0 || codigo > 4) {
        throw new OpcaoInvalidaException("Esta opção não é válida!");
        } return Menu.values()[codigo - 1];
    }
}
