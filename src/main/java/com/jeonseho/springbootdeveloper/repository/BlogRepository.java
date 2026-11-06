package com.jeonseho.springbootdeveloper.repository;

import com.jeonseho.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
