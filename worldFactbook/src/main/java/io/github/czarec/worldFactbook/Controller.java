package io.github.czarec.worldFactbook;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value="/factbook")
class ControllerClass {

  // should reroute to a new page, I should make a 404 error page on my website
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public ModelAndView index() {
    return new ModelAndView("redirect:" + "https://czar-ec.github.io");
  }

  @RequestMapping(value = "/status")
  public String statusCheck() {
    return "Online";
  }
}