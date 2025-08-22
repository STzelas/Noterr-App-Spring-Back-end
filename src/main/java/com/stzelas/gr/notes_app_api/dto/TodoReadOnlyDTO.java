package com.stzelas.gr.notes_app_api.dto;

import com.stzelas.gr.notes_app_api.core.enums.Importance;

public record TodoReadOnlyDTO(
        Long id,
        String description,
        Importance importance,
        Boolean isComplete
) {
}
