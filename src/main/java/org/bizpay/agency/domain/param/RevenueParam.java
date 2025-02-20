package org.bizpay.agency.domain.param;

import lombok.Data;

@Data
public class RevenueParam {
    public String userId;
    public int startDt;
    public int endDt;
    public int startNo;
    public int endNo;
    public int dealerKind;
    private String type;
}
