package ht.brh.srhparser.model;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Horaire {
	@NotNull(message = "Le code employe est obligatoire")
	private String codeEmploye;
	
	@NotNull(message = "L'heure d'entrée est obligatoire")
	private LocalDateTime heureEntree;
	
	@NotNull(message = "L'heure de sortie est oblogatoire")
	private LocalDateTime heureSortie;
}
