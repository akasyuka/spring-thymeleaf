package com.example.springtemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ApiController {


    @Autowired
    AboutFormRepository aboutFormRepository;

    @GetMapping("/info")
    public List<AboutForm> info() {
        return  aboutFormRepository.findAll();
    }


    @PostMapping("/saveAboutForm")
    @ResponseBody
    public String saveAboutForm(@RequestBody Map<String, String> payload) {
        AboutForm o = new AboutForm();
        o.setId(null);
        o.setName(payload.get("name"));
        o.setInst(payload.get("inst"));
        o.setAbout(payload.get("about"));
        aboutFormRepository.save(o);
        return "Запись успешно сохранена";
    }
}
