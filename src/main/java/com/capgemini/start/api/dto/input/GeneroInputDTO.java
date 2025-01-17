package com.capgemini.start.api.dto.input;

import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(name = "GeneroInput", description = "Objeto de entrada para inclusão, alteração e exclusão da entidade Gênero.")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GeneroInputDTO {

	@NotEmpty
	@Length(max = 100)
	private String descricao;
}
