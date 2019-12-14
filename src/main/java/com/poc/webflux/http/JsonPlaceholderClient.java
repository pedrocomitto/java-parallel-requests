package com.poc.webflux.http;

import com.poc.webflux.domain.response.PostResponse;
import com.poc.webflux.domain.response.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "json-placeholder-client", url = "${json-placeholder-client.url}")
public interface JsonPlaceholderClient {

    @GetMapping("posts/{id}")
    PostResponse retrievePost(@PathVariable Integer id);

    @GetMapping("users/{id}")
    UserResponse retrieveUser(@PathVariable Integer id);
}
