package com.tron.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin
@Controller
@RequestMapping("coin/v1/")
public class TronController {

    @Autowired
    HttpServletRequest httpServletRequest;

    /**
     * 获取新的地址
     * @param coin
     * @return
     */
    @GetMapping("getNewAddress")
    public @ResponseBody String getNewAddress(String coin) {



        return "coin-xxxxxxxxxxxxxx";
    }
}
