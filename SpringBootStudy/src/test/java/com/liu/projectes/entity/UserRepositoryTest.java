package com.liu.projectes.entity;

import com.liu.projectes.ApplicationTests;
import com.liu.projectes.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryTest extends ApplicationTests{
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindOne(){

      User user=  userRepository.findOne(1L);
        Assert.assertEquals("wali",user.getName());
    }
}
