package com.oneurl.controller;

import com.oneurl.models.UrlMapping;
import com.oneurl.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UrlController {

    @Autowired
    private UrlService urlService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/shorten")
    public String shorten(@RequestParam String originalUrl, Model model) {
        UrlMapping mapping = urlService.createShortUrl(originalUrl);
        model.addAttribute("shortUrl", mapping.getShortUrl());
        return "result";
    }

    @GetMapping("/{shortUrl}")
    public String redirect(@PathVariable String shortUrl) {
        UrlMapping mapping = urlService.getOriginalUrl(shortUrl);
        return "redirect:" + mapping.getOriginalUrl();
    }
}


