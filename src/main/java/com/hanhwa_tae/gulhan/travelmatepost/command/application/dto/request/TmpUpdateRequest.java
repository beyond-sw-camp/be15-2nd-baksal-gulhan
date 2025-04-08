package com.hanhwa_tae.gulhan.travelmatepost.command.application.dto.request;

import jakarta.persistence.EntityListeners;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@RequiredArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class TmpUpdateRequest {

    @NotBlank(message = "제목을 입력하세요")
    private final String title;
    @NotBlank(message = "내용을 입력하세요.")
    private final String content;

    private final String isDeleted;

}
