package com.capgemini.start.api.dto.input;

import java.util.Date;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(name = "GeneroInputDTO", description = "Objeto de entrada para inclusão, alteração e exclusão da entidade Gênero.")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GeneroInputDTO {

	@NotNull
	@Length(max = 100)
	private String descricao;
	@NotEmpty
	private Date inclusao;
	@NotEmpty
	private Date alteracao;
	@NotEmpty
	private Date exclusao;
}
