package ht.brh.srhparser.model;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Absence {

	@NotNull(message="La journée de l'absence est obligatoire")
	private LocalDateTime jour;
	
	@NotNull(message="L'empoye est obligatoire")
	private Employe employe;
}
