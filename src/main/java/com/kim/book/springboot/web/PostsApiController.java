package com.kim.book.springboot.web;

import com.kim.book.springboot.services.PostsService;
import com.kim.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
public class PostsApiController {
    private final PostsService postsService; // 상수화

    @PostMapping("/api/v1/posts")
    @ResponseBody
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }


}
