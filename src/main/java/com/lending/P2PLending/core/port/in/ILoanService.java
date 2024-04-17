package com.lending.P2PLending.core.port.in;

import com.lending.P2PLending.dto.CreateLoanOfferRequestDto;
import com.lending.P2PLending.dto.P2PRequestDto;
import com.lending.P2PLending.dto.P2PResponseDto;
import com.lending.P2PLending.dto.SearchLoanOfferRequestDto;

public interface ILoanService {
    P2PResponseDto<?> createLoanOffer(P2PRequestDto<CreateLoanOfferRequestDto> p2PRequestDto);

    P2PResponseDto<?> searchLoanOffer(P2PRequestDto<SearchLoanOfferRequestDto> p2PRequestDto);
}
