package com.frank.service.impl;

import com.frank.entity.Blog;
import com.frank.mapper.BlogMapper;
import com.frank.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author frank
 * @since 2020-06-20
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
