package com.javan.service;

import com.javan.entity.Comment;
import com.javan.util.PageResult;

public interface CommentService {

	//��ҳ��ѯ
		PageResult<Comment> searchComment(Comment comment,Integer pageNum,Integer pageSize);

}
