package com.javan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.javan.dao.CommentMapper;
import com.javan.entity.Comment;
import com.javan.entity.Product;
import com.javan.service.CommentService;
import com.javan.util.PageResult;


@Service
@Transactional
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentMapper commentMapper;
	
	@Override
	public PageResult<Comment> searchComment(Comment comment, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<Comment> page = commentMapper.searchComment(comment);
		PageResult<Comment> pageResult = new PageResult<Comment>(page.getTotal(), page.getResult());
		return pageResult;
		
	}

}
