package com.lyc.rpc.controller;

import org.springframework.stereotype.Component;

import com.lyc.rpc.People;
import com.lyc.rpc.SpeakInterface;

import javax.annotation.Resource;

/**
 * Created by version_z on 2015/8/23.
 */
@Component("peopleController")
public class PeopleController
{
    @Resource
    private SpeakInterface speakInterface;

    public String getSpeak(Integer age,Integer sex)
    {
        People people = new People();
        people.setAge(age);
        people.setSex(sex);
        return speakInterface.speak(people);
    }
}
