package com.fyle.fyleFullStack.controller;

import com.fyle.fyleFullStack.model.LessBankDetails;
import com.fyle.fyleFullStack.service.BankDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class BankDetailsController {
    @Autowired
    private BankDetailsService bankDetailsService;

    @GetMapping("/branches/autocomplete")
    public List<LessBankDetails> searchBranch(@RequestParam String q, @RequestParam Integer limit, @RequestParam Integer offset) {
        return bankDetailsService.searchBranch(q.toUpperCase(), limit, offset);
    }

    @GetMapping("/branches")
    public List<LessBankDetails> searchAny(@RequestParam String q, @RequestParam Integer limit, @RequestParam Integer offset) {
        return bankDetailsService.searchByTerm(q.toUpperCase(), limit, offset);
    }
}
