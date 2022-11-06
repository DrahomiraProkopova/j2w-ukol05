package cz.czechitas.java2webapps.ukol5.controller;

import cz.czechitas.java2webapps.ukol5.bean.RegistraceForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Kontroler obsluhující registraci účastníků dětského tábora.
 */
@Controller
public class RegistraceController {

  @GetMapping("")
  public Object formular() {
    ModelAndView modelAndView = new ModelAndView("/formular");
    modelAndView.addObject("form", new RegistraceForm());
    return modelAndView;
  }

  @PostMapping("/turnus")
  public Object turnus(@Valid @ModelAttribute("form") RegistraceForm registraceForm, BindingResult bindingResult) {

    if (bindingResult.hasErrors()) {
      return "/formular";
    }

    int vek = vypoctiVek(registraceForm);
    if (vek < 9 || vek > 15) {
      bindingResult.rejectValue("datumNarozeni", "error.form","věk mezi 9 a 15 roky (včetně)");
      return "/formular";
    }
    return new ModelAndView("/rekapitulace");
  }

  private static int vypoctiVek(RegistraceForm registraceForm) {
    String datumNarozeni = registraceForm.getDatumNarozeni();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.u");
    LocalDate datumNarozeniDate = LocalDate.parse(datumNarozeni, formatter);
    Period period = datumNarozeniDate.until(LocalDate.now());
    int vek = period.getYears();
    return vek;
  }

}
