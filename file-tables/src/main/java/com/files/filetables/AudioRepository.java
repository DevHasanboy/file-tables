package com.files.filetables;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AudioRepository extends JpaRepository<Audio,Integer> {

    Optional<Audio> findByIdAndDeletedAtIsNull(Integer id);

    @Query(
            nativeQuery = true,
            value = "select *from audio"
    )
    List<Audio> findAllByAudioDeletedAtisNull();
}

