package com.lending.P2PLending.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lending.P2PLending.Enums.Collateral;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateLoanOfferRequestDto {
    Double loanAmount;
    Double minOffer;
    Double roi;
    Integer maxRepaymentTime;
    Collateral collateral;
}
