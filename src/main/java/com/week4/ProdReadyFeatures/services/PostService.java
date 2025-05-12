package com.week4.ProdReadyFeatures.services;

import com.week4.ProdReadyFeatures.dto.PostDTO;

import java.util.List;
import java.util.Map;

public interface PostService {
    PostDTO createNewPost(PostDTO inputPost);

    List<PostDTO> getAllPost();

    PostDTO getPostById(Long id);

    PostDTO updatePostById(Long id, Map<String, Object> updatedVal);
}
