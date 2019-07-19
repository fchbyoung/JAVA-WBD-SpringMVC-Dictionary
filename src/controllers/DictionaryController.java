package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/dictionary", method = RequestMethod.POST)
    public ModelAndView findWord(@RequestParam String englishWord, Model model) {
        ModelAndView modelAndView = new ModelAndView("dictionary");
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "xin chào");
        dictionary.put("bye", "tạm biệt");
        dictionary.put("thank you", "cảm ơn");

        String vietnameseWord = dictionary.get(englishWord);
        if (vietnameseWord != null) {
            model.addAttribute("englishWord", englishWord);
            model.addAttribute("vietnameseWord", vietnameseWord);
        } else {
            vietnameseWord = "Not found";
            model.addAttribute("englishWord", englishWord);
            model.addAttribute("vietnameseWord", vietnameseWord);
        }

        return modelAndView;
    }
}
