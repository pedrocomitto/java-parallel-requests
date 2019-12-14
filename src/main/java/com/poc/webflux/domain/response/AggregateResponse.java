package com.poc.webflux.domain.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AggregateResponse {

    private String title;

    private String body;

    private String username;

    private String email;
}
