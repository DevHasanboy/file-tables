package com.files.filetables;
import io.micrometer.common.util.StringUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AudioValidation {

    public List<ErrorDto> validate(AudioRequest request) {
        List<ErrorDto> errors = new ArrayList<>();

        if (StringUtils.isBlank(request.getPath())) {
            errors.add(new ErrorDto("path", "path Cannot be null or empty"));
        }
        return errors;
    }
}
