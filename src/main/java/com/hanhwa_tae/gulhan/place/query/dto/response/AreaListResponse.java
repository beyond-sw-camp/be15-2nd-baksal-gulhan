package com.hanhwa_tae.gulhan.place.query.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class AreaListResponse {
    private final List<AreaDto> areas;
}
