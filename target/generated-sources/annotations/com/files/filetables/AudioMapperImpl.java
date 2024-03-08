package com.files.filetables;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-07T23:24:05+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class AudioMapperImpl extends AudioMapper {

    @Override
    public AudioResponse toDto(Audio audio) {
        if ( audio == null ) {
            return null;
        }

        AudioResponse.AudioResponseBuilder audioResponse = AudioResponse.builder();

        audioResponse.id( audio.getId() );
        audioResponse.path( audio.getPath() );
        audioResponse.createdAt( audio.getCreatedAt() );
        audioResponse.updatedAt( audio.getUpdatedAt() );
        audioResponse.deletedAt( audio.getDeletedAt() );

        return audioResponse.build();
    }

    @Override
    public void update(Audio audio, AudioResponse request) {
        if ( request == null ) {
            return;
        }

        if ( request.getId() != null ) {
            audio.setId( request.getId() );
        }
        if ( request.getPath() != null ) {
            audio.setPath( request.getPath() );
        }
        if ( request.getCreatedAt() != null ) {
            audio.setCreatedAt( request.getCreatedAt() );
        }
        if ( request.getUpdatedAt() != null ) {
            audio.setUpdatedAt( request.getUpdatedAt() );
        }
        if ( request.getDeletedAt() != null ) {
            audio.setDeletedAt( request.getDeletedAt() );
        }
    }
}
