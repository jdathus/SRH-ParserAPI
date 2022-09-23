package ht.brh.srhparser.model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Employe {

    @NotNull(message ="Le code de l'employe est obligatoire")
	private String codeEmploye;
    
    @NotNull(message ="Le code Poste est obligatoire")
	private String codePoste;
}
