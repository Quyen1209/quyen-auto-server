package com.vti.quyenauto.service;

import com.vti.quyenauto.dto.AccessoryDto;
import com.vti.quyenauto.form.AccessoryCreateForm;
import com.vti.quyenauto.form.AccessoryUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccessoryService {
    Page<AccessoryDto> findAll (Pageable pageable);

    AccessoryDto create(AccessoryCreateForm form);

    AccessoryDto update (Long id, AccessoryUpdateForm form);

    void deleteById(Long id);

}
