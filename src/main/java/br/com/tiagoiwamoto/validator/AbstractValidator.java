package br.com.tiagoiwamoto.validator;

/**
 * By: Tiago Henrique Iwamoto
 * Created at: {27/04/2021} - {09:47}
 * Contact: tiago.iwamoto@gmail.com
 */

public abstract class AbstractValidator implements IValidatorInterface{

    @Override
    public Boolean validDocument(String value) {
        return !value.isBlank() && !value.isEmpty();
    }
}
