package com.example.fashionblog.Service;

import com.example.fashionblog.Model.ApiResponse;
import com.example.fashionblog.Model.CommentLikesRequest;

public interface CommentLikesService {
    ApiResponse<String> likeComment(CommentLikesRequest commentLikesRequest);
    ApiResponse<String> unLikeComment(CommentLikesRequest commentLikesRequest);
}
