package com.lending.P2PLending.controller;


import com.lending.P2PLending.core.port.in.ILoanService;
import com.lending.P2PLending.dto.CreateLoanOfferRequestDto;
import com.lending.P2PLending.dto.P2PRequestDto;
import com.lending.P2PLending.dto.P2PResponseDto;
import com.lending.P2PLending.dto.SearchLoanOfferRequestDto;
import com.lending.P2PLending.entity.User;
import com.lending.P2PLending.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/")
public class Controller {
    @Autowired
    private UserDao userDao;

    @Autowired
    private ILoanService loanService;

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userDao.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userDao.findAll();
    }

    @PostMapping(path = "/create-loan-offer")
    public @ResponseBody ResponseEntity<P2PResponseDto<?>> createLoanOffer(@RequestBody P2PRequestDto<CreateLoanOfferRequestDto> p2PRequestDto) {
        P2PResponseDto<?> responseDto = loanService.createLoanOffer(p2PRequestDto);
        HttpStatus status = responseDto.getSuccess() ? HttpStatus.OK : HttpStatus.BAD_REQUEST;
        return ResponseEntity.status(status).body(responseDto);
    }

    @PostMapping(path = "/search-loan-offer")
    public @ResponseBody ResponseEntity<P2PResponseDto<?>> searchLoanOffer(@RequestBody P2PRequestDto<SearchLoanOfferRequestDto> p2PRequestDto) {
        P2PResponseDto<?> responseDto = loanService.searchLoanOffer(p2PRequestDto);
        HttpStatus status = responseDto.getSuccess() ? HttpStatus.OK : HttpStatus.BAD_REQUEST;
        return ResponseEntity.status(status).body(responseDto);
    }
}