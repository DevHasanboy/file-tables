package com.files.filetables;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AudioRequest {
    private Integer id;
    private String path;
    private Double height;
    private Double width;
    private Double length;
    private Double weight;



}
