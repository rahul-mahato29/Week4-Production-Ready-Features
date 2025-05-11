package com.week4.ProdReadyFeatures.services;

import com.week4.ProdReadyFeatures.dto.PostDTO;

import java.util.List;

public interface PostService {
    PostDTO createNewPost(PostDTO inputPost);
    List<PostDTO> getAllPost();
}
