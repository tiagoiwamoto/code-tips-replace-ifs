package br.com.tiagoiwamoto;

import br.com.tiagoiwamoto.model.IdentificationEnum;
import br.com.tiagoiwamoto.validator.AbstractValidator;
import br.com.tiagoiwamoto.validator.IValidatorInterface;

import java.util.Scanner;

/**
 * By: Tiago Henrique Iwamoto
 * Created at: {27/04/2021} - {09:38}
 * Contact: tiago.iwamoto@gmail.com
 */

public class MainWithIfs {

    public static void main(String[] args) {

        System.out.println("++++++++++++++ Executando a aplicação ++++++++++++++");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tipo de documento -> RG, CPF, TITULO_ELEITOR, CARTEIRA_TRABALHO");
        String value = scanner.nextLine();

        /**
         * Problema de instanciar muitos ifs
         */
        IdentificationEnum identificationEnum = null;
        try{
            identificationEnum = IdentificationEnum.valueOf(value);
        }catch (Exception e){
            throw new NullPointerException();
        }
        AbstractValidator validator = identificationEnum.getValidator();
        if(identificationEnum == IdentificationEnum.RG){
            System.out.println("");
            System.out.println("Informe o RG: ");
            String document = scanner.nextLine();
            System.out.println("RG é válido -> ".concat(identificationEnum.getValidator().validDocument(document).toString()));
        }else if (identificationEnum == IdentificationEnum.CPF){
            System.out.println("");
            System.out.println("Informe o CPF: ");
            String document = scanner.nextLine();
            System.out.println("CPF é válido -> ".concat(identificationEnum.getValidator().validDocument(document).toString()));
        }else if (identificationEnum == IdentificationEnum.TITULO_ELEITOR){
            System.out.println("");
            System.out.println("Informe o Titulo de eleitor: ");
            String document = scanner.nextLine();
            System.out.println("Titulo de eleitor é válido -> ".concat(identificationEnum.getValidator().validDocument(document).toString()));
        }else if (identificationEnum == IdentificationEnum.CARTEIRA_TRABALHO){
            System.out.println("");
            System.out.println("Informe a carteira de trabalho: ");
            String document = scanner.nextLine();
            System.out.println("Carteira de trabalho é válida -> ".concat(identificationEnum.getValidator().validDocument(document).toString()));
        }else{
            System.out.println("Nenhum documento foi informado");
        }
    }

}
