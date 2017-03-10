package com.crudappgroup.repository;

import com.crudappgroup.model.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Razon on 09-Mar-17.
 */
public interface PostRepository extends CrudRepository <Post, Long>{

}
