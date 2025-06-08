package com.oneurl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.oneurl.models.UrlMapping;

@Repository
public interface UrlRepository extends JpaRepository<UrlMapping, Long> {
	UrlMapping findByShortUrl(String shortUrl);
}

