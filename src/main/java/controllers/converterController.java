package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class converterController {
    @GetMapping("/convert")
    public String converter(){
        return "convert";
    }
    @PostMapping("/result")
    public String getResult(@RequestParam int usd,@RequestParam int rate, Model model){
        model.addAttribute("usd",usd);
        model.addAttribute("rate",rate);
        model.addAttribute("vnd",usd*rate);
        return "result";
    }
}
