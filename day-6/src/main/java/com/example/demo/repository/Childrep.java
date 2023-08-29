package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Child;

public interface Childrep extends JpaRepository<Child, Integer>{

}

