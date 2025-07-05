package com.ssm.service;

import com.ssm.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public interface UserService {


    List<User> list();
}
