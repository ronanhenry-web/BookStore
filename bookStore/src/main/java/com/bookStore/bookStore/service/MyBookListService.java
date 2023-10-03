package com.bookStore.bookStore.service;

import com.bookStore.bookStore.entity.MyBookList;
import com.bookStore.bookStore.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {

    @Autowired
    private MyBookRepository mybook;
    public void saveMyBooks(MyBookList book) {
    mybook.save(book);
    }

    public List<MyBookList> getAllMyBooks() {
        return mybook.findAll();
    }

    public void deletebyId(int id) {
        mybook.deleteById(id);
    }
}
