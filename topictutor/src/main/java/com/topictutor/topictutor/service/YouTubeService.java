package com.topictutor.topictutor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class YouTubeService {

    @Value("${youtube.api.key}")
    private String apiKey;

    private final String YOUTUBE_API_URL = "https://www.googleapis.com/youtube/v3/search";

    public List<String> getVideoLinks(String query) {
        RestTemplate restTemplate = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(YOUTUBE_API_URL)
                .queryParam("part", "snippet")
                .queryParam("q", query)
                .queryParam("key", apiKey)
                .queryParam("maxResults", 3)
                .queryParam("type", "video")
                .queryParam("videoEmbeddable", "true")   // ✅ Only embeddable videos
                .queryParam("videoSyndicated", "true")   // ✅ Only videos allowed for web embedding
                .queryParam("safeSearch", "strict");     // ✅ Family-safe results only

        Map<String, Object> response = restTemplate.getForObject(builder.toUriString(), Map.class);

        List<String> videoLinks = new ArrayList<>();

        if (response != null && response.containsKey("items")) {
            List<Map<String, Object>> items = (List<Map<String, Object>>) response.get("items");

            for (Map<String, Object> item : items) {
                Map<String, Object> id = (Map<String, Object>) item.get("id");
                if (id != null && id.get("videoId") != null) {
                    String videoId = (String) id.get("videoId");
                    videoLinks.add("https://www.youtube.com/watch?v=" + videoId);
                }
            }
        }

        return videoLinks;
    }
}
