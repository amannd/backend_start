package com.capgemini.start.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import com.capgemini.start.api.dto.input.GeneroInputDTO;
import com.capgemini.start.api.dto.output.GeneroDTO;
import com.capgemini.start.domain.entity.Genero;


@Component
@Mapper(componentModel = "spring")
public interface GeneroMapper {

	GeneroDTO toDTO(Genero entity);

	@Mapping(target = "id", ignore = true)
	Genero toEntity(GeneroInputDTO dto);
}