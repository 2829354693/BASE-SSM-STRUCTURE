package com.yc.mapper;

import com.yc.model.BlogAndUserCustom;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogAndUserCustomMapper {
    List<BlogAndUserCustom> getTenBlogAndUser() throws Exception;

    List<BlogAndUserCustom> getTenBlogAndUserByType(String type) throws Exception;

    List<BlogAndUserCustom> getAllBlogByUserId(Integer userId) throws Exception;
}
