package security.practice.securityspring.controller;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import security.practice.securityspring.domain.WeatherRepository;

@RequiredArgsConstructor
@Controller // view를 리턴하겠다. < MVC 패턴!
public class IndexController {
    private final WeatherRepository weatherRepository;

    // localhost:L8080/
    @GetMapping({ "/", "" })
    public String index(@RequestParam(defaultValue = "0") Integer page, Model model) {
        PageRequest pq = PageRequest.of(page, 16);
        model.addAttribute("weatherInfo", weatherRepository.findAll(pq));
        return "/weather";
    }
}
