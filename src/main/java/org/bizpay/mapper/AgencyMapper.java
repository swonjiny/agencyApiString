package org.bizpay.mapper;

import java.util.List;

import org.bizpay.common.domain.AgencySalesParam;
import org.bizpay.domain.AgencySales;
import org.bizpay.domain.AgencySales2;

//대리점별매출
public interface AgencyMapper {	
	// 대리점별 매출수익
	public List<AgencySales> summaryInfo(AgencySalesParam param) throws Exception;
	// 추천수수료 수익
	public List<AgencySales2> summaryInfo2(AgencySalesParam param) throws Exception;
	// 가맹비 수익
}
