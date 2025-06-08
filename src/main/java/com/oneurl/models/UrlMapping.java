package com.oneurl.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UrlMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String originalUrl;
    private String shortUrl;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOriginalUrl() {
		return originalUrl;
	}
	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
}

