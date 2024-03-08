package com.files.filetables;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("audio")
public class AudioController {

    private final AudioService audioService;

    @PostMapping("/upload")
    public ResponseDto<AudioResponse> upload(@RequestBody MultipartFile file) {
        return this.audioService.upload(file);
    }

    @GetMapping("/download")
    public ResponseDto<AudioResponse> download(@RequestParam(value = "id") Integer id) {
        return this.audioService.download(id);
    }

    @PutMapping("/update")
    public ResponseDto<AudioResponse> update(@RequestBody MultipartFile file, @RequestParam(value = "id") Integer id) {
        return this.audioService.update(file, id);
    }

    @DeleteMapping("/delete")
   public ResponseDto<AudioResponse> delete(@RequestParam(value = "id") Integer id) {
        return this.audioService.delete(id);
    }

    @GetMapping("/get-all")
    public ResponseDto<List<AudioResponse>> getAll(){
        return this.audioService.getAll();
    }

}

