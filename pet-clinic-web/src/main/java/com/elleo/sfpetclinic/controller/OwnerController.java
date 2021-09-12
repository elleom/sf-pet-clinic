package com.elleo.sfpetclinic.controller;

import com.elleo.sfpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/find", "/find/index", "/find/index.html"})
    public String ownerIndex(Model model){

        model.addAttribute("owners", ownerService.findAll());
        
        return "owners/index";
    }
}
