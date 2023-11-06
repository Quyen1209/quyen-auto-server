package com.vti.quyenauto.controller;

import com.vti.quyenauto.dto.AccessoryDto;
import com.vti.quyenauto.form.AccessoryCreateForm;
import com.vti.quyenauto.form.AccessoryUpdateForm;
import com.vti.quyenauto.service.AccessoryService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Validated
public class AccessoryController {
    private final AccessoryService accessoryService;

    @GetMapping("/api/v1/accessories")
    public Page<AccessoryDto> findAll (Pageable pageable) {
        return accessoryService.findAll(pageable);
    }

    @PostMapping("/api/v1/accessories")
    @ResponseStatus(HttpStatus.CREATED)
    public AccessoryDto create(@RequestBody @Validated AccessoryCreateForm form) {
        return accessoryService.create(form);
    }

    @PutMapping("/api/v1/accessories/{id}")
    public AccessoryDto update(@PathVariable("id") Long id,@RequestBody @Valid AccessoryUpdateForm form) {
        return accessoryService.update(id,form);
    }

    @DeleteMapping("/api/v1/accessories/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable("id") Long id) {
        accessoryService.deleteById(id);

    }
}
