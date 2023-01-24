package com.capgemini.start.api.dto.input;

import java.util.Date;
import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneroInputDTO {

	// @Length(max = 100) //
	@NotEmpty
	private String descricao;

	@NotEmpty
	private Date inclusao;

	@NotEmpty
	private Date alteracao;
}
