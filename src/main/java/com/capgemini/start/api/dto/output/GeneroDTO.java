package com.capgemini.start.api.dto.output;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneroDTO {

	private Long id;

	private String descricao;

	private Date inclusao;

	private Date alteracao;

}
