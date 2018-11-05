package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {

    @RequestMapping("dictionary")
    public String dictionary(@RequestParam String inputword, Model model) {
        String word = "";
        if (inputword.equals("apple")) {
            word = "Qua tao";
        } else if (inputword.equals("book")) {
            word = "Quyen sach";
        } else if (inputword.equals("phone")) {
            word = "Dien thoai";
        } else word = "Tu khong co trong du lieu!";

        model.addAttribute("word", word);
        return "index";
    }
}
