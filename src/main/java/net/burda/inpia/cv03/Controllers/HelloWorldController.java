package net.burda.inpia.cv03.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

  @GetMapping("/")
  @ResponseBody
  public String SayHello() {
    return "<html>"
        + "<head>"
        + "<link rel=\"stylesheet\" href=\"/style.css\">"
        + "</head>"
        + "<body><strong>Hello world</strong></body></html>";
  }
}
