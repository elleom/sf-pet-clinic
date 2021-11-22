package com.elleo.sfpetclinic.controller;

import com.elleo.sfpetclinic.model.Vet;
import com.elleo.sfpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder){
        dataBinder.setDisallowedFields("id");
    }

    @GetMapping({"/vets.html", "/vets"})
    public String listVets(Model model){

        model.addAttribute("vets", vetService.findAll() );

        return "vets/index";
    }

    @GetMapping("/api/vets")
    public @ResponseBody
    Set<Vet> getVetsJson(){

        return vetService.findAll();
    }
}
