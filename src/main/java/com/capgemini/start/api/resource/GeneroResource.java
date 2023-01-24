package com.capgemini.start.api.resource;

import java.util.List;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.capgemini.start.api.dto.input.GeneroInputDTO;
import com.capgemini.start.api.dto.output.GeneroDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Gênero", description = "Gênero do Filme.")
public interface GeneroResource {

	@Operation(summary = "Consulta um Gênero por ID.")
	@GetMapping(value = "/{id}")
	ResponseEntity<GeneroDTO> findById(@PathVariable Long id);

	@Operation(summary = "Lista todos os Gêneros.")
	@GetMapping()
	ResponseEntity<List<GeneroDTO>> findAll();

	@Operation(summary = "Insere um Gênero.")
	@PostMapping()
	ResponseEntity<GeneroDTO> insert(@RequestBody @Valid GeneroInputDTO genero);

	@Operation(summary = "Atualiza um Gênero.")
	@PutMapping(value = "/{id}")
	ResponseEntity<GeneroDTO> update(@PathVariable Long id, @RequestBody @Valid GeneroInputDTO genero);

	@Operation(summary = "Exclui um Gênero pelo ID.")
	@DeleteMapping(value = "/{id}")
	ResponseEntity<Void> delete(@PathVariable Long id);

}