package com.fyle.fyleFullStack.service;

import com.fyle.fyleFullStack.model.LessBankDetails;
import com.fyle.fyleFullStack.repository.BankDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class BankDetailsService {
    @Autowired
    private BankDetailsRepo bankDetailsRepo;

    public List<LessBankDetails> searchBranch(String branch, Integer limit, Integer offset) {
        return this.bankDetailsRepo.findByBranch(branch, limit, offset).stream().map(bankDetails ->
           new LessBankDetails(bankDetails.getIfsc(), bankDetails.getBank_id(), bankDetails.getBranch(),bankDetails.getAddress(), bankDetails.getCity(), bankDetails.getDistrict(), bankDetails.getState_name())
        ).collect(Collectors.toList());
    }

    public List<LessBankDetails> searchByTerm(String search, Integer limit, Integer offset) {
        return this.bankDetailsRepo.findBySearchTerm(search, limit, offset).stream().map(bankDetails ->
                new LessBankDetails(bankDetails.getIfsc(), bankDetails.getBank_id(), bankDetails.getBranch(),bankDetails.getAddress(), bankDetails.getCity(), bankDetails.getDistrict(), bankDetails.getState_name())
        ).collect(Collectors.toList());
    }
}