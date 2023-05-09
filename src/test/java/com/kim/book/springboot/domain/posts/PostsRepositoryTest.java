package com.kim.book.springboot.domain.posts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostsRepositoryTest {
    @Autowired
    PostsRepository postsRepository;

    @AfterEach
    public void 초기화() {
        postsRepository.deleteAll();
    }


    @Test
    public void 저장되는지() {
        Posts posts = Posts.builder()
                .title("a title")
                .content("a content")
                .author("author")
                .build();
        postsRepository.save(posts); // 값을 DB에 집어넣음

        List<Posts> all = postsRepository.findAll(); // 값을 들고옴

        assertEquals(all.get(0).getTitle(), "a title"); // 오른쪽이 기대값 이게 맞다면 정상동작함
    }

}