package com.example.studyspring;


import com.example.studyspring.other.two.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudySpringApplication.class)
public class StudySpringApplicationTests {


    @Test
    public void contextLoads() {
        Transaction transaction = new Transaction() {
            protected boolean isExpired() {
                return true;
            }
        };
        System.out.println(transaction.checkExpired());
    }

    @Test
    public void test1() throws UnknownHostException {
        String hostName = InetAddress.getLocalHost().getHostName();
        System.out.println(hostName);
    }



}
