package com.files.filetables;

import org.mapstruct.*;

@Mapper(componentModel = "spring"/*, imports = Collectors.class*/)
public abstract class AudioMapper {


    public abstract AudioResponse toDto(Audio audio);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    public abstract void update(@MappingTarget Audio audio, AudioResponse request);

}
