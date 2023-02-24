package com.spy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Scope("prototype")
//@Scope("session")

//Forcing explicit package scanning:
//@Component
public class SpyGirl {

    public String iSaySomething() {
        return "Sziasztok Lányok, Fiúk!";
    }
}
