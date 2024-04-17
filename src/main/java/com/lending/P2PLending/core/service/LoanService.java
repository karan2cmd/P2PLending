package com.lending.P2PLending.core.service;

import com.lending.P2PLending.core.port.in.ILoanService;
import com.lending.P2PLending.dto.CreateLoanOfferRequestDto;
import com.lending.P2PLending.dto.P2PRequestDto;
import com.lending.P2PLending.dto.P2PResponseDto;
import com.lending.P2PLending.dto.SearchLoanOfferRequestDto;

public class LoanService implements ILoanService {
    public P2PResponseDto<?> createLoanOffer(P2PRequestDto<CreateLoanOfferRequestDto> p2PRequestDto){
        return null;
    }

    @Override
    public P2PResponseDto<?> searchLoanOffer(P2PRequestDto<SearchLoanOfferRequestDto> p2PRequestDto) {
        return null;
    }
}
