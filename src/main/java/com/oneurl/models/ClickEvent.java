package com.oneurl.models;

import java.time.LocalDateTime;
import jakarta.persistence.*;

public class ClickEvent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "url_mapping_id")
	private UrlMapping urlMapping;
	private LocalDateTime clickedAt;
}
