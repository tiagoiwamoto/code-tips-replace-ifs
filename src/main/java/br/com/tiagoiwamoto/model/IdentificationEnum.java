package br.com.tiagoiwamoto.model;

import br.com.tiagoiwamoto.validator.AbstractValidator;
import br.com.tiagoiwamoto.validator.CarteiraTrabalhoValidator;
import br.com.tiagoiwamoto.validator.CpfValidator;
import br.com.tiagoiwamoto.validator.RgValidator;
import br.com.tiagoiwamoto.validator.TituloEleitorValidator;

/**
 * By: Tiago Henrique Iwamoto
 * Created at: {27/04/2021} - {09:45}
 * Contact: tiago.iwamoto@gmail.com
 */

public enum IdentificationEnum {

    RG("Rg", new RgValidator(), "Validação de Rg"),
    CPF("Cpf", new CpfValidator(), "Validação do Cpf"),
    CARTEIRA_TRABALHO("Carteira de Trabalho", new CarteiraTrabalhoValidator(), "Validação da carteira de trabalho"),
    TITULO_ELEITOR("Titulo de Eleitor", new TituloEleitorValidator(), "Validação do titulo de eleitor");

    private String name;
    private AbstractValidator validator;
    private String description;

    IdentificationEnum(String name, AbstractValidator validator, String description) {
        this.name = name;
        this.validator = validator;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public AbstractValidator getValidator() {
        return validator;
    }

    public String getDescription() {
        return description;
    }
}
