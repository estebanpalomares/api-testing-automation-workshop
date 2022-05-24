package training.api.test.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import training.api.test.model.BodyExample;
import training.api.test.rest.dto.BodyExampleDto;

@Mapper
public interface BodyExampleMapper {

    BodyExampleMapper INSTANCE = Mappers.getMapper(BodyExampleMapper.class);

    BodyExample toDomain(BodyExampleDto bodyExampleDto);
    BodyExampleDto toDto(BodyExample bodyExample);
}
