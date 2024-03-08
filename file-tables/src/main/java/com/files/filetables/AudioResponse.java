package com.files.filetables;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AudioResponse {
    private Integer id;
    @NotBlank
    private String path;
    private byte[] data;
    private String type;
    private Double height;
    private Double width;
    private Double length;
    private Double weight;


    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}

