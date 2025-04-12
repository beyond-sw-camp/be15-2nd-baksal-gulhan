package com.hanhwa_tae.gulhan.common.dto;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Pagination {
    private final int currentPage;
    private final int totalPage;
    private final int totalSize;
    private final long totalPosts;
    private final long totalPlaces;
    private final int size;
}
