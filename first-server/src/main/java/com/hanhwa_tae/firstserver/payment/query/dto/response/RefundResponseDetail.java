package com.hanhwa_tae.firstserver.payment.query.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class RefundResponseDetail {

    private final List<RefundResponse> refunds;
}
