package com.oneurl.service;

import com.oneurl.models.UrlMapping;
import com.oneurl.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UrlService {

    @Autowired
    private UrlRepository repository;

    public UrlMapping createShortUrl(String originalUrl) {
        String shortCode = UUID.randomUUID().toString().substring(0, 6);
        UrlMapping mapping = new UrlMapping();
        mapping.setOriginalUrl(originalUrl);
        mapping.setShortUrl(shortCode);
        return repository.save(mapping);
    }

    public UrlMapping getOriginalUrl(String shortUrl) {
        return repository.findByShortUrl(shortUrl);
    }
}


