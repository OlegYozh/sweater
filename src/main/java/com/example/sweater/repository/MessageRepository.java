package com.example.sweater.repository;

import com.example.sweater.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface MessageRepository extends CrudRepository<Message,Long> {

    List<Message> findByTag(String tag);
}
