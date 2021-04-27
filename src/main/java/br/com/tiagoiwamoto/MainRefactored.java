package br.com.tiagoiwamoto;

import br.com.tiagoiwamoto.model.IdentificationEnum;

import java.util.Arrays;
import java.util.Scanner;

/**
 * By: Tiago Henrique Iwamoto
 * Created at: {27/04/2021} - {09:38}
 * Contact: tiago.iwamoto@gmail.com
 */

public class MainRefactored {

    public static void main(String[] args) {
        System.out.println("++++++++++++++ Executando a aplicação ++++++++++++++");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tipo de documento -> RG, CPF, TITULO_ELEITOR, CARTEIRA_TRABALHO");
        String value = scanner.nextLine();

        IdentificationEnum identificationEnum =
                Arrays.stream(IdentificationEnum.values())
                        .filter(id -> id.name().equals(value)).findFirst().orElseThrow(NullPointerException::new);

        System.out.println("Informe o ".concat(identificationEnum.name()).concat(": "));
        String document = scanner.nextLine();
        System.out.println(identificationEnum.name().concat(" é válido -> ")
                .concat(identificationEnum.getValidator().validDocument(document).toString()));
    }

}
